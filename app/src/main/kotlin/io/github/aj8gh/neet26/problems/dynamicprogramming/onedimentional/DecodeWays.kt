package io.github.aj8gh.neet26.problems.dynamicprogramming.onedimentional

fun numDecodings(s: String): Int {
  if (s.first() == '0') return 0
  if (s.length == 1) return 1
  var prev = 0
  var curr = 1
  if (s.last() != '0' && s[s.lastIndex - 1] != '0' && !(s[s.lastIndex - 1] > '2' || (s[s.lastIndex - 1] == '2' && s.last() > '6'))) {
    prev = 1
    curr = 2
  }
  var total = 1
  var i = s.lastIndex - 1
  var j = s.lastIndex
  while (i >= 0) {
    if (s[i] == '0' && s[j] == '0') return 0
    if (
      (s[i] == '0' || s[j] == '0')
      || (s[i] > '2')
      || (s[i] == '2' && s[j] > '6')
      || (j < s.lastIndex && s[j + 1] == '0')
    ) {
      total *= curr
      prev = 0
      curr = 1
    } else {
      val tmp = curr
      curr += prev
      prev = tmp
    }
    i--
    j--
  }
  return total * curr
}

/*

[]

12 -> 2 : 12, 1 2
123 -> 3 : 1 2 3, 12 3, 1 23
06 -> 0
10 -> 1 : 10
100 -> 0
123213 -> 123 213
2101 -> 2 10 1
12101 -> 12 10 1,  1 2 10 1
1234213 -> 123 4 213
  1 2 3 4 2 1 3,
  12 3 4 2 1 3,
  1 23 4 2 1 3,
  1 2 3 4 2 13,
  1 2 3 4 21 3,
  12 3 4 2 13,
  1 23 4 2 13,
  12 3 4 21 3,
  1 23 4 21 3

 */
