package io.github.aj8gh.neet26.problems.stack

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MinStackTest : FunSpec({
  test("minStack") {
    val minStack = MinStack()
    minStack.push(1)
    minStack.push(2)
    minStack.push(0)
    minStack.getMin() shouldBe 0
    minStack.pop()
    minStack.top() shouldBe 2
    minStack.getMin() shouldBe 1
  }
})
