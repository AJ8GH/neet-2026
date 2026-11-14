package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

fun numDecodings(s: String): Int {
  if (s.first() == '0') return 0
  val last = s.lastIndex
  var prev = 0
  var curr = 1
  var total = 1
  for (i in s.indices) {
    val j = i + 1
    if (j <= last && s[i] == '0' && s[j] == '0') return 0
    if (j <= last && s[i] > '2' && s[j] == '0') return 0
    if (
      (s[i] == '0')
      || (j <= last && s[j] == '0')
      || (i > 0 && s[i - 1] == '0')
      || (i > 0 && (s[i - 1] > '2' || (s[i - 1] == '2' && s[i] > '6')))
    ) {
      total *= curr
      prev = 1
      curr = 1
    } else {
      val tmp = curr
      curr += prev
      prev = tmp
    }
  }
  return total * curr
}
