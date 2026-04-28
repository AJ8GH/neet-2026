package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.collections.shouldContainExactly

class SlidingWindowMaximumTest : FunSpec({
  withTests(
    Triple(intArrayOf(3, 2, 5, 1, 0, 0), 3, intArrayOf(5, 5, 5, 1)),
    Triple(intArrayOf(-7, -8, 7, 5, 7, 1, 6, 0), 4, intArrayOf(7, 7, 7, 7, 7)),
    Triple(intArrayOf(1, -1), 1, intArrayOf(1, -1)),
    Triple(intArrayOf(1, 2, 1, 0, 4, 2, 6), 3, intArrayOf(2, 2, 4, 4, 6)),
    Triple(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3, intArrayOf(3, 3, 5, 5, 6, 7)),
    Triple(intArrayOf(9, 10, 9, -7, -4, -8, 2, -6), 5, intArrayOf(10, 10, 9, 2)),
  ) { (nums, k, expected) ->
    maxSlidingWindow(nums, k) shouldContainExactly expected
  }
})
