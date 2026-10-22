package io.github.aj8gh.neet26.problems.graphs

import java.util.*

fun validTree(n: Int, edges: Array<IntArray>): Boolean {
  if (edges.size != n - 1) return false
  if (edges.isEmpty()) return true

  val edgeMap = mutableMapOf<Int, MutableSet<Int>>()
  for (e in edges) {
    edgeMap.getOrPut(e.first()) { mutableSetOf() }.add(e.last())
    edgeMap.getOrPut(e.last()) { mutableSetOf() }.add(e.first())
  }

  val toVisit = ArrayDeque<Int>()
  toVisit.add(edges.first().first())
  val visited = mutableSetOf<Int>()
  while (toVisit.isNotEmpty()) {
    val current = toVisit.removeFirst()
    visited.add(current)
    for (e in edgeMap[current] ?: emptySet()) {
      if (!visited.contains(e)) {
        toVisit.addLast(e)
      }
    }
  }

  return visited.size == n
}

fun validTreeUnionFind(n: Int, edges: Array<IntArray>): Boolean {
  if (edges.size != n - 1) return false

  val parents = (0 until n).toList().toIntArray()
  for (e in edges) {
    val parent1 = find(e.first(), parents)
    val parent2 = find(e.last(), parents)
    if (parent1 == parent2) return false
    parents[parent1] = parent2
  }

  return true
}

private fun find(i: Int, parents: IntArray): Int {
  var current = i
  while (current != parents[current]) {
    current = parents[current]
  }
  val root = current

  current = i
  while (current != root) {
    val parent = parents[current]
    parents[current] = root
    current = parent
  }

  return root
}
