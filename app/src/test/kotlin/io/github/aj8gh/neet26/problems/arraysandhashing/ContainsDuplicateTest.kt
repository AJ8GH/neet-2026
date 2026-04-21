package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ContainsDuplicateTest : FunSpec({
  withTests(
    Pair(intArrayOf(1, 2, 3, 3), true),
    Pair(intArrayOf(1, 2, 3, 4), false),
    Pair(intArrayOf(1, 2, 3, 4, 5, 1), true),
    Pair(intArrayOf(1, 3, 2, 5, 4, 0), false),
    Pair(intArrayOf(1, 3, 2, 5, 4, 0, 8, 2, 4), true),
  ) { (input, expected) ->
    hasDuplicate(input) shouldBe expected
  }
})
