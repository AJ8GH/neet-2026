package io.github.aj8gh.neet26.problems.graphs

import io.github.aj8gh.neet26.model.Node

fun cloneGraph(node: Node<Int>?): Node<Int>? {
  node ?: return null
  val vertices = mutableMapOf<Int, Node<Int>>()
  val visited = mutableSetOf<Int>()
  val nodes = ArrayDeque(listOf(node))
  while (nodes.isNotEmpty()) {
    val n = nodes.removeFirst()
    if (n.value in visited) continue
    visited.add(n.value)
    val nodeClone = vertices.getOrPut(n.value) { Node(n.value) }
    for (nb in n.neighbors) {
      val nClone = vertices.getOrPut(nb.value) { Node(nb.value) }
      nodeClone.neighbors.add(nClone)
      if (nb.value !in visited) nodes.addLast(nb)
    }
  }
  return vertices[1]
}
