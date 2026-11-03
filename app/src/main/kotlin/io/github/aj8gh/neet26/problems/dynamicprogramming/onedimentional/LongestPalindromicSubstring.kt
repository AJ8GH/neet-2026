package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

fun longestPalindrome(s: String): String {
  var best = Pair(0, 0)
  for (i in 0 until s.lastIndex) {
    val p = expand(s, i, i)
    val pEven = expand(s, i, i + 1)
    if (p.second - p.first > best.second - best.first) best = p
    if (pEven.second - pEven.first > best.second - best.first) best = pEven
  }
  return s.substring(best.first, best.second + 1)
}

fun expand(s: String, idxI: Int, idxJ: Int): Pair<Int, Int> {
  var i = idxI
  var j = idxJ
  while (i >= 0 && j <= s.lastIndex && s[i] == s[j]) {
    i--
    j++
  }
  return Pair(i + 1, j - 1)
}
