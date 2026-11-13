package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

fun climbStairs2(stairs: Int): Int {
  var previous = 0
  var current = 1
  repeat(stairs) {
    val tmp = current
    current += previous
    previous = tmp
  }
  return current
}
