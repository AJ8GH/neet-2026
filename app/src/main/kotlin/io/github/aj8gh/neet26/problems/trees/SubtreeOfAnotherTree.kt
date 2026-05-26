package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun isSubtree(root: TreeNode<Int>?, subRoot: TreeNode<Int>?): Boolean {
  val nodes = ArrayDeque(listOfNotNull(root))
  while (nodes.isNotEmpty()) {
    val node = nodes.removeFirst()
    if (isEqual(node, subRoot)) return true
    node.left?.let { nodes.addLast(it) }
    node.right?.let { nodes.addLast(it) }
  }
  return false
}

private fun isEqual(node: TreeNode<Int>?, subRoot: TreeNode<Int>?): Boolean =
  when {
    node == null -> subRoot == null
    node.value != subRoot?.value -> false
    else -> isEqual(node.left, subRoot.left)
        && isEqual(node.right, subRoot.right)
  }
