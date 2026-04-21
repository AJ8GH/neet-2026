package io.github.aj8gh.neet26.problems.arraysandhashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.equals.shouldBeEqual

class EncodeAndDecodeStringsTest : FunSpec({
  withTests(
    listOf("Hello", "World"),
    listOf("The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"),
    listOf(),
    listOf(""),
    listOf("", ""),
  ) { input ->
    val encoded = encode(input)
    val decoded = decode(encoded)
    decoded shouldBeEqual input
  }
})
