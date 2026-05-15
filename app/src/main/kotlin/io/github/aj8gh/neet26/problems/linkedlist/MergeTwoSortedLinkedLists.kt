package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun mergeTwoLists(
  list1: ListNode<Int>?,
  list2: ListNode<Int>?,
): ListNode<Int>? {
  var l1 = list1
  var l2 = list2
  val dummy = ListNode(0)
  var current = dummy

  while (l1 != null || l2 != null) {
    if (l2 == null || (l1 != null && l1.value < l2.value)) {
      current.next = l1
      l1 = l1!!.next
    } else {
      current.next = l2
      l2 = l2.next
    }
    current = current.next!!
    current.next = null
  }

  return dummy.next
}
