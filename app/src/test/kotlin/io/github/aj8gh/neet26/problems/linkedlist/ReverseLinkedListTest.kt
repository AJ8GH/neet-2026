package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.linkedListOf
import io.github.aj8gh.neet26.model.linkedListOfOrNull
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class ReverseLinkedListTest : FunSpec({
  withTests(
    Pair(linkedListOf(0, 1, 2, 3), linkedListOf(3, 2, 1, 0)),
    Pair(linkedListOfOrNull<Int>(), linkedListOfOrNull<Int>()),
  ) { (input, expected) ->
    reverseList(input) shouldEqual expected
  }
})
