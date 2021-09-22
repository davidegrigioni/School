package me.davide;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String psw;
        String pswCheck;
        String user;
        String userCheck;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Type your User:");
        user = sc.nextLine();
        System.out.println("Please Retype your User");
        userCheck = sc.nextLine();

        System.out.println("Please Type a Password:");
        psw = sc.nextLine();
        System.out.println("Please Retype your Password:");
        pswCheck = sc.nextLine();

        if (userCheck.contains(user)) {
            System.out.println("Username: " + user);
        } else {
            System.out.println("ERROR");
        }

        if (pswCheck.contains(psw)) {
            System.out.println("Logged IN");
        } else {
            System.out.println("ERROR");
        }
    }
}
