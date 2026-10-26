package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

fun rob(nums: IntArray): Int {
  var best = nums.first()
  for (i in 2..nums.lastIndex) {
    nums[i] = best + nums[i]
    best = maxOf(best, nums[i - 1])
  }
  return maxOf(best, nums.last())
}

fun robNonMutating(nums: IntArray): Int {
  if (nums.size == 1) return nums.first()

  var twoBack = nums[0]
  var oneBack = maxOf(twoBack, nums[1])

  for (i in 2..nums.lastIndex) {
    twoBack += nums[i]
    val tmp = twoBack
    twoBack = oneBack
    oneBack = maxOf(tmp, oneBack)
  }
  return oneBack
}
