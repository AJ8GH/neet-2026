package io.github.aj8gh.neet26.problems.arraysandhashing

const val DELIMITER = "£"

fun encode(strs: List<String>): String {
  val sb = StringBuilder()
  for (s in strs) {
    sb.append(s.length).append(DELIMITER).append(s)
  }
  return sb.toString()
}

fun decode(str: String): List<String> {
  // val j = 0
  // for (i in str.indices) {
  //   val sb = StringBuilder()
  //   if (str[i] == DELIMITER) {
  //     fo
  //   }
  // }
  return listOf()
}
