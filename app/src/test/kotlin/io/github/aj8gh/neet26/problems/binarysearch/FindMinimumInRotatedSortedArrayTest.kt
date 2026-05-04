package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class FindMinimumInRotatedSortedArrayTest : FunSpec({
  withTests(
    Pair(intArrayOf(3, 4, 5, 6, 1, 2), 1),
    Pair(intArrayOf(4, 5, 0, 1, 2, 3), 0),
    Pair(intArrayOf(4, 5, 6, 7), 4),
  ) { (input, expected) ->
    findMin(input) shouldBe expected
  }
})
