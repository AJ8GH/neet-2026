package io.github.aj8gh.neet26.problems.binarysearch

fun findMin(nums: IntArray): Int {
  var lowerBound = 0
  var upperBound = nums.lastIndex
  while (lowerBound < upperBound) {
    val pivot = (upperBound - lowerBound) / 2 + lowerBound
    if (nums[pivot] > nums[upperBound]) lowerBound = pivot + 1
    else upperBound = pivot
  }
  return nums[lowerBound]
}
