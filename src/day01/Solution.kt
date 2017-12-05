package day01

import util.toIntList
import java.io.File

fun main(args: Array<String>) {
  val srcFile = File("src/day01/input.txt")
  val input = srcFile.readLines()[0].toIntList()
  partOne(input)
  partTwo(input)
}

fun partOne(input: List<Int>) {
  val circularList = input + input[0]
  val captcha = circularList
      .windowed(2)
      .filter { it[0] == it[1] }
      .sumBy { it[0] }
  print("\nDay01, Part One: $captcha")
}

fun partTwo(input: List<Int>) {
  val circularList = input + input
  val captcha = (0 until input.size)
      .filter { circularList[it] == circularList[it + input.size / 2] }
      .sumBy { circularList[it] }
  print("\nDay01, Part Two: $captcha")
}