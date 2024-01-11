package TestJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1,num2;
        String Option;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        num1=input.nextDouble();
        Scanner Opt = new Scanner(System.in);
        System.out.println("Enter your options from below: ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("%");
        Option = Opt.next();
        System.out.println("Enter Second number");
        num2=input.nextDouble();
        if (Option.equals("+")){
            System.out.println(num1+" + " + num2+ " is: " + (num1+num2));
        } else if (Option.equals("-")) {
            System.out.println(num1+" - " + num2+ " is: " + (num1-num2));
        }else if (Option.equals("*")){
            System.out.println(num1+" * " + num2+ " is: " +(num1*num2));
        } else if (Option.equals("/")) {
            System.out.println(num1+" / " + num2+ " is: " +(num1/num2));
        } else if (Option.equals("%")) {
            System.out.println(num1+" Percent of " + num2+ " is: " + (num1/num2)*100);
        }


    }
}
