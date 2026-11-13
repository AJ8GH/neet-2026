package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class MaximumProductSubarrayTest : FunSpec({
  val casesFn = {
    listOf(
      Pair(intArrayOf(2, 4, -3, 5), 8),
      Pair(intArrayOf(-3, 0, -2), 0),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    maxProduct(input) shouldBe expected
  }
})
