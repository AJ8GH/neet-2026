package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ClimbStairsTest : FunSpec({
  val casesFn = {
    listOf(
      Pair(1, 1),
      Pair(2, 2),
      Pair(3, 3),
      Pair(4, 5),
      Pair(5, 8),
      Pair(6, 13),
      Pair(7, 21),
      Pair(8, 34),
      Pair(45, 1836311903),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    climbStairsUpward(input) shouldBe expected
  }

  withTests(casesFn()) { (input, expected) ->
    climbStairs(input) shouldBe expected
  }
})
