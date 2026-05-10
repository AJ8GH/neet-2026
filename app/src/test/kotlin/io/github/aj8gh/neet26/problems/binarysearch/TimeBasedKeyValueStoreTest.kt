package io.github.aj8gh.neet26.problems.binarysearch

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.string.shouldHaveLength

private const val ALICE = "alice"
private const val HAPPY = "happy"
private const val SAD = "sad"

private const val KEY_1 = "key1"
private const val VALUE_1 = "value1"

private const val TEST = "test"
private const val ONE = "one"
private const val TWO = "two"
private const val THREE = "three"

class TimeBasedKeyValueStoreTest : FunSpec({
  test("TimeMap test 1") {
    val timeMap = TimeMap()
    timeMap.set(ALICE, HAPPY, 1)
    timeMap.get(ALICE, 1) shouldBeEqual HAPPY
    timeMap.get(ALICE, 2) shouldBeEqual HAPPY
    timeMap.set(ALICE, SAD, 3)
    timeMap.get(ALICE, 3) shouldBeEqual SAD
  }

  test("TimeMap test 2") {
    val timeMap = TimeMap()
    timeMap.set(KEY_1, VALUE_1, 10)
    timeMap.get(KEY_1, 1) shouldHaveLength 0
    timeMap.get(KEY_1, 10) shouldBeEqual VALUE_1
    timeMap.get(KEY_1, 11) shouldBeEqual VALUE_1
  }

  test("TimeMap test 3") {
    val timeMap = TimeMap()
    timeMap.set(TEST, ONE, 10)
    timeMap.set(TEST, TWO, 20)
    timeMap.set(TEST, THREE, 30)
    timeMap.get(TEST, 15) shouldBeEqual ONE
    timeMap.get(TEST, 25) shouldBeEqual TWO
    timeMap.get(TEST, 35) shouldBeEqual THREE
  }
})
