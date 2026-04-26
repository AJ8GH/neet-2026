package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldBeEqual

class MinimumWindowSubstringTest : FunSpec({
  withTests(
    Triple("OUZODYXAZV", "XYZ", "YXAZ"),
    Triple("xyz", "xyz", "xyz"),
    Triple("x", "xy", ""),
  ) { (s, t, expected) ->
    minWindow(s, t) shouldBeEqual expected
  }
})
