package io.github.aj8gh.neet26.problems.twopointers

fun threeSum(nums: IntArray): List<List<Int>> {
  nums.sort()
  val triples = mutableListOf<List<Int>>()

  for (i in nums.indices) {
    if (i > 0 && nums[i] == nums[i - 1]) continue
    var j = i + 1
    var k = nums.lastIndex

    while (j < k) {
      val kVal = nums[k]
      val iVal = nums[i]
      val jVal = nums[j]
      val sum = iVal + jVal + kVal

      if (sum > 0) k--
      if (sum < 0) j++
      if (sum == 0) {
        triples.add(listOf(iVal, jVal, kVal))
        j++
        k--
        while (k > j && nums[k] == nums[k + 1]) k--
        while (j < k && nums[j] == nums[j - 1]) j++
      }
    }
  }

  return triples
}
