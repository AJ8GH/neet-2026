package io.github.aj8gh.neet26.problems.graphs

fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
  val results = mutableListOf<List<Int>>()
  val found = mutableSetOf<Pair<Int, Int>>()

  for ((i, row) in heights.withIndex()) {
    for (j in row.indices) {
      val point = Pair(i, j)
      if (canFlow(point, heights, found, 'P') && canFlow(point, heights, found, 'A')) {
        found.add(point)
        results.add(listOf(point.first, point.second))
      }
    }
  }
  return results
}

private fun canFlow(
  point: Pair<Int, Int>,
  heights: Array<IntArray>,
  found: Set<Pair<Int, Int>>,
  ocean: Char,
): Boolean {
  val paths = ArrayDeque<Pair<Int, Int>>()
  val visited = mutableSetOf<Pair<Int, Int>>()
  queuePaths(point, paths, visited, heights)
  while (paths.isNotEmpty()) {
    val p = paths.removeFirst()
    visited.add(p)
    if (p in found) return true

    val (i, j) = p
    if (ocean == 'P' && (i == 0 || j == 0)) return true
    if (ocean == 'A' && (i == heights.lastIndex || j == heights[i].lastIndex)) return true
    queuePaths(Pair(i, j), paths, visited, heights)
  }
  return false
}

private fun queuePaths(
  point: Pair<Int, Int>,
  paths: ArrayDeque<Pair<Int, Int>>,
  visited: Set<Pair<Int, Int>>,
  heights: Array<IntArray>,
) {
  val (i, j) = point

  if (i > 0 && heights[i - 1][j] <= heights[i][j]) {
    val p = Pair(i - 1, j)
    if (p !in visited) paths.add(p)
  }

  if (j > 0 && heights[i][j - 1] <= heights[i][j]) {
    val p = Pair(i, j - 1)
    if (p !in visited) paths.add(p)
  }

  if (i < heights.lastIndex && heights[i + 1][j] <= heights[i][j]) {
    val p = Pair(i + 1, j)
    if (p !in visited) paths.add(p)
  }

  if (j < heights[i].lastIndex && heights[i][j + 1] <= heights[i][j]) {
    val p = Pair(i, j + 1)
    if (p !in visited) paths.add(p)
  }
}
