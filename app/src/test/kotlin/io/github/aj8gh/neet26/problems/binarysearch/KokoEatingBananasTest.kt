package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class KokoEatingBananasTest : FunSpec({
  withTests(
    Triple(intArrayOf(1, 4, 3, 2), 9, 2),
    Triple(intArrayOf(25, 10, 23, 4), 4, 25),
  ) { (piles, h, expected) ->
    minEatingSpeed(piles, h) shouldBe expected
  }
})
