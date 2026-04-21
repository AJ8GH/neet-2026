package io.github.aj8gh.neet26.problems.twopointers

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ContainerWithMostWaterTest : FunSpec({
  withTests(
    Pair(intArrayOf(1, 7, 2, 5, 4, 7, 3, 6), 36),
    Pair(intArrayOf(2, 2, 2), 4),
  ) { (input, expected) ->
    maxArea(input) shouldBe expected
  }
})
