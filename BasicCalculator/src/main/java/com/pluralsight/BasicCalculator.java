package com.pluralsight;
import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first_number = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second_number = scanner.nextDouble();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Please select an option: ");
        String option = scanner.nextLine();

        double result = first_number * second_number;

        System.out.printf("%.2f * %.2f = %.2f", first_number, second_number, result);

    }
    }

