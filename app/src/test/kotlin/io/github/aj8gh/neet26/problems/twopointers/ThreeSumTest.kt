package io.github.aj8gh.neet26.problems.twopointers

import io.github.aj8gh.neet26.matchers.containExactlyInAnyOrderRecursive
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.should

class ThreeSumTest : FunSpec({
  withTests(
    Pair(intArrayOf(-1, 0, 1, 2, -1, -4), listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))),
    Pair(intArrayOf(0, 1, 1), listOf()),
    Pair(intArrayOf(0, 0, 0), listOf(listOf(0, 0, 0))),
    Pair(intArrayOf(-2, 0, 0, 2, 2), listOf(listOf(-2, 0, 2))),
  ) { (input, expected) ->
    threeSum(input) should containExactlyInAnyOrderRecursive(expected)
  }
})
