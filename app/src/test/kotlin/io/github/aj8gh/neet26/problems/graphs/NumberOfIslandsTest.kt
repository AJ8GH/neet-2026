package io.github.aj8gh.neet26.problems.graphs

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class NumberOfIslandsTest : FunSpec({
  val casesFn = {
    listOf(
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
    )
  }

  withTests(casesFn()) { (input, expected) ->
    numIslands(input) shouldBe expected
  }

  withTests(casesFn()) { (input, expected) ->
    numIslandsIterative(input) shouldBe expected
  }

  withTests(casesFn()) { (input, expected) ->
    numIslandsIterativeWithEncoding(input) shouldBe expected
  }
})
