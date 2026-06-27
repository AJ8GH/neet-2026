package io.github.aj8gh.neet26.problems.graphs

fun numIslands(grid: Array<CharArray>): Int {
  var islands = 0
  for (i in grid.indices) {
    for (j in grid[0].indices) {
      if (grid[i][j] == '1') {
        islands++
        explore(grid, i, j)
      }
    }
  }
  return islands
}

private fun explore(grid: Array<CharArray>, i: Int, j: Int) {
  if (grid[i][j] == '0') return
  grid[i][j] = '0'
  if (i < grid.size - 1) explore(grid, i + 1, j)
  if (i > 0) explore(grid, i - 1, j)
  if (j < grid[i].size - 1) explore(grid, i, j + 1)
  if (j > 0) explore(grid, i, j - 1)
}

fun numIslandsIterative(grid: Array<CharArray>): Int {
  var count = 0
  for (i in grid.indices) {
    for (j in grid[0].indices) {
      if (grid[i][j] == '1') {
        count++
        explore(grid, Pair(i, j))
      }
    }
  }
  return count
}

private fun explore(grid: Array<CharArray>, point: Pair<Int, Int>) {
  val stack = ArrayDeque(listOf(point))
  while (stack.isNotEmpty()) {
    val (i, j) = stack.removeFirst()
    grid[i][j] = '0'
    if (i < grid.size - 1 && grid[i + 1][j] == '1') stack.add(Pair(i + 1, j))
    if (i > 0 && grid[i - 1][j] == '1') stack.add(Pair(i - 1, j))
    if (j < grid[i].size - 1 && grid[i][j + 1] == '1') stack.add(Pair(i, j + 1))
    if (j > 0 && grid[i][j - 1] == '1') stack.add(Pair(i, j - 1))
  }
}

fun numIslandsIterativeWithEncoding(grid: Array<CharArray>): Int {
  var count = 0
  for (i in grid.indices) {
    for (j in grid[0].indices) {
      if (grid[i][j] == '1') {
        count++
        explore(grid, i * grid[i].size + j)
      }
    }
  }
  return count
}

private fun explore(grid: Array<CharArray>, point: Int) {
  val stack = ArrayDeque(listOf(point))
  while (stack.isNotEmpty()) {
    val p = stack.removeFirst()
    val cols = grid[0].size
    val i = p / cols
    val j = p % cols
    grid[i][j] = '0'
    if (i < grid.size - 1 && grid[i + 1][j] == '1') stack.add((i + 1) * cols + j)
    if (i > 0 && grid[i - 1][j] == '1') stack.add((i - 1) * cols + j)
    if (j < cols - 1 && grid[i][j + 1] == '1') stack.add(i * cols + j + 1)
    if (j > 0 && grid[i][j - 1] == '1') stack.add(i * cols + j - 1)
  }
}
