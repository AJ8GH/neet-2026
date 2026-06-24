package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode

fun isValidBST(root: TreeNode<Int>?): Boolean {
  root ?: return true
  return isValidBST(root.left, null, root.value)
      && isValidBST(root.right, root.value, null)
}

private fun isValidBST(
  root: TreeNode<Int>?,
  leftParent: Int?,
  rightParent: Int?,
): Boolean {
  root ?: return true

  if (leftParent != null && leftParent >= root.value) return false
  if (rightParent != null && rightParent <= root.value) return false

  val rightParentForLeft = rightParent?.let { minOf(root.value, it) } ?: root.value
  val leftParentForRight = leftParent?.let { maxOf(root.value, it) } ?: root.value

  return isValidBST(root.left, leftParent, rightParentForLeft)
      && isValidBST(root.right, leftParentForRight, rightParent)
}
