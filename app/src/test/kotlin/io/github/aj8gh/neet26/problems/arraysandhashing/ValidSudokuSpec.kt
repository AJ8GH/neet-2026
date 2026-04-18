package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ValidSudokuSpec : FunSpec({
  withTests(
    Pair(
      arrayOf(
        charArrayOf('1', '2', '.', '.', '3', '.', '.', '.', '.'),
        charArrayOf('4', '.', '.', '5', '.', '.', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '.', '3'),
        charArrayOf('5', '.', '.', '.', '6', '.', '.', '.', '4'),
        charArrayOf('.', '.', '.', '8', '.', '3', '.', '.', '5'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '.', '.', '.', '.', '.', '2', '.', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '8'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
      ),
      true
    ),
    Pair(
      arrayOf(
        charArrayOf('1', '2', '.', '.', '3', '.', '.', '.', '.'),
        charArrayOf('4', '.', '.', '5', '.', '.', '.', '.', '.'),
        charArrayOf('.', '9', '1', '.', '.', '.', '.', '.', '3'),
        charArrayOf('5', '.', '.', '.', '6', '.', '.', '.', '4'),
        charArrayOf('.', '.', '.', '8', '.', '3', '.', '.', '5'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '.', '.', '.', '.', '.', '2', '.', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '8'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
      ),
      false
    ),
  ) { (input, expected) ->
    isValidSudoku(input) shouldBe expected
  }
})
