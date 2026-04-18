package io.github.aj8gh.neet26.model

data class IntArrayKey(
  val value: IntArray,
) {

  private val hash = value.contentHashCode()
  override fun hashCode() = hash

  override fun equals(other: Any?) = this === other
      || (other is IntArrayKey && value.contentEquals(other.value))

  override fun toString() = "[${value.joinToString(", ")}]"
}
