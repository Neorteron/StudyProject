package com.epam;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Порядок числа фибоначчи: ");
        int number = input.nextInt();


        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for(int i = 3; i <= number; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        System.out.println("Число фибоначчи:");
        System.out.println(n2);
    }

}
