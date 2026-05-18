package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.github.aj8gh.neet26.model.emptyBinaryTree
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class InvertBinaryTreeTest : FunSpec({
  val casesFn = {
    listOf(
      Pair(binaryTreeOf(1, 2, 3, 4, 5, 6, 7), binaryTreeOf(1, 3, 2, 7, 6, 5, 4)),
      Pair(binaryTreeOf(3, 2, 1), binaryTreeOf(3, 1, 2)),
      Pair(emptyBinaryTree<Int>(), emptyBinaryTree<Int>()),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    invertTreeBfs(input) shouldEqual expected
  }

  withTests(casesFn()) { (input, expected) ->
    invertTreeRecursiveDfs(input) shouldEqual expected
  }
})
