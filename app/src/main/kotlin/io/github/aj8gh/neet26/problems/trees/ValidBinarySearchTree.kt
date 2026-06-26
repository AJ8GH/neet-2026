package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode
import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE

fun isValidBstRecursive(root: TreeNode<Int>?): Boolean {
  root ?: return true
  return isValidBstRecursive(root.left, MIN_VALUE, root.value)
      && isValidBstRecursive(root.right, root.value, MAX_VALUE)
}

private fun isValidBstRecursive(
  root: TreeNode<Int>?,
  minBound: Int,
  maxBound: Int,
): Boolean = when {
  root == null -> true
  minBound >= root.value -> false
  maxBound <= root.value -> false
  else -> isValidBstRecursive(root.left, minBound, root.value)
      && isValidBstRecursive(root.right, root.value, maxBound)
}

fun isValidBstInOrderTraversal(root: TreeNode<Int>?): Boolean {
  val nodes = ArrayDeque<TreeNode<Int>>()
  var currentVal = MIN_VALUE
  queueLeft(root, nodes)

  while (nodes.isNotEmpty()) {
    val n = nodes.removeLast()
    if (currentVal >= n.value) return false
    currentVal = n.value
    queueLeft(n.right, nodes)
  }
  return true
}

private fun queueLeft(node: TreeNode<Int>?, nodes: ArrayDeque<TreeNode<Int>>) {
  var current = node
  while (current != null) {
    nodes.addLast(current)
    current = current.left
  }
}
