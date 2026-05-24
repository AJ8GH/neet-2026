package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun isSameTreeRecursive(p: TreeNode<Int>?, q: TreeNode<Int>?): Boolean =
  when {
    p == null && q == null -> true
    p?.value != q?.value -> false
    else -> isSameTreeRecursive(p?.left, q?.left)
        && isSameTreeRecursive(p?.right, q?.right)
  }

fun isSameTreeDfs(p: TreeNode<Int>?, q: TreeNode<Int>?): Boolean {
  val nodes = ArrayDeque(listOf(Pair(p, q)))
  while (nodes.isNotEmpty()) {
    val (left, right) = nodes.removeLast()
    if (left?.value != right?.value) return false
    if (left != null) {
      nodes.addLast(Pair(left.left, right?.left))
      nodes.addLast(Pair(left.right, right?.right))
    }
  }
  return true
}

fun isSameTreeBfs(p: TreeNode<Int>?, q: TreeNode<Int>?): Boolean {
  val nodes = ArrayDeque(listOf(Pair(p, q)))
  while (nodes.isNotEmpty()) {
    val (left, right) = nodes.removeFirst()
    if (left?.value != right?.value) return false
    if (left != null) {
      nodes.addLast(Pair(left.left, right?.left))
      nodes.addLast(Pair(left.right, right?.right))
    }
  }
  return true
}
