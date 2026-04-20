package io.github.aj8gh.neet26.problems.twopointers

fun twoSum(numbers: IntArray, target: Int): IntArray {
  var i = 0
  var j = numbers.lastIndex
  while (i < j) {
    val sum = numbers[i] + numbers[j]
    when {
      sum < target -> i++
      sum > target -> j--
      else -> return intArrayOf(i + 1, j + 1)
    }
  }
  error("No solution")
}
