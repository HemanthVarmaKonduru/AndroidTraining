package KotlinSamples

fun main() {
    val n = 8
    var n1 = 0
    var n2 = 1
    var n3 = 1
    for (i in 1..n) {
        println(n1)
        n1 = n2
        n2 = n3
        n3 = n1 + n2
    }
}



