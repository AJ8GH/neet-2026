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

  val parents = IntArray(n) { it }
  for (e in edges) {
    val parent1 = find(e.first(), parents)
    val parent2 = find(e.last(), parents)
    if (parent1 == parent2) return false
    parents[parent1] = parent2
  }

  return true
}

fun validTreeConnectedComponents(n: Int, edges: Array<IntArray>): Boolean {
  if (edges.size != n - 1) return false

  val parents = IntArray(n) { it }
  var groups = n

  for (e in edges) {
    val p1 = find(e.first(), parents)
    val p2 = find(e.last(), parents)
    if (p1 != p2) {
      groups--
      parents[p1] = p2
    }
  }
  return groups == 1
}

private fun find(i: Int, parents: IntArray): Int {
  var current = i
  while (current != parents[current]) {
    current = parents[current]
  }
  val root = current

  current = i
  while (current != root) {
    val next = parents[current]
    parents[current] = root
    current = next
  }

  return root
}
