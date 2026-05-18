package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun invertTreeBfs(root: TreeNode<Int>?): TreeNode<Int>? {
  val nodes = ArrayDeque(listOfNotNull(root))
  while (nodes.isNotEmpty()) {
    val node = nodes.removeFirst()
    val left = node.left
    node.left = node.right
    node.right = left
    node.right?.let { nodes.addLast(it) }
    node.left?.let { nodes.addLast(it) }
  }
  return root
}

fun invertTreeRecursiveDfs(root: TreeNode<Int>?): TreeNode<Int>? {
  root ?: return root
  val left = invertTreeRecursiveDfs(root.left)
  root.left = invertTreeRecursiveDfs(root.right)
  root.right = left
  return root
}
