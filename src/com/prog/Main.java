package com.prog;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner boolen = new Scanner(System.in);

        System.out.print("Введите перовое число: ");
        int numebr = boolen.nextInt();

        System.out.print("Введите второе число: ");
        int number1 = boolen.nextInt();

        boolean otv = numebr > number1;

        if(otv) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


/*        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float num1 = input.nextFloat();

        System.out.print("Введите второе число: ");
        float num2 = input.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        float res5 = num1 % num2;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5);*/
    }

}
