package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LinkedListCycleDetectionTest : FunSpec({
  withTests(
    Triple(linkedListOf(1, 2, 3, 4), 1, true),
    Triple(linkedListOf(1, 2), -1, false),
  ) { (head, index, expected) ->
    hasCycle(head) shouldBe expected
  }
})
