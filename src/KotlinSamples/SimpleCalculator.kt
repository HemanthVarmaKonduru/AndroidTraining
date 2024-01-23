package KotlinSamples

fun main() {
    println("Enter the first number:")
    val num1: Double = readLine()?.toDoubleOrNull() ?: 0.0

    println("Enter an operator to perform: (add, sub, mul, div, per)")
    val userInput: String? = readLine()

    println("Enter the second number:")
    val num2: Double = readLine()?.toDoubleOrNull() ?: 0.0

    when (userInput?.lowercase()) {
        "add" -> println("Sum of $num1 and $num2: ${num1 + num2}")
        "sub" -> println("Sub of $num1 and $num2: ${num1 - num2}")
        "mul" -> println("Mul of $num1 and $num2: ${num1 * num2}")
        "div" -> if (num2 != 0.0){println("Div of $num1 and $num2: ${num1 / num2}")} else {
            println("Cannot divide by zero")
        }

        "per" -> println(" $num1 Percentage of $num2: ${(num1 *100/ num2)}")
        else -> println("Default operation")
    }
}