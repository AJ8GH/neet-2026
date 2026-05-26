package io.github.aj8gh.neet26.problems.trees

import io.github.aj8gh.neet26.model.binaryTreeOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class KthSmallestIntegerInBstTest : FunSpec({
  withTests(
    Triple(binaryTreeOf(2, 1, 3), 1, 1),
    Triple(binaryTreeOf(4, 3, 5, 2, null), 4, 5),
  ) { (root, k, expected) ->
    kthSmallest(root, k) shouldBe expected
  }
})
