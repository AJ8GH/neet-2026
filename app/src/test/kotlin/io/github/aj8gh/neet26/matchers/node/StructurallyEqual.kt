package io.github.aj8gh.neet26.matchers.node

import io.github.aj8gh.neet26.model.Node
import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import java.util.IdentityHashMap
import kotlin.collections.ArrayDeque

fun <T : Comparable<T>> beStructurallyEqual(expected: Node<T>?) =
  Matcher<Node<T>?> { actual ->
    var success = true
    val actNodes = ArrayDeque(listOf(actual))
    val expNodes = ArrayDeque(listOf(expected))
    val visited = IdentityHashMap<Node<T>, Boolean>()

    outer@ while (actNodes.isNotEmpty() && expNodes.isNotEmpty()) {
      val act = actNodes.removeFirst()
      val exp = expNodes.removeFirst()
      if (act == null && exp == null) break
      if (act == null || exp == null) {
        success = false
        break
      }

      if (act.value != exp.value) {
        success = false
        break
      }

      if (act.neighbors.size != exp.neighbors.size) {
        success = false
        break
      }

      for ((i, n) in act.neighbors.withIndex()) {
        if (n.value != exp.neighbors[i].value) {
          success = false
          break@outer
        }

        if (n !in visited) {
          actNodes.addLast(n)
          expNodes.addLast(exp.neighbors[i])
        }
      }

      visited[act] = true
    }

    MatcherResult(
      success,
      { "expected actual: $actual to be structurally equal to expected: $expected" },
      { "expected actual: $actual to not be structurally equal to expected: $expected" },
    )
  }
