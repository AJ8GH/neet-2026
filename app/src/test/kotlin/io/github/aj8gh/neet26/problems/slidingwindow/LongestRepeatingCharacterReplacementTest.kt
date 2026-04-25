package io.github.aj8gh.neet26.problems.slidingwindow

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withTests
import io.kotest.matchers.shouldBe

class LongestRepeatingCharacterReplacementTest : FunSpec({
  withTests(
    Triple(
      "KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF",
      4,
      7
    ),
    Triple("AABABBA", 1, 4),
    Triple("XYYX", 2, 4),
    Triple("AAABABB", 1, 5),
    Triple("AXAYABABB", 1, 4),
    Triple("AXAYACAFAGAEARATASAOAPAUAIAQAWAXACAVANAMALAKABABBBBBBBB", 1, 10),
    Triple("BBAXAYABABB", 1, 4),
  ) { (string, k, expected) ->
    characterReplacement(string, k) shouldBe expected
  }
})
