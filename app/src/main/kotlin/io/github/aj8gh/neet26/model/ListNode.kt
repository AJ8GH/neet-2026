package io.github.aj8gh.neet26.model

data class ListNode(
  var value: Int,
  var next: ListNode? = null,
) {

  override fun toString() = next?.let { "$value, $next" } ?: "$value"
}

fun linkedListOf(vararg elements: Int): ListNode {
  if (elements.isEmpty()) error("elements can't be empty")
  val head = ListNode(elements[0])
  var current = head
  for (i in 1..elements.lastIndex) {
    current.next = ListNode(elements[i])
    current = current.next!!
  }
  return head
}

fun emptyLinkedList(): ListNode? = null
