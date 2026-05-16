package io.github.aj8gh.neet26.problems.linkedlist

import io.github.aj8gh.neet26.model.ListNode

fun hasCycle(head: ListNode<Int>?): Boolean {
  var fast = head?.next
  var slow = head
  while (fast != null) {
    if (fast === slow) return true
    fast = fast.next?.next
    slow = slow?.next
  }
  return false
}
