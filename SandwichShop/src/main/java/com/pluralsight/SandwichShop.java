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

        float base_price = 0f;
        if (size == 1) {
            base_price = 5.45f;
        } else if (size == 2) {
            base_price = 8.95f;
        } else {
            System.out.println("Wrong number");
        }

        scanner.nextLine();

        System.out.println("Do you want a loaded sandwich? (yes/no) ");
        String loaded = scanner.nextLine();

        if (loaded.equals("yes")) {
            if (size == 1){
                base_price = base_price + 1;
            } else if (size == 2) {
                base_price = base_price + 1.75f;
            }
        } else {
            base_price = base_price + 0;
        }


        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        float discount = 0.0f;

        if (age <= 17) {
            discount = 0.10f;
        } else if (age >= 65) {
            discount = 0.20f;
        } else {
            System.out.println("You do not have discount.");
        }

        float price_to_pay = base_price * (1 - discount);

        System.out.printf("Your price is: $%.2f\n ", price_to_pay);


    }
}
