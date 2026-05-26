package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.kotest.core.Tuple4
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class LowestCommonAncestorInBinarySearchTreeTest : FunSpec({
  withTests(
    Tuple4(
      binaryTreeOf(5, 3, 8, 1, 4, 7, 9, null, 2),
      binaryTreeOf(3, 1, 4, 2),
      binaryTreeOf(8, 7, 9),
      binaryTreeOf(5, 3, 8, 1, 4, 7, 9, null, 2),
    ),
    Tuple4(
      binaryTreeOf(5, 3, 8, 1, 4, 7, 9, null, 2),
      binaryTreeOf(3, 1, 4, 2),
      binaryTreeOf(4),
      binaryTreeOf(3, 1, 4, 2),
    ),
  ) { (root, p, q, expected) ->
    lowestCommonAncestor(root, p, q) shouldEqual expected
  }
})
