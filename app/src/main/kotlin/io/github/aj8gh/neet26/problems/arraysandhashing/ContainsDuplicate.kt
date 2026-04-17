package io.github.aj8gh.neet26.problems.arraysandhashing

fun hasDuplicate(nums: IntArray): Boolean {
  val set = HashSet<Int>()
  for (i in nums) {
    if (!set.add(i)) {
      return true
    }
  }
  return false
}
