package io.github.aj8gh.neet26.problems.graphs

fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
  val counts = IntArray(numCourses)
  val dependentsByPrereq = mutableMapOf<Int, MutableList<Int>>()
  val queue = ArrayDeque<Int>()

  for ((course, prereq) in prerequisites) {
    counts[course]++
    val list = dependentsByPrereq.getOrPut(prereq) { mutableListOf() }
    list.add(course)
  }

  for ((i, c) in counts.withIndex()) {
    if (c == 0) queue.addLast(i)
  }

  while (queue.isNotEmpty()) {
    val course = queue.removeFirst()
    val dependents = dependentsByPrereq[course] ?: emptyList()
    for (d in dependents) {
      counts[d]--
      if (counts[d] == 0) queue.add(d)
    }
  }
  return counts.all { it == 0 }
}
