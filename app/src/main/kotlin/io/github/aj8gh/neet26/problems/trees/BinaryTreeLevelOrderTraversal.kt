package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun levelOrder(root: TreeNode<Int>?): List<List<Int>> {
  val levels = mutableListOf<List<Int>>()
  val nodes = ArrayDeque(listOfNotNull(root))
  while (nodes.isNotEmpty()) {
    val level = mutableListOf<Int>()
    repeat(nodes.size) {
      val node = nodes.removeFirst()
      level.add(node.value)
      node.left?.let { nodes.add(it) }
      node.right?.let { nodes.add(it) }
    }
    levels.add(level)
  }
  return levels
}
