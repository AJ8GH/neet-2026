package io.github.aj8gh.neet26.model

import java.util.*

data class ListNode<E : Comparable<E>>(
  var value: E,
  var next: ListNode<E>? = null,
) {

  override fun toString(): String {
    val visited = IdentityHashMap<ListNode<E>, Int>()
    val sb = StringBuilder(value.toString())
    var current = next
    var i = 1
    while (current != null) {
      if (current in visited) {
        sb.append(" -> cycle[i:${visited[current]}, v:${current.value}]")
        break
      }
      sb.append(", ${current.value}")
      visited[current] = i++
      current = current.next
    }
    return sb.toString()
  }

  fun cycle(index: Int): ListNode<E> {
    if (index < 0) return this
    var current = this
    var i = 0
    var cycleNode: ListNode<E>? = null
    while (current.next != null) {
      if (i == index) cycleNode = current
      current = current.next!!
      i++
    }
    current.next = cycleNode
    return this
  }
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
