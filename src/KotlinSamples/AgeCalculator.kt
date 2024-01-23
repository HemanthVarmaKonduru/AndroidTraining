package KotlinSamples

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun main() {
    val ageInYears : Int
    println("Enter your date of birth in YYYY-MM-DD(2000-01-01) format: ")
    val strAge: String? = readLine()
    val currentDate  = LocalDate.now ()
    val dob = LocalDate.parse(strAge, DateTimeFormatter.ISO_LOCAL_DATE)
    ageInYears = Period.between(dob,currentDate).years
    println("Age in years: $ageInYears")
    val ageInMonths = Period.between(dob,currentDate).months
    val ageInDays = Period.between(dob,currentDate).months
    println("You are $ageInYears years $ageInMonths months $ageInDays days old")


}