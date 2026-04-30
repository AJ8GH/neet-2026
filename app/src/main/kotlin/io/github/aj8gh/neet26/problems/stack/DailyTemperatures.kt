package io.github.aj8gh.neet26.problems.stack

fun dailyTemperatures(temperatures: IntArray): IntArray {
  val output = IntArray(temperatures.size)
  val stack = ArrayDeque<Pair<Int, Int>>()
  for ((i, temp) in temperatures.withIndex()) {
    while (stack.isNotEmpty() && stack.last().second < temp) {
      val last = stack.removeLast()
      output[last.first] = i - last.first
    }
    stack.add(i to temp)
  }
  return output
}
