package io.github.aj8gh.neet26.problems.graphs

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

private val casesFn = {
  listOf(
    Triple(
      4,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(0, 2),
        intArrayOf(1, 2),
      ),
      false,
    ),
    Triple(
      5,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(2, 3),
        intArrayOf(1, 2),
        intArrayOf(0, 3),
      ),
      false,
    ),
    Triple(
      6,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(3, 4),
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(0, 5),
      ),
      false,
    ),
    Triple(
      3,
      arrayOf(
        intArrayOf(0, 1),
      ),
      false,
    ),
    Triple(
      4,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(2, 3),
        intArrayOf(1, 2),
        intArrayOf(0, 3),
      ),
      false,
    ),
    Triple(
      4,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(2, 3),
      ),
      false,
    ),
    Triple(
      3,
      arrayOf(
        intArrayOf(1, 0),
        intArrayOf(2, 0),
      ),
      true,
    ),
    Triple(
      5,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(1, 3),
        intArrayOf(3, 0),
        intArrayOf(2, 4),
      ),
      false,
    ),
    Triple(
      1,
      emptyArray(),
      true,
    ),
    Triple(
      5,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(0, 2),
        intArrayOf(0, 3),
        intArrayOf(1, 4),
      ),
      true,
    ),
    Triple(
      5,
      arrayOf(
        intArrayOf(0, 1),
        intArrayOf(1, 2),
        intArrayOf(2, 3),
        intArrayOf(1, 3),
        intArrayOf(1, 4),
      ),
      false,
    ),
  )
}

class ValidTreeTest : FunSpec({
  withTests(casesFn()) { (n, edges, expected) ->
    validTreeUnionFind(n, edges) shouldBe expected
  }

  withTests(casesFn()) { (n, edges, expected) ->
    validTree(n, edges) shouldBe expected
  }
})
