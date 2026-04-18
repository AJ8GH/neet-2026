package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ProductsOfArrayExceptSelfSpec : FunSpec({
  withTests(
    Pair(intArrayOf(1, 2, 4, 6), intArrayOf(48, 24, 12, 8)),
    Pair(intArrayOf(-1, 0, 1, 2, 3), intArrayOf(0, -6, 0, 0, 0)),
  ) { (input, expected) ->
    productExceptSelf(input) shouldBe expected
  }
})
