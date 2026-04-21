package io.github.aj8gh.neet26.problems.twopointers

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.collections.shouldContainExactly

class TwoIntegerSumIITest : FunSpec({
  withTests(
    Triple(intArrayOf(1, 2, 3, 4), 3, intArrayOf(1, 2)),
    Triple(intArrayOf(3, 4, 5, 7, 9), 11, intArrayOf(2, 4)),
    Triple(intArrayOf(2, 5), 7, intArrayOf(1, 2)),
  ) { (numbers, target, expected) ->
    twoSum(numbers, target) shouldContainExactly expected
  }
})
