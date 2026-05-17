package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun reorderList(head: ListNode<Int>?) {
  head ?: return
  var first = head
  var second = split(head)
  second = reverse(second)
  while (first != null) {
    val tmp = first.next
    first.next = second
    first = second
    second = tmp
  }
}

private fun split(head: ListNode<Int>): ListNode<Int>? {
  var slow: ListNode<Int>? = head
  var fast: ListNode<Int>? = head.next
  while (fast?.next != null) {
    fast = fast.next?.next
    slow = slow?.next
  }
  val ret = slow?.next
  slow?.next = null
  return ret
}

@Suppress("DuplicatedCode")
private fun reverse(second: ListNode<Int>?): ListNode<Int>? {
  var current: ListNode<Int>?
  current = second
  var next = current?.next
  current?.next = null
  while (next != null) {
    val tmp = next.next
    next.next = current
    current = next
    next = tmp
  }
  return current
}
