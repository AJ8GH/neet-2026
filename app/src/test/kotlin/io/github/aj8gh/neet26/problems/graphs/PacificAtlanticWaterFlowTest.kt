package io.github.aj8gh.neet26.problems.graphs

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldBeEqual

class PacificAtlanticWaterFlowTest : FunSpec({
  withTests(
    Pair(
      arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(8, 9, 4),
        intArrayOf(7, 6, 5),
      ),
      listOf(
        listOf(0, 2),
        listOf(1, 0),
        listOf(1, 1),
        listOf(1, 2),
        listOf(2, 0),
        listOf(2, 1),
        listOf(2, 2),
      )
    ),
    Pair(
      arrayOf(
        intArrayOf(4, 2, 7, 3, 4),
        intArrayOf(7, 4, 6, 4, 7),
        intArrayOf(6, 3, 5, 3, 6),
      ),
      listOf(
        listOf(0, 2),
        listOf(0, 4),
        listOf(1, 0),
        listOf(1, 1),
        listOf(1, 2),
        listOf(1, 3),
        listOf(1, 4),
        listOf(2, 0),
      ),
    ),
    Pair(
      arrayOf(
        intArrayOf(1),
        intArrayOf(1),
      ),
      listOf(
        listOf(0, 0),
        listOf(1, 0),
      ),
    ),
  ) { (input, expected) ->
    pacificAtlantic(input) shouldBeEqual expected
  }
})
