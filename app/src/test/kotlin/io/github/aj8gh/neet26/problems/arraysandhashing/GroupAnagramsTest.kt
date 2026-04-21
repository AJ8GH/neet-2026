package io.github.aj8gh.neet26.problems.arraysandhashing

import io.github.aj8gh.neet26.matchers.containExactlyInAnyOrderRecursive
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.should

class GroupAnagramsTest : FunSpec({
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
    groupAnagrams(input) should containExactlyInAnyOrderRecursive(expected)
  }
})
