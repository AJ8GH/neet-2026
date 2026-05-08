package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.equals.shouldBeEqual

const val ALICE = "alice"
const val HAPPY = "happy"
const val SAD = "sad"

class TimeBasedKeyValueStoreTest : FunSpec({
  test("TimeMap test") {
    val timeMap = TimeMap()
    timeMap.set(ALICE, HAPPY, 1) // store the key "alice"
    // and value "happy" along with timestamp = 1.
    timeMap.get(ALICE, 1) shouldBeEqual HAPPY
    timeMap.get(ALICE, 2) shouldBeEqual HAPPY
    // there is no value stored for timestamp 2,
    // thus we return the value at timestamp 1.
    timeMap.set(ALICE, SAD, 3) // store the key "alice"
    // and value "sad" along with timestamp = 3.
    timeMap.get(ALICE, 3) shouldBeEqual SAD
  }
})
