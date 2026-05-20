package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun maxDepthBfs(root: TreeNode<Int>?): Int {
  var depth = 0
  val nodes = ArrayDeque(listOfNotNull(root))
  while (nodes.isNotEmpty()) {
    for (i in 0..nodes.lastIndex) {
      val node = nodes.removeFirst()
      node.left?.let { nodes.addLast(it) }
      node.right?.let { nodes.addLast(it) }
    }
    depth++
  }
  return depth
}

fun maxDepthRecursive(root: TreeNode<Int>?): Int {
  root ?: return 0
  return 1 + maxOf(
    maxDepthRecursive(root.left),
    maxDepthRecursive(root.right)
  )
}
