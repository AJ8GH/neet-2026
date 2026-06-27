package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest : FunSpec({
  withTests(
    Triple(
      intArrayOf(1, 2, 3, 4),
      intArrayOf(2, 1, 3, 4),
      binaryTreeOf(1, 2, 3, null, null, null, 4)
    ),
    Triple(
      intArrayOf(1, 2, 3, 4),
      intArrayOf(2, 1, 3, 4),
      binaryTreeOf(1, 2, 3, null, null, null, 4)
    ),
  ) { (preorder, inorder, expected) ->
    buildTree(preorder, inorder) shouldEqual expected
  }
})
