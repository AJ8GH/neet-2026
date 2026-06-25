package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.TreeNode
import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE

fun isValidBST(root: TreeNode<Int>?): Boolean {
  root ?: return true
  return isValidBST(root.left, MIN_VALUE, root.value)
      && isValidBST(root.right, root.value, MAX_VALUE)
}

private fun isValidBST(
  root: TreeNode<Int>?,
  minBound: Int,
  maxBound: Int,
): Boolean = when {
  root == null -> true
  minBound >= root.value -> false
  maxBound <= root.value -> false
  else -> isValidBST(root.left, minBound, root.value)
      && isValidBST(root.right, root.value, maxBound)
}
