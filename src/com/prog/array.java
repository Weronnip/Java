package com.prog;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите номер: ");
        int arrays = input.nextInt();

        int[] array = new int[5];
        array[0] = 12;
        array[1] = 24;
        array[2] = 48;
        array[3] = 96;
        array[4] = 192;


        switch (arrays) {
            case 0:
                System.out.print("Число: " + array[0]);
                break;
            case 1:
                System.out.print("Число: " + array[1]);
                break;
            case 2:
                System.out.print("Число: " + array[2]);
                break;
            case 3:
                System.out.print("Число: " + array[3]);
                break;
            case 4:
                System.out.print("Число: " + array[4]);
                break;
            default:
                System.out.print("Такого номера не существует");
        }

    }
}