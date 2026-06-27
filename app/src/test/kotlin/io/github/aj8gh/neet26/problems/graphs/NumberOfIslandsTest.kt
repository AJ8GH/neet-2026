package io.github.aj8gh.neet26.problems.graphs

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class NumberOfIslandsTest : FunSpec({
  withTests(
    Pair(
      arrayOf(
        charArrayOf('0', '1', '1', '1', '0'),
        charArrayOf('0', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '0')
      ),
      1
    ),
    Pair(
      arrayOf(
        charArrayOf('1', '1', '0', '0', '1'),
        charArrayOf('1', '1', '0', '0', '1'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1')
      ),
      4
    ),
  ) { (input, expected) ->
    numIslands(input) shouldBe expected
  }
})
