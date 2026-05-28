package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun lowestCommonAncestorRecursive(
  root: TreeNode<Int>,
  p: TreeNode<Int>,
  q: TreeNode<Int>,
): TreeNode<Int> = when {
  root.value in p.value..(q.value) -> root
  root.value in q.value..(p.value) -> root
  p.value < root.value -> lowestCommonAncestor(root.left!!, p, q)
  else -> lowestCommonAncestor(root.right!!, p, q)
}

fun lowestCommonAncestor(
  root: TreeNode<Int>,
  p: TreeNode<Int>,
  q: TreeNode<Int>,
): TreeNode<Int> {
  var current = root
  while (true) {
    current = when {
      current.value in p.value..(q.value) -> break
      current.value in q.value..(p.value) -> break
      p.value < current.value -> current.left!!
      else -> current.right!!
    }
  }
  return current
}
