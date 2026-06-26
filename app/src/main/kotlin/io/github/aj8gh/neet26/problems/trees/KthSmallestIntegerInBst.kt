package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun kthSmallest(root: TreeNode<Int>?, k: Int): Int {
  val nodes = ArrayDeque<TreeNode<Int>>()
  queueAllLeft(root, nodes)
  var i = 1
  while (nodes.isNotEmpty()) {
    val n = nodes.removeLast()
    if (i == k) return n.value
    queueAllLeft(n.right, nodes)
    i++
  }
  error("Not found")
}

private fun queueAllLeft(n: TreeNode<Int>?, q: ArrayDeque<TreeNode<Int>>) {
  var current = n
  while (current != null) {
    q.addLast(current)
    current = current.left
  }
}
