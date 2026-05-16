package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.linkedListOf
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class LinkedListCycleDetectionTest : FunSpec({
  withData(
    nameFn = { "${it.first} shouldBe ${it.second}" },
    Pair(linkedListOf(1, 2, 3, 4).cycle(1), true),
    Pair(linkedListOf(1, 2).cycle(-1), false),
    Pair(linkedListOf(1, 2, 1).cycle(-1), false),
  ) { (input, expected) ->
    hasCycle(input) shouldBe expected
  }
})
