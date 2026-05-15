package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.emptyLinkedList
import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class ReverseLinkedListTest : FunSpec({
  withTests(
    Pair(linkedListOf(0, 1, 2, 3), linkedListOf(3, 2, 1, 0)),
    Pair(emptyLinkedList<Int>(), emptyLinkedList<Int>()),
  ) { (input, expected) ->
    reverseList(input) shouldEqual expected
  }

  withTests(
    Pair(linkedListOf(0, 1, 2, 3), linkedListOf(3, 2, 1, 0)),
    Pair(emptyLinkedList<Int>(), emptyLinkedList<Int>()),
  ) { (input, expected) ->
    reverseListRecursive(input) shouldEqual expected
  }
})
