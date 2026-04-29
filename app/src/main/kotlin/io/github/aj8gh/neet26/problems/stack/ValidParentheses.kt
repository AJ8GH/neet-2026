package io.github.aj8gh.neet26.problems.stack

import java.util.*

fun isValid(s: String): Boolean {
  val opening = setOf('(', '{', '[')
  val stack = ArrayDeque<Char>()
  for (c in s) {
    if (c in opening) stack.addLast(c)
    else {
      if (stack.isEmpty()) return false
      if (!isMatch(stack.removeLast(), c)) return false
    }
  }
  return stack.isEmpty()
}

private fun isMatch(opening: Char, closing: Char): Boolean {
  return when (opening) {
    '(' -> closing == ')'
    '{' -> closing == '}'
    '[' -> closing == ']'
    else -> error("invalid opening char: $opening")
  }
}
