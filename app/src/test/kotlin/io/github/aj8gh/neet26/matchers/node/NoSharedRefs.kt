package io.github.aj8gh.neet26.matchers.node

import io.github.aj8gh.neet26.model.Node
import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import java.util.IdentityHashMap
import kotlin.collections.ArrayDeque

fun <T : Comparable<T>> haveNoSharedRefs(expected: Node<T>?) =
  Matcher<Node<T>?> { actual ->
    var success = true
    val visited = IdentityHashMap<Node<T>, Boolean>()

    val actNodes = ArrayDeque(listOf(actual))
    while (actNodes.isNotEmpty()) {
      val act = actNodes.removeFirst()
      act ?: continue
      visited[act] = true
      for (n in act.neighbors) if (n !in visited) actNodes.addLast(n)
    }

    val expNodes = ArrayDeque(listOf(expected))
    while (expNodes.isNotEmpty()) {
      val exp = expNodes.removeFirst()
      exp ?: continue
      if (exp in visited) {
        success = false
        break
      }
      for (n in exp.neighbors) if (n in visited) {
        success = false
        break
      } else {
        expNodes.addLast(n)
      }
    }

    MatcherResult(
      success,
      { "expected actual: $actual to have no shared refs with expected: $expected" },
      { "expected actual: $actual to have at least one shared ref with expected: $expected" },
    )
  }
