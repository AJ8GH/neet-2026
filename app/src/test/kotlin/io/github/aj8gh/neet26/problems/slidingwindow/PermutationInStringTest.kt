package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class PermutationInStringTest : FunSpec({
  withTests(
    Triple("abc", "lecabee", true),
    Triple("abc", "lecaabee", false),
  ) { (s1, s2, expected) ->
    checkInclusion(s1, s2) shouldBe expected
  }
})
