package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LongestRepeatingCharacterReplacementTest : FunSpec({
  withTests(
    Triple("XYYX", 2, 4),
    Triple("AAABABB", 1, 5),
  ) { (string, k, expected) ->
    characterReplacement(string, k) shouldBe expected
  }
})
