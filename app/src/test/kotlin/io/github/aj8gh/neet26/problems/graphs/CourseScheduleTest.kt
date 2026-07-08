package io.github.aj8gh.neet26.problems.graphs

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class CourseScheduleTest : FunSpec({
  withTests(
    Triple(2, arrayOf(intArrayOf(0, 1)), true),
    Triple(2, arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)), false),
  ) { (numCourses, prerequisites, expected) ->
    canFinish(numCourses, prerequisites) shouldBe expected
  }
})
