package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import kotlin.Int.Companion.MAX_VALUE

fun coinChange(coins: IntArray, amount: Int): Int {
  val minCoinsPerAmount = IntArray(amount + 1)
  for (i in 1..amount) {
    var minCoins = MAX_VALUE
    for (coin in coins) {
      if (coin > i) continue
      val coinsRequired = minCoinsPerAmount[i - coin]
      if (coinsRequired != -1) minCoins = minOf(minCoins, coinsRequired + 1)
    }
    minCoinsPerAmount[i] = if (minCoins != MAX_VALUE) minCoins else -1
  }
  return minCoinsPerAmount.last()
}
