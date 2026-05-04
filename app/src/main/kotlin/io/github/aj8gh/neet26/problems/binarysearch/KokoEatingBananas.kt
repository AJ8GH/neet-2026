package io.github.aj8gh.neet26.problems.binarysearch

import kotlin.Int.Companion.MAX_VALUE

fun minEatingSpeed(piles: IntArray, h: Int): Int {
  var minK = MAX_VALUE
  var lowerBound = 1
  var upperBound = piles.maxOrNull()!!
  while (lowerBound <= upperBound) {
    val k = (upperBound - lowerBound) / 2 + lowerBound
    if (canEatAll(piles, h, k)) {
      minK = k
      upperBound = k - 1
    } else {
      lowerBound = k + 1
    }
  }

  return minK
}

fun canEatAll(piles: IntArray, h: Int, k: Int): Boolean {
  var hours = h
  for (p in piles) {
    hours -= (p + k - 1) / k
    if (hours < 0) return false
  }
  return true
}
