package io.github.aj8gh.neet26.problems.graphs

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class CourseScheduleTest : FunSpec({
  withTests(
    Triple(4, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 3)), true),
    Triple(
      4,
      arrayOf(
        intArrayOf(2, 0),
        intArrayOf(1, 0),
        intArrayOf(3, 1),
        intArrayOf(3, 2),
        intArrayOf(1, 3)
      ),
      false
    ),
    Triple(3, arrayOf(intArrayOf(1, 0), intArrayOf(2, 1)), true),
    Triple(2, arrayOf(intArrayOf(0, 1)), true),
    Triple(
      3,
      arrayOf(
        intArrayOf(1, 0),
        intArrayOf(1, 2),
        intArrayOf(0, 1)
      ),
      false
    ),
    Triple(
      3,
      arrayOf(
        intArrayOf(1, 0),
        intArrayOf(0, 2),
        intArrayOf(2, 1)
      ),
      false
    ),
    Triple(
      20,
      arrayOf(
        intArrayOf(0, 10),
        intArrayOf(3, 18),
        intArrayOf(5, 5),
        intArrayOf(6, 11),
        intArrayOf(11, 14),
        intArrayOf(13, 1),
        intArrayOf(15, 1),
        intArrayOf(17, 4)
      ),
      false
    ),
    Triple(2, arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)), false),
  ) { (numCourses, prerequisites, expected) ->
    canFinish(numCourses, prerequisites) shouldBe expected
  }
})
