package io.github.aj8gh.neet26.problems.graphs

import io.github.aj8gh.neet26.matchers.node.beStructurallyEqual
import io.github.aj8gh.neet26.matchers.node.haveNoSharedRefs
import io.github.aj8gh.neet26.model.emptyNode
import io.github.aj8gh.neet26.model.nodeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.should

class CloneGraphTest : FunSpec({
  withTests(
    Pair(
      nodeOf(listOf(2, 3), listOf(1, 4), listOf(1, 4), listOf(2, 3)),
      nodeOf(listOf(2, 3), listOf(1, 4), listOf(1, 4), listOf(2, 3))
    ),
    Pair(
      nodeOf(listOf(2), listOf(1, 3), listOf(2)),
      nodeOf(listOf(2), listOf(1, 3), listOf(2))
    ),
    Pair(
      nodeOf(emptyList()),
      nodeOf(emptyList()),
    ),
    Pair(
      emptyNode(),
      emptyNode(),
    ),
  ) { (input, expected) ->
    cloneGraph(input).let {
      it should beStructurallyEqual(expected)
      it should haveNoSharedRefs(expected)
    }
  }
})
