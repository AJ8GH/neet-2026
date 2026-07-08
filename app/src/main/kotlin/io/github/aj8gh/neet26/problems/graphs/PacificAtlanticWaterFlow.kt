package io.github.aj8gh.neet26.problems.graphs

fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
  val pacificNodes = ArrayDeque(heights.first().indices.map { listOf(0, it) })
  (1..heights.lastIndex).forEach { pacificNodes.addLast(listOf(it, 0)) }

  val atlanticNodes = ArrayDeque((0..<heights.last().lastIndex).map { listOf(heights.lastIndex, it) })
  heights.indices.forEach { atlanticNodes.addLast(listOf(it, heights[it].lastIndex)) }

  val pacificCells = canFlow(heights, pacificNodes)
  val atlanticCells = canFlow(heights, atlanticNodes)
  return pacificCells.intersect(atlanticCells).toList()
}

private fun canFlow(
  heights: Array<IntArray>,
  nodes: ArrayDeque<List<Int>>,
): Set<List<Int>> {
  val visited = mutableSetOf<List<Int>>()
  while (nodes.isNotEmpty()) {
    val n = nodes.removeFirst()
    visited.add(n)
    queueNodes(n, nodes, visited, heights)
  }
  return visited
}

private fun queueNodes(
  node: List<Int>,
  nodes: ArrayDeque<List<Int>>,
  visited: MutableSet<List<Int>>,
  heights: Array<IntArray>,
) {
  queue(node, listOf(node.first() - 1, node.last()), heights, visited, nodes)
  queue(node, listOf(node.first() + 1, node.last()), heights, visited, nodes)
  queue(node, listOf(node.first(), node.last() - 1), heights, visited, nodes)
  queue(node, listOf(node.first(), node.last() + 1), heights, visited, nodes)
}

private fun queue(
  n1: List<Int>,
  n2: List<Int>,
  heights: Array<IntArray>,
  visited: MutableSet<List<Int>>,
  nodes: ArrayDeque<List<Int>>,
) {
  if (n2 in visited) return
  val (i, j) = n1
  val (i2, j2) = n2
  if (i2 < 0 || j2 < 0 || i2 > heights.lastIndex || j2 > heights[i2].lastIndex) {
    return
  }

  if (heights[i2][j2] >= heights[i][j]) {
    visited.add(n2)
    nodes.add(n2)
  }
}
