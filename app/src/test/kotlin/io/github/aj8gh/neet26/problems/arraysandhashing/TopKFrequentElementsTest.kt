package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder

class TopKFrequentElementsTest : FunSpec({
  withTests(
    Triple(intArrayOf(1, 2, 2, 3, 3, 3), 2, intArrayOf(2, 3)),
    Triple(intArrayOf(7, 7), 1, intArrayOf(7)),
  ) { (nums, k, expected) ->
    topKFrequent(nums, k).toList() shouldContainExactlyInAnyOrder expected.toList()
  }
})
