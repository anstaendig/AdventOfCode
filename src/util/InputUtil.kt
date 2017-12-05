package util

fun String.toIntList(): List<Int> {
    return this.trim().map {
        it.toString().toInt()
    }
}