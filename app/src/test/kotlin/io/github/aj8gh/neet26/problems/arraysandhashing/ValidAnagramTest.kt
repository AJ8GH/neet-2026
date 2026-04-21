package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ValidAnagramTest : FunSpec({
  withTests(
    Triple("racecar", "carrace", true),
    Triple("jar", "jam", false),
    Triple("cavapoo", "oopavac", true),
    Triple("cavapoo", "cavapoo", true),
    Triple("cavapooo", "oopavac", false),
    Triple("cavapo", "oopavac", false),
    Triple("cavapoa", "oopavac", false),
    Triple("covapoa", "oopavac", true),
  ) { (s, t, expected) ->
    isAnagram(s, t) shouldBe expected
  }
})
