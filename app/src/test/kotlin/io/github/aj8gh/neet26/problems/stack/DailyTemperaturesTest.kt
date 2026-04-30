package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.collections.shouldContainExactly

class DailyTemperaturesTest : FunSpec({
  withTests(
    Pair(intArrayOf(30, 38, 30, 36, 35, 40, 28), intArrayOf(1, 4, 1, 2, 1, 0, 0)),
    Pair(intArrayOf(22, 21, 20), intArrayOf(0, 0, 0)),
  ) { (input, expected) ->
    dailyTemperatures(input) shouldContainExactly expected
  }
})
