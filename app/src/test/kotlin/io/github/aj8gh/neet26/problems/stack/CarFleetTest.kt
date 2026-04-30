package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.Tuple4
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class CarFleetTest : FunSpec({
  withTests(
    Tuple4(10, intArrayOf(1, 4), intArrayOf(3, 2), 1),
    Tuple4(10, intArrayOf(4, 1, 0, 7), intArrayOf(2, 2, 1, 1), 3),
  ) { (target, position, speed, expected) ->
    carFleet(target, position, speed) shouldBe expected
  }
})
