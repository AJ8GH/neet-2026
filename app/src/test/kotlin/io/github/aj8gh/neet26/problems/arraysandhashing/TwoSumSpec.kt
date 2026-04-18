package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class TwoSumSpec : FunSpec({
  withTests(
    Triple(intArrayOf(3, 4, 5, 6), 7, intArrayOf(0, 1)),
    Triple(intArrayOf(4, 5, 6), 10, intArrayOf(0, 2)),
    Triple(intArrayOf(5, 5), 10, intArrayOf(0, 1)),
  ) { (nums, target, expected) ->
    twoSum(nums, target) shouldBe expected
  }
})
