package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun reverseList(head: ListNode<Int>?): ListNode<Int>? {
  var curr = head
  var prev = head?.next
  curr?.next = null
  while (prev != null) {
    val tmp = prev.next
    prev.next = curr
    curr = prev
    prev = tmp
  }

  return curr
}
