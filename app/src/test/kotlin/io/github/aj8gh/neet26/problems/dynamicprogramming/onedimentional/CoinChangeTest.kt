package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class CoinChangeTest : FunSpec({

  val casesFn = {
    listOf(
      Triple(intArrayOf(1, 2, 3, 5), 0, 0),
      Triple(intArrayOf(1, 2, 3, 5), 2, 1),
      Triple(intArrayOf(2), 3, -1),
      Triple(intArrayOf(1), 1, 1),
      Triple(intArrayOf(1), 2, 2),
      Triple(intArrayOf(1, 2), 3, 2),
      Triple(intArrayOf(1, 3, 5), 1, 1),
      Triple(intArrayOf(2), 2, 1),
      Triple(intArrayOf(3), 2, -1),
      Triple(intArrayOf(2), 5, -1),
      Triple(intArrayOf(1, 5, 10), 12, 3),
      Triple(intArrayOf(2, 5, 10), 6, 3),
      Triple(intArrayOf(2, 5, 10), 8, 4),
      Triple(intArrayOf(2, 4, 10), 17, -1),
      Triple(intArrayOf(1, 2, 5, 10), 8, 3),
      Triple(intArrayOf(1, 2, 5, 10), 9, 3),
      Triple(intArrayOf(1, 2, 5, 10), 10, 1),
      Triple(intArrayOf(1, 2, 5, 10), 4, 2),
      Triple(intArrayOf(1, 5, 10), 4, 4),
    )
  }

  withTests(casesFn()) { (coins, amount, expected) ->
    coinChange(coins, amount) shouldBe expected
  }
})
