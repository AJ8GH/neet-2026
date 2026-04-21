package io.github.aj8gh.neet26.problems.twopointers

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class TrappingRainWaterTest : FunSpec({
  withTests(
    Pair(intArrayOf(0, 2, 0, 3, 1, 0, 1, 3, 2, 1), 9),
    Pair(intArrayOf(6, 2, 0, 3, 1, 0, 1, 3, 2, 1), 11),
    Pair(intArrayOf(0, 2, 1, 0), 0),
    Pair(intArrayOf(0, 2, 0, 1), 1),
    Pair(intArrayOf(5, 2, 0, 4), 6),
    Pair(intArrayOf(4, 2, 0, 3, 2, 5), 9),
    Pair(intArrayOf(1, 0), 0),
    Pair(intArrayOf(2, 0, 2), 2),
  ) { (input, expected) ->
    trap(input) shouldBe expected
  }
})
