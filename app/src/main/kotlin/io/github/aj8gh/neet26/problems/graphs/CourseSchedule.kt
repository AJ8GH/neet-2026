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

fun canFinishDfs(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
  val courseStates = IntArray(numCourses)
  val prereqsByCourse = mutableMapOf<Int, MutableList<Int>>()

  for (p in prerequisites) {
    prereqsByCourse.getOrPut(p.first()) { mutableListOf() }.add(p.last())
  }

  for (c in courseStates.indices) {
    if (!dfs(c, courseStates, prereqsByCourse)) return false
  }

  return true
}

private fun dfs(
  c: Int,
  courseStates: IntArray,
  prereqsByCourse: MutableMap<Int, MutableList<Int>>,
): Boolean {
  if (courseStates[c] == 2) return true
  if (courseStates[c] == 1) return false

  courseStates[c] = 1
  for (p in prereqsByCourse[c] ?: emptyList()) {
    if (!dfs(p, courseStates, prereqsByCourse)) return false
  }

  courseStates[c] = 2
  return true
}
