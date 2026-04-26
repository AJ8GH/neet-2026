package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldBeEqual

class SlidingWindowMaximumTest : FunSpec({
  withTests(
    Triple(intArrayOf(1, 2, 1, 0, 4, 2, 6), 3, intArrayOf(2, 2, 4, 4, 6)),
    Triple(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3, intArrayOf(3, 3, 5, 5, 6, 7)),
  ) { (nums, k, expected) ->
    maxSlidingWindow(nums, k) shouldBeEqual expected
  }
})
