package com.epam;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Длинна массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Вводите по одному элементу:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        boolean isSorted = false;
        int swap;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                }
            }
        }

            System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


    }
}
