package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun reverseList(head: ListNode?): ListNode? {
  var curr = head
  var next = head?.next
  curr?.next = null
  while (next != null) {
    val tmp = next.next
    next.next = curr
    curr = next
    next = tmp
  }

  return curr
}

fun reverseListRecursive(head: ListNode?): ListNode? {
  val next = head?.next
  head?.next = null
  return reverse(head, next)
}

private tailrec fun reverse(curr: ListNode?, next: ListNode?): ListNode? {
  if (next == null) return curr
  val tmp = next.next
  next.next = curr
  return reverse(next, tmp)
}
