package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.collections.shouldHaveSize

class GroupAnagramsSpec : FunSpec({
  withTests(
    Pair(
      arrayOf("act", "pots", "tops", "cat", "stop", "hat"),
      listOf(listOf("hat"), listOf("act", "cat"), listOf("stop", "pots", "tops"))
    ),
    Pair(
      arrayOf("x"),
      listOf(listOf("x"))
    )
  ) { (input, expected) ->
    groupAnagrams(input).let {
      it shouldHaveSize expected.size
      val actualSorted = it.sortedBy { sl -> sl.size }
      val expectedSorted = expected.sortedBy { sl -> sl.size }
      for (i in actualSorted.indices) {
        actualSorted[i] shouldContainExactlyInAnyOrder expectedSorted[i]
      }
    }
  }
})
