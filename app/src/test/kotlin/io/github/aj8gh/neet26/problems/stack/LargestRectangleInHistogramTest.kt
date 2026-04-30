package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LargestRectangleInHistogramTest : FunSpec({
  withTests(
    Pair(intArrayOf(7, 1, 7, 2, 2, 4), 8),
    Pair(intArrayOf(1, 3, 7), 7),
  ) { (input, expected) ->
    largestRectangleArea(input) shouldBe expected
  }
})
