package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class SubtreeOfAnotherTreeTest : FunSpec({
  withTests(
    Triple(binaryTreeOf(1, 1), binaryTreeOf(1), true),
    Triple(binaryTreeOf(1, 2, 3, 4, 5, null, null, 6), binaryTreeOf(2, 4, 5), false),
    Triple(binaryTreeOf(1, 2, 3, 4, 5), binaryTreeOf(2, 4, 5), true),
  ) { (root, subRoot, expected) ->
    isSubtree(root, subRoot) shouldBe expected
  }
})
