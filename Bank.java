package me.davide;

import java.util.Scanner;

public class Main {

    private static int balance = 10000;
    private static int attempts = 3;
    private static boolean needs = true;

    public static void main(String[] args) {
        while(needs) {
            function();
        }
    }

    public static void function() {
        int pin, amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Please Type your PIN: ");
        pin = sc.nextInt();

        if(pin != 1234) {
            if(attempts == 0) {
                System.out.println("You have finished all your login attempts.");
                needs = false;
                System.exit(0);
            }
        }

        if (pin == 1234) {
            System.out.println("Type the amount of Money you want to withdraw: ");
            amount = sc.nextInt();
            if (amount >= 1000) {
                System.out.println("You cant withdraw more than 1000");
            } else {
                System.out.println("You withdrawed " + amount);
                balance -= amount;
                System.out.println("You now have " + balance + " on your Account");
                needs = false;
            }
        } else {
            System.out.println("The pin is incorrect,, " + (attempts == 1 ? "you have only one attempt left." : "you have others " + attempts + " attempts"));
            attempts--;
        }
    }
}