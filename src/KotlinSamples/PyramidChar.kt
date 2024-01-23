package KotlinSamples

fun main() {
    printCharacterPyramid(10)
}

fun printCharacterPyramid(rows: Int) {
    for (i in 0 until rows) {
        for (j in 0 until rows - i - 1) {
            print(" ")
        }
        for (j in 0..i) {
            print(('A'.code + j).toChar())
        }
        for (j in i - 1 downTo 0) {
            print(('A'.code + j).toChar())
        }
        println()
    }
}


