package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldEqual

class ReorderLinkedListTest : FunSpec({
  withTests(
    Pair(linkedListOf(2, 4, 6, 8), linkedListOf(2, 8, 4, 6)),
    Pair(linkedListOf(2, 4, 6, 8, 10), linkedListOf(2, 10, 4, 8, 6)),
  ) { (input, expected) ->
    reorderList(input)
    input shouldEqual expected
  }
})
