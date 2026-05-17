package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.emptyLinkedList
import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class RemoveNthNodeFromEndOfListTest : FunSpec({
  withTests(
    Triple(linkedListOf(1, 2, 3, 4), 2, linkedListOf(1, 2, 4)),
    Triple(linkedListOf(5), 1, emptyLinkedList<Int>()),
    Triple(linkedListOf(1, 2), 2, linkedListOf(1)),
  ) { (head, n, expected) ->
    removeNthFromEnd(head, n) shouldBe expected
  }
})
