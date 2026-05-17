package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun removeNthFromEnd(head: ListNode<Int>?, n: Int): ListNode<Int>? {
  head ?: return null
  var prev = head
  var end = head
  repeat(n) { end = end?.next }
  end ?: return head.next
  while (end?.next != null) {
    end = end.next
    prev = prev!!.next
  }
  prev!!.next = prev.next!!.next
  return head
}
