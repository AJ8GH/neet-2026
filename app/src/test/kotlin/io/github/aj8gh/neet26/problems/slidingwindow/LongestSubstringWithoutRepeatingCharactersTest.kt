package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LongestSubstringWithoutRepeatingCharactersTest : FunSpec({

  withTests(
    Pair("zxyzxyz", 3),
    Pair("xxxx", 1),
    Pair("abzxyzcg", 5),
    Pair("thequickbrownfoxjumpsoverthelazydogthequickbrownfoxjumpsovert", 17),
    Pair("abbba", 2),
  ) { (input, expected) ->
    lengthOfLongestSubstring(input) shouldBe expected
  }
})
