package io.github.aj8gh.neet26.model

data class Node<T : Comparable<T>>(
  var value: T,
  var neighbors: MutableList<Node<T>> = ArrayList(),
) {

  override fun toString(): String {
    var result = "[${neighbors.map { it.value }}"
    var current = this
    while (current.neighbors.isNotEmpty()) {
      current = current.neighbors.last()
      result += ", ${current.neighbors.map { it.value }}"
      if (current.neighbors.size == 1) break
    }
    return "$result]"
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
