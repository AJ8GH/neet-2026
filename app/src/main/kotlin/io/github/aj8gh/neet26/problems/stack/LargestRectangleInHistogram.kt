package io.github.aj8gh.neet26.problems.stack

import javax.swing.Spring.height

/*

7 *   *
6 *   *
5 *   *
4 *   *     *
3 *   *     *
2 *   * * * *
1 * * * * * *

  7,1,7,2,2,4 -> 8

  7 1 7 2 2 4
  7 7 7 7 7 8

  go back to first n >= current
  max area == max of (prev max , (i - j) * current)

 */
fun largestRectangleArea(heights: IntArray): Int {
  var max = 0
  for ((i, h) in heights.withIndex()) {

  }

  return max
}
