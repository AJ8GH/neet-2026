package io.github.aj8gh.neet26.model

import java.util.IdentityHashMap
import java.util.Objects.hash
import kotlin.collections.ArrayDeque

data class Node<T : Comparable<T>>(
  var value: T,
  var neighbors: MutableList<Node<T>> = ArrayList(),
) {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other == null) return false
    if (other !is Node<*>) return false
    if (this.value != other.value) return false
    return neighborValues() == other.neighborValues()
  }

  override fun hashCode() = hash(value, neighborValues())

  private fun neighborValues(): List<T> = neighbors.map { it.value }

  override fun toString(): String {
    val visited = IdentityHashMap<Node<T>, Boolean>()
    val actNodes = ArrayDeque(listOf(this))
    while (actNodes.isNotEmpty()) {
      val act = actNodes.removeFirst()
      visited[act] = true
      for (n in act.neighbors) if (n !in visited) actNodes.addLast(n)
    }
    return visited.keys
      .sortedBy { it.value }
      .map { n -> n.neighborValues() }
      .joinToString(", ")
  }
}

fun nodeOf(vararg nodes: List<Int>): Node<Int> {
  val nodesByVal = nodes
    .mapIndexed { i, _ -> Node(i + 1) }
    .associateBy { it.value }
  for ((i, n) in nodesByVal) {
    val neighbors = nodes[i - 1]
    for (neighbor in neighbors) {
      n.neighbors.add(nodesByVal[neighbor]!!)
    }
  }
  return nodesByVal[1]!!
}

fun emptyNode(): Node<Int>? = null
