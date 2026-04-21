package io.github.aj8gh.neet26.problems.twopointers

fun maxArea(heights: IntArray): Int {
  var i = 0
  var j = heights.lastIndex
  var maxArea = 0
  while (i < j) {
    val area = minOf(heights[i], heights[j]) * (j - i)
    maxArea = maxOf(maxArea, area)
    if (heights[i] < heights[j]) i++
    else j--
  }
  return maxArea
}
