package day05

import java.io.File

fun main(args: Array<String>) {
  val srcFile = File("src/day05/input.txt")
  val input = srcFile.readLines()
  partOne(input)
  partTwo(input)
}

fun partOne(input: List<String>) {
  val instructions = input.map { it.trim().toInt() }.toMutableList()
  var steps = 0
  var index = 0
  while (index in 0 until instructions.size) {
    val currentInstruction = instructions[index]
    instructions[index]++
    index += currentInstruction
    steps++
  }
  print("\n Day05, Part One: $steps")
}

fun partTwo(input: List<String>) {
  val instructions = input.map { it.trim().toInt() }.toMutableList()
  var steps = 0
  var index = 0
  while (index in 0 until instructions.size) {
    val currentInstruction = instructions[index]
    instructions[index] = if (currentInstruction < 3) currentInstruction + 1 else currentInstruction - 1
    index += currentInstruction
    steps++
  }
  print("\n Day05, Part Two: $steps")
}