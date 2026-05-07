package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class SearchInRotatedSortedArrayTest : FunSpec({
  withTests(
    Triple(intArrayOf(3, 4, 5, 6, 1, 2), 1, 4),
    Triple(intArrayOf(3, 5, 6, 0, 1, 2), 4, -1)
  ) { (nums, target, expected) ->
    SearchInRotatedSortedArray()
      .search(nums, target) shouldBe expected
  }
})
