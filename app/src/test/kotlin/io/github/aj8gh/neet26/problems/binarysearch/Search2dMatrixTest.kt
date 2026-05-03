package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class Search2dMatrixTest : FunSpec({
  withTests(
    Triple(
      arrayOf(intArrayOf(1, 2, 4, 8), intArrayOf(10, 11, 12, 13), intArrayOf(14, 20, 30, 40)),
      10,
      true
    ),
    Triple(
      arrayOf(intArrayOf(1, 2, 4, 8), intArrayOf(10, 11, 12, 13), intArrayOf(14, 20, 30, 40)),
      15,
      false
    ),
  ) { (matrix, target, expected) ->
    searchMatrix(matrix, target) shouldBe expected
  }
})
