package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hours = scanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float pay_rate = scanner.nextFloat();

        float gross_pay = hours * pay_rate;

        System.out.printf("Name: %s\n", name);
        System.out.printf("Gross pay: %.2f\n", gross_pay);

    }
}
