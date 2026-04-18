package io.github.aj8gh.neet26.problems.arraysandhashing

fun twoSum(nums: IntArray, target: Int): IntArray {
  val needed = mutableMapOf<Int, Int>()
  for (i in nums.indices) {
    needed[nums[i]]?.let { return intArrayOf(it, i) }
    needed[target - nums[i]] = i
  }
  error("No solution")
}
