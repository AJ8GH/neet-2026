package io.github.aj8gh.neet26.problems.twopointers

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ValidPalindromeSpec : FunSpec({
  withTests(
    Pair("Was it a car or a cat I saw?", true),
    Pair("tab a cat", false),
  ) { (input, expected) ->
    isPalindrome(input) shouldBe expected
  }
})
