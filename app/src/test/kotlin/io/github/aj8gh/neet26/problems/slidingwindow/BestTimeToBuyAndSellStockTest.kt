package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class BestTimeToBuyAndSellStockTest : FunSpec({
  withTests(
    Pair(intArrayOf(10, 1, 5, 6, 7, 1), 6),
    Pair(intArrayOf(10, 8, 7, 5, 2), 0),
    Pair(intArrayOf(7, 1, 5, 3, 6, 4), 5),
    Pair(intArrayOf(5, 3, 4, 2, 6), 4),
    Pair(intArrayOf(3, 2, 6, 1, 4), 4),
  ) { (input, expected) ->
    maxProfit(input) shouldBe expected
  }
})
