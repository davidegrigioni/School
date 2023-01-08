package me.davide;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1, n2, r;
        String rs;
        Scanner sc = new Scanner(System.in);

        System.out.println("Type Operator:");
        rs = sc.next();
        System.out.println("Type First Number:");
        n1 = sc.nextDouble();
        System.out.println("Type Second Number:");
        n2 = sc.nextDouble();

    if (rs.equals("+")) {
        r = n1 + n2;
        System.out.println("Result: " + r);
    } else if (rs.equals("-")) {
        r = n1 - n2;
        System.out.println("Result: " + r);
    }

    if (rs.equals("/")) {
        r = n1 / n2;
        System.out.println("Result: " + r);
    } else if (rs.equals("*")) {
        r = n1 * n2;
        System.out.println("Result: " + r);
        }
    }
}
