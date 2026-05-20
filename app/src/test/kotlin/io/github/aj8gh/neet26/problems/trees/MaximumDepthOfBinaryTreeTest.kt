package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.github.aj8gh.neet26.model.emptyBinaryTree
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class MaximumDepthOfBinaryTreeTest : FunSpec({
  val casesFn = {
    listOf(
      Pair(binaryTreeOf(1, 2, 3, null, null, 4), 3),
      Pair(emptyBinaryTree<Int>(), 0)
    )
  }

  withTests(casesFn()) { (input, expected) ->
    maxDepthBfs(input) shouldBe expected
  }

  withTests(casesFn()) { (input, expected) ->
    maxDepthRecursive(input) shouldBe expected
  }
})
