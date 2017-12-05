package day02

import java.io.File

fun main(args: Array<String>) {
  val srcFile = File("src/day02/input.txt")
  val input = srcFile.readLines().map { it.split("\t").map { it.toInt() } }
  partOne(input)
  partTwo(input)
}

fun partOne(input: List<List<Int>>) {
  val checksum = input.map { it.sorted() }.sumBy { it.last() - it.first() }
  print("\n Day02, Part One: $checksum")
}

fun partTwo(input: List<List<Int>>) {
  var checksum = 0
  val l = input.map { it.sortedDescending() }
  for (i in 0 until l.size) {
    for (j in 0 until l[i].size) {
      for (k in j + 1 until l[i].size) {
        if (l[i][j] % l[i][k] == 0)
          checksum += l[i][j] / l[i][k]
      }
    }
  }
  print("\n Day02, Part Two: $checksum")
}
