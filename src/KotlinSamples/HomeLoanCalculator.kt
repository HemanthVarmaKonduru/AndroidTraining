package KotlinSamples

import java.util.*
import kotlin.math.pow


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter Loan amount: ")

    val loanAmount = scanner.nextDouble()
    print("Enter rate: ")

    var rate = scanner.nextDouble()
    rate = rate / (12 * 100)

    print("Enter time in years: ")
    var time = scanner.nextDouble()
    time = time * 12

    val monthlyPayment = calculateMonthlyPayment(loanAmount, rate, time)

    displayLoanDetails(time / 12, monthlyPayment, loanAmount)
    }

    fun calculateMonthlyPayment(loanAmount: Double, rate: Double, time: Double): Double {
        return (loanAmount * rate) / (1 - (1 + rate).pow(-time))
    }

    fun displayLoanDetails(termInYears: Double, monthlyPayment: Double, loanAmount: Double) {
        System.out.printf("%-10s%-15s%-15s%-20s\n", "Month", "Monthly Payment", "Total Paid", "Loan Amount Remaining")

        var totalPaid = 0.0
        var loanAmountRemaining = loanAmount

        var month = 1
        while (totalPaid <= loanAmountRemaining) {
            totalPaid += monthlyPayment
            loanAmountRemaining -= monthlyPayment

            System.out.printf("%-10d%-15.2f%-15.2f%-20.2f\n", month, monthlyPayment, totalPaid, loanAmountRemaining)
            month++
        }
    }
