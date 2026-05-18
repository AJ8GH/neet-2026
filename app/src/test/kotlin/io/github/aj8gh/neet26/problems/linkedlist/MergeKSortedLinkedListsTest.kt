package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode
import io.github.aj8gh.neet26.model.emptyLinkedList
import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class MergeKSortedLinkedListsTest : FunSpec({
  withTests(
    Pair(arrayOf(linkedListOf(1, 2, 4), linkedListOf(1, 3, 5)), linkedListOf(3, 6)),
    Pair(emptyArray<ListNode<Int>?>(), emptyLinkedList<Int>()),
    Pair(arrayOf(emptyLinkedList()), emptyLinkedList()),
  ) { (input, expected) ->
    mergeKLists(input) shouldEqual expected
  }
})
