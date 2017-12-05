package day04

import java.io.File

fun main(args: Array<String>) {
  val srcFile = File("src/day04/input.txt")
  val input = srcFile.readLines()
  partOne(input)
  partTwo(input)
}

fun partOne(input: List<String>) {
  val numberOfPassphrases = input.filter {
    it.split(" ").size == it.split(" ").distinct().size
  }.size
  print("\n Day04, Part One: $numberOfPassphrases")
}

fun partTwo(input: List<String>) {
  val numberOfPassphrases = input.filter {
    val words = it.split(" ").map { it.toLowerCase().toList().sorted() }
    words.size == words.distinct().size
  }.size
  print("\n Day04, Part Two: $numberOfPassphrases")
}