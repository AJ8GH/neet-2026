package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ValidBinarySearchTreeTest : FunSpec({
  withTests(
    Pair(binaryTreeOf(2, 1, 3), true),
    Pair(binaryTreeOf(1, 2, 3), false),
  ) { (input, expected) ->
    isValidBST(input) shouldBe expected
  }
})
