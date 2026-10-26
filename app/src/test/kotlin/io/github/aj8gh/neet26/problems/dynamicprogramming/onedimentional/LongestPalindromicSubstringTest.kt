package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LongestPalindromicSubstringTest : FunSpec({

  val casesFn = {
    listOf(
      Pair("ababd", "bab"),
      Pair("abbc", "bb"),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    longestPalindrome(input) shouldBe expected
  }
})
