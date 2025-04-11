package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("What size of the sandwich do you want to choose? ");
        System.out.println("1.Regular: base price is $5.45");
        System.out.println("2.Large: base price is $8.95");
        System.out.print("Your choice: ");
        int size = scanner.nextInt();

        double base_price = 0;
        if (size == 1) {
            base_price = 5.45;
        } else if (size == 2) {
            base_price = 8.95;
        } else {
            System.out.println("Wrong number");
        }


        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            System.out.println("You do not have discount.");
        }

        double price_to_pay = base_price * (1 - discount);

        System.out.printf("Your price is: $%.2f\n ", price_to_pay);


    }
}
