package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun reorderList(head: ListNode<Int>?) {
  head ?: return
  var current = head
  var n = 0
  while (current!!.next != null) {
    current = current.next
    n++
  }

  var second = head
  for (i in 0..n / 2) {
    val tmp = second!!.next
    if (i == n / 2) {
      second.next = null
    }
    second = tmp
  }

  current = second
  var next = current?.next
  current?.next = null
  while (next != null) {
    val tmp = next.next
    next.next = current
    current = next
    next = tmp
  }

  var first = head
  second = current
  while (first != null) {
    val tmp = first.next
    first.next = second
    first = first.next
    second = tmp
  }
}
