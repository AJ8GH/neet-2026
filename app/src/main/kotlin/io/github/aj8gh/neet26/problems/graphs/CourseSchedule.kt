package io.github.aj8gh.neet26.problems.graphs

fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
  val prereqCount = IntArray(numCourses)
  val dependentsByPrereq = mutableMapOf<Int, MutableList<Int>>()
  val queue = ArrayDeque<Int>()

  for ((course, prereq) in prerequisites) {
    prereqCount[course]++
    dependentsByPrereq.getOrPut(prereq) { mutableListOf() }.add(course)
  }

  for ((i, c) in prereqCount.withIndex()) {
    if (c == 0) queue.addLast(i)
  }

  while (queue.isNotEmpty()) {
    dependentsByPrereq[queue.removeFirst()]?.forEach {
      prereqCount[it]--
      if (prereqCount[it] == 0) queue.add(it)
    }
  }

  return prereqCount.all { it == 0 }
}
