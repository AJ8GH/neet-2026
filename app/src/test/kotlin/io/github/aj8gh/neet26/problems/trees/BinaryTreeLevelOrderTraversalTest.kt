package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.github.aj8gh.neet26.model.emptyBinaryTree
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class BinaryTreeLevelOrderTraversalTest : FunSpec({
  withTests(
    Pair(
      binaryTreeOf(1, 2, 3, 4, 5, 6, 7),
      listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6, 7))
    ),
    Pair(binaryTreeOf(1), listOf(listOf(1))),
    Pair(emptyBinaryTree<Int>(), emptyList()),
  ) { (input, expected) ->
    levelOrder(input) shouldEqual expected
  }
})
