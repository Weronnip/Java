package com.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element: ");
            int value = scan.nextInt();
            array[i] = value;
        }

        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("\nMinimal element: " + min);

        int max = array[1];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Maxmal element: " + max);
    }
}
