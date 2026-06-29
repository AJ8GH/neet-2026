package io.github.aj8gh.neet26.problems.graphs

import io.github.aj8gh.neet26.model.Node

fun cloneGraph(node: Node<Int>?): Node<Int>? {
  node ?: return null
  val clone = Node(node.value)
  var current = node
  var cloneCurrent = clone
  while (current!!.neighbors.isNotEmpty()) {
    val n = current.neighbors.last()
    val nClone = Node(n.value)
    cloneCurrent.neighbors.add(nClone)
    nClone.neighbors.add(cloneCurrent)
    current = current.neighbors.last()
    cloneCurrent = cloneCurrent.neighbors.last()
    if (current.neighbors.size == 1) break
  }
  return clone
}
