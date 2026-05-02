package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.Tuple4
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class CarFleetTest : FunSpec({
  withTests(
    Tuple4(10, intArrayOf(8, 3, 7, 4, 6, 5), intArrayOf(4, 4, 4, 4, 4, 4), 6),
    Tuple4(20, intArrayOf(6, 2, 17), intArrayOf(3, 9, 2), 2),
    Tuple4(10, intArrayOf(1, 4), intArrayOf(3, 2), 1),
    Tuple4(12, intArrayOf(10, 8, 0, 5, 3), intArrayOf(2, 4, 1, 1, 3), 3),
    Tuple4(10, intArrayOf(4, 1, 0, 7), intArrayOf(2, 2, 1, 1), 3),
  ) { (target, position, speed, expected) ->
    carFleet(target, position, speed) shouldBe expected
  }
})
