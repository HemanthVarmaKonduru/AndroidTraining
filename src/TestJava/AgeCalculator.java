package TestJava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
    public static void main(String[] args) {
        int Age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth in YYYY-MM-DD format : ");
        String DOB = sc.next();

        LocalDate currentdate = LocalDate.now();
        LocalDate dob = LocalDate.parse(DOB, DateTimeFormatter.ISO_LOCAL_DATE);
        Age = Period.between(dob,currentdate).getYears();
        System.out.println("Your age is: "+ Age);

    }
}
