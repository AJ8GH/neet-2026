package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

fun climbStairs(n: Int): Int {
  val cache = IntArray(n + 1) { -1 }
  return climbStairs(n, cache)
}

private fun climbStairs(n: Int, cache: IntArray): Int =
  when (n) {
    1 -> 1
    2 -> 2
    else -> {
      if (cache[n] < 0) cache[n] = climbStairs(n - 1, cache) + climbStairs(n - 2, cache)
      cache[n]
    }
  }

fun climbStairsUpward(n: Int): Int {
  var first = 0
  var result = 1
  repeat(n) {
    val tmp = result
    result += first
    first = tmp
  }
  return result
}
