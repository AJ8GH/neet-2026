package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class HouseRobberTest : FunSpec({
  val casesFn = {
    listOf(
      Pair(intArrayOf(1, 1, 3, 3), 4),
      Pair(intArrayOf(2, 9, 8, 3, 6), 16),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    rob(input) shouldBe expected
  }
})
