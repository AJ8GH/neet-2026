package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

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
    groupAnagrams(input) shouldBe expected
  }
})
