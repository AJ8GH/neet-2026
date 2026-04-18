package io.github.aj8gh.neet26.problems.arraysandhashing

fun isAnagram(s: String, t: String): Boolean {
  if (s.length != t.length) return false
  val count = IntArray(26)
  for (i in s.indices) {
    count[s[i] - 'a']++
    count[t[i] - 'a']--
  }
  return count.all { it == 0 }
}
