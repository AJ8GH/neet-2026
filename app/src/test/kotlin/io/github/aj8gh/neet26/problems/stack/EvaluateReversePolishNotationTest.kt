package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class EvaluateReversePolishNotationTest : FunSpec({
  withTests(
    Pair(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"), 22),
    Pair(arrayOf("4", "13", "5", "/", "+"), 6),
    Pair(arrayOf("1", "2", "+", "3", "*", "4", "-"), 5),
    Pair(arrayOf("10", "2", "/", "5", "+", "2", "*", "1", "-"), 19),
  ) { (input, expected) ->
    evalRPN(input) shouldBe expected
  }
})
