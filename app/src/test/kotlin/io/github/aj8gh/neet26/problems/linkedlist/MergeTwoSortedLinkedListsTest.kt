package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.emptyLinkedList
import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.Tuple3
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class MergeTwoSortedLinkedListsTest : FunSpec({
  withTests(
    Tuple3(linkedListOf(1, 2, 4), linkedListOf(1, 3, 5), linkedListOf(1, 1, 2, 3, 4, 5)),
    Tuple3(emptyLinkedList(), linkedListOf(1, 2), linkedListOf(1, 2)),
    Tuple3(emptyLinkedList<Int>(), emptyLinkedList<Int>(), emptyLinkedList<Int>()),
  ) { (list1, list2, expected) ->
    mergeTwoLists(list1, list2) shouldEqual expected
  }
})
