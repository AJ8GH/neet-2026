package io.github.aj8gh.neet26.problems.arraysandhashing.containsduplicate

import io.kotest.matchers.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ContainsDuplicateTest {

  companion object {
    @JvmStatic
    private fun params() = listOf(
      Arguments.of(intArrayOf(1, 2, 3, 3), true),
      Arguments.of(intArrayOf(1, 2, 3, 4), false),
      Arguments.of(intArrayOf(1, 2, 3, 4, 5, 1), true),
      Arguments.of(intArrayOf(1, 3, 2, 5, 4, 0), false),
      Arguments.of(intArrayOf(1, 3, 2, 5, 4, 0, 8, 2, 4), true),
    )
  }

  @ParameterizedTest
  @MethodSource("params")
  fun containsDuplicate(input: IntArray, expected: Boolean) {
    containsDuplicate(input) shouldBe expected
  }
}
