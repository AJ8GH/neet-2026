package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class PalindromicSubstringsTest : FunSpec({

  val casesFn = {
    listOf(
      Pair("abc", 3),
      Pair("aaa", 6),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    countSubstrings(input) shouldBe expected
  }
})
