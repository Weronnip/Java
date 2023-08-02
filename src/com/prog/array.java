package com.prog;

import java.util.Scanner;

public class array {

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

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите номер: ");
//        int arrays = input.nextInt();
//
//        int[] array = new int[5];
//        array[0] = 12;
//        array[1] = 24;
//        array[2] = 48;
//        array[3] = 96;
//        array[4] = 192;
//
//
//        switch (arrays) {
//            case 0:
//                System.out.print("Число: " + array[0]);
//                break;
//            case 1:
//                System.out.print("Число: " + array[1]);
//                break;
//            case 2:
//                System.out.print("Число: " + array[2]);
//                break;
//            case 3:
//                System.out.print("Число: " + array[3]);
//                break;
//            case 4:
//                System.out.print("Число: " + array[4]);
//                break;
//            default:
//                System.out.print("Такого номера не существует");
//        }

//        LinkedList<Float> number = new LinkedList<>();
//        number.add(1.234f);
//        number.add(23.5456f);
//        number.add(2143.3454645f);
//
//        System.out.println("Array size: " + number.size());
//        System.out.println("Get float number: " + number.get(1));
//
//        for(Float i : number) {
//            System.out.println("Element: " + i);
//        }
//
//
//
////        ArrayList<Integer> number = new ArrayList<>();
////        number.add(5);
////        number.add(6);
////        number.add(1, 53);
////
////        System.out.println("Size ArrayList: " + number.size());
////        System.out.println("Get index number: " + number.get(0));
////
////        System.out.println("Remove number: " + number.remove(1));
////
////        for(Integer el : number) {
////            System.out.println("Element: " + el);
////        }
    }
}