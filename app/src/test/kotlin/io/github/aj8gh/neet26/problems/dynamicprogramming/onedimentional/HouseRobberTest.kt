package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class HouseRobberTest : FunSpec({
  val casesFn = {
    listOf(
      Pair(intArrayOf(5, 1, 1, 5), 10),
      Pair(intArrayOf(0, 1, 9, 0, 1, 9), 18),
      Pair(intArrayOf(1, 1, 3, 3), 4),
      Pair(intArrayOf(2, 9, 8, 3, 6), 16),
      Pair(intArrayOf(0), 0),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    robNonMutating(input) shouldBe expected
  }

  withTests(casesFn()) { (input, expected) ->
    rob(input) shouldBe expected
  }
})
