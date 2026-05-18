package io.github.aj8gh.neet26.model

data class TreeNode<E : Comparable<E>>(
  var value: E,
  var left: TreeNode<E>? = null,
  var right: TreeNode<E>? = null,
) {

  override fun toString(): String {
    val sb = StringBuilder(value.toString())
    val nodes = ArrayDeque(listOf(left, right))
    var i = 0
    while (nodes.isNotEmpty()) {
      val node = nodes.removeFirst()
      node?.left?.let { nodes.addLast(it) }
      node?.right?.let { nodes.addLast(it) }
      sb.append(", ${node?.value}")
      i++
    }
    return sb.toString()
  }
}

fun <E : Comparable<E>> binaryTreeOf(vararg values: E): TreeNode<E> {
  val valueStack = ArrayDeque(values.toList())
  val head = TreeNode(valueStack.removeFirst())
  val nodes = ArrayDeque(listOf(head))
  while (valueStack.isNotEmpty()) {
    val node = nodes.removeFirst()
    node.left = valueStack.removeFirstOrNull()?.let { TreeNode(it) }
    node.right = valueStack.removeFirstOrNull()?.let { TreeNode(it) }
    node.left?.let { nodes.addLast(it) }
    node.right?.let { nodes.addLast(it) }
  }
  return head
}

fun <E : Comparable<E>> emptyBinaryTree(): TreeNode<E>? = null
