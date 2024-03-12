package com.example.main;

import java.util.Scanner;


public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        sc.close();
        int sum = add(num1, num2);
        System.out.println("Sum of these numbers: " + sum);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}