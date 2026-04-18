package io.github.aj8gh.neet26.problems.arraysandhashing

import io.github.aj8gh.neet26.model.IntArrayKey

fun groupAnagrams(strs: Array<String>): List<List<String>> {
  val charCounts = mutableMapOf<IntArrayKey, MutableList<String>>()
  for (str in strs) {
    val count = IntArray(26)
    for (c in str) count[c - 'a']++
    charCounts.getOrPut(IntArrayKey(count)) { mutableListOf() }.add(str)
  }
  return charCounts.values.toList()
}
