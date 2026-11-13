package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class DecodeWaysTest : FunSpec({
  val casesFn = {
    listOf(
      Pair("123123", 9),
      Pair("1234213", 9),
      Pair("12101", 2),
      Pair("2101", 1),
      Pair("12", 2),
      Pair("01", 0),
      Pair("123", 3),
      Pair("1236", 3),
      Pair("1226", 5),
      Pair("1227", 3),
      Pair("06", 0),
      Pair("10", 1),
      Pair("100", 0),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    numDecodings(input) shouldBe expected
  }
})
