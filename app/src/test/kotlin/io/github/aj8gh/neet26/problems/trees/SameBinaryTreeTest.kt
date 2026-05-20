package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class SameBinaryTreeTest : FunSpec({
  withTests(
    Triple(binaryTreeOf(1, 2, 3), binaryTreeOf(1, 2, 3), true),
    Triple(binaryTreeOf(4, 7), binaryTreeOf(4, null, 7), false),
  ) { (p, q, expected) ->
    isSameTree(p, q) shouldBe expected
  }
})
