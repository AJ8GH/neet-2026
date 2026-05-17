package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.annotation.Ignored
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

@Ignored
class MedianOfTwoSortedArraysTest : FunSpec({
  withTests(
    Triple(intArrayOf(1, 2), intArrayOf(3), 2.0),
    Triple(intArrayOf(1, 3), intArrayOf(2, 4), 2.5),
  ) { (nums1, nums2, expected) ->
    findMedianSortedArrays(nums1, nums2) shouldBe expected
  }
})
