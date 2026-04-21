package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LongestConsecutiveSequenceTest : FunSpec({
  withTests(
    Pair(intArrayOf(2, 20, 4, 10, 3, 4, 5), 4),
    Pair(intArrayOf(0, 3, 2, 5, 4, 6, 1, 1), 7),
    Pair(intArrayOf(), 0),
  ) { (input, expected) ->
    longestConsecutive(input) shouldBe expected
  }
})
