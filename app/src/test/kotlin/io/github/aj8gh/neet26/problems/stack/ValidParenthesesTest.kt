package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class ValidParenthesesTest : FunSpec({
  withTests(
    Pair("]", false),
    Pair("[]", true),
    Pair("([{}])", true),
    Pair("[(])", false),
  ) { (input, expected) ->
    isValid(input) shouldBe expected
  }
})
