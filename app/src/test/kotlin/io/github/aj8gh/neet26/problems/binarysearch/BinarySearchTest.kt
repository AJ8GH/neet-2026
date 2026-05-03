package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class BinarySearchTest : FunSpec({
  withTests(
    Triple(intArrayOf(5), -5, -1),
    Triple(intArrayOf(5), 5, 0),
    Triple(intArrayOf(-1, 0, 2, 4, 6, 8), 3, -1),
    Triple(intArrayOf(-1, 0, 2, 4, 6, 8), 4, 3),
  ) { (nums, target, expected) ->
    search(nums, target) shouldBe expected
  }
})
