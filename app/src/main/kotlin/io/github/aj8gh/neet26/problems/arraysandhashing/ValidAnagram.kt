package io.github.aj8gh.neet26.problems.arraysandhashing

fun isAnagram(s: String, t: String): Boolean {
  if (s.length != t.length) {
    return false
  }
  val count = mutableMapOf<Char, Int>()
  for (c in s) {
    count[c] = count.getOrDefault(c, 0) + 1
  }
  for (c in t) {
    count[c] = count.getOrDefault(c, 0) - 1
  }
  return count.all { it.value == 0 }
}
