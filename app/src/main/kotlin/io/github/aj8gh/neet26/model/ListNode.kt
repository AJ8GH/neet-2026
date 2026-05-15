package io.github.aj8gh.neet26.model

data class ListNode<E : Comparable<E>>(
  var value: E,
  var next: ListNode<E>? = null,
) {

  override fun toString() = next?.let { "$value, $next" } ?: "$value"
}

fun <E : Comparable<E>> linkedListOf(vararg elements: E): ListNode<E> {
  if (elements.isEmpty()) error("elements can't be empty")
  val head = ListNode(elements[0])
  var current = head
  for (i in 1..elements.lastIndex) {
    current.next = ListNode(elements[i])
    current = current.next!!
  }
  return head
}

fun <E : Comparable<E>> emptyLinkedList(): ListNode<E>? = null
