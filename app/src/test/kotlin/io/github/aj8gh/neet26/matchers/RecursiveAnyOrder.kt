package io.github.aj8gh.neet26.matchers

import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import io.kotest.matchers.should

fun <E : Comparable<E>> containExactlyInAnyOrderRecursive(expected: List<List<E>>) =
  Matcher<List<List<E>>> { actual ->
    var success = true
    if (actual.size != expected.size) {
      success = false
    } else {
      val sortedActual = nestedSort(actual)
      val sortedExpected = nestedSort(expected)
      for (i in sortedExpected.indices) {
        if (sortedExpected[i] != sortedActual[i]) success = false
      }
    }

    MatcherResult(
      success,
      { "expected actual: $actual to contain exactly in any order recursively, elements of: $expected" },
      { "expected actual: $actual to not contain exactly in any order recursively, elements of: $expected" },
    )
  }

fun <E : Comparable<E>> List<List<E>>.shouldContainExactlyInAnyOrderRecursive(
  expected: List<List<E>>,
): List<List<E>> {
  this should containExactlyInAnyOrderRecursive(expected)
  return this
}

private fun <E : Comparable<E>> nestedSort(l: List<List<E>>) = l.map { it.sorted() }
  .groupBy { it.toString() }
  .entries.sortedBy { it.key }
  .flatMap { it.value }
