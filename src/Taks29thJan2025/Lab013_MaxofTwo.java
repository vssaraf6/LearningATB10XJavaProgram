package Taks29thJan2025;

import java.util.Scanner;

public class Lab013_MaxofTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("Number 1 is greater");
        }
        else {
            System.out.println("Number 2 is greater");
        }
    }
}
