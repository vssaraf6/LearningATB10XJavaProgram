package Taks29thJan2025;

import java.util.Scanner;

public class Lab015_Vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are eligible to Vote");
        }
        else {
            System.out.println("You are not eligible to Vote");
        }
    }
}
