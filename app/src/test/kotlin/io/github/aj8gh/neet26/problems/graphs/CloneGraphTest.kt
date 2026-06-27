package io.github.aj8gh.neet26.problems.graphs

import io.github.aj8gh.neet26.model.nodeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual
import io.kotest.matchers.shouldNotBe

class CloneGraphTest : FunSpec({
  withTests(
    Pair(
      nodeOf(listOf(2), listOf(1, 3), listOf(2)),
      nodeOf(listOf(2), listOf(1, 3), listOf(2))
    ),
    Pair(
      nodeOf(listOf(2), listOf(1, 3), listOf(2)),
      nodeOf(listOf(2), listOf(1, 3), listOf(2))
    ),
  ) { (input, expected) ->
    cloneGraph(input).let {
      it shouldEqual expected
      it shouldEqual input
      it shouldNotBe input
    }
  }
})
