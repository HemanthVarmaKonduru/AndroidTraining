package KotlinSamples


    fun main(args: Array<String>) {
        // Example array with one missing integer
        val array = intArrayOf(1, 2, 3, 5, 6, 7, 8, 9, 10)
        val missingNumber = MissingNumber(array)
        println("Missing number: $missingNumber")
    }

    fun MissingNumber(array: IntArray): Int {
        val n = array.size + 1
        val expectedSum = n * (n + 1) / 2
        var actualSum = 0
        for (num in array) {
            actualSum += num
        }
        return expectedSum - actualSum
    }

