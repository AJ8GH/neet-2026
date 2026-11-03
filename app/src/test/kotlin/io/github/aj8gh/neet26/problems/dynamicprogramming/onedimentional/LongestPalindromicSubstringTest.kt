package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.string.shouldMatch

class LongestPalindromicSubstringTest : FunSpec({

  val casesFn = {
    listOf(
      Pair("abb", "bb"),
      Pair("bba", "bb"),
      Pair("bb", "bb"),
      Pair("ababd", "bab|aba"),
      Pair("abbc", "bb"),
      Pair("eaabbaa", "aabbaa"),
      Pair("aabbaae", "aabbaa"),
      Pair("eaabcbaa", "aabcbaa"),
      Pair("aabcbaae", "aabcbaa"),
    )
  }

  withTests(casesFn()) { (input, expected) ->
    longestPalindrome(input) shouldMatch expected
  }
})
