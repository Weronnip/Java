package com.prog;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите переменную: +, -, *, /: ");
        String znak = input.nextLine();

        System.out.print("\nВведите перовое число: ");
        int a = input.nextInt();

        System.out.print("\nВведите второе число: ");
        int b = input.nextInt();

        if (znak.equals("+")) {
            int result1 = a + b;
            System.out.println("Ответ: " + result1);

        } else if (znak.equals("-")) {
            int result2 = a - b;
            System.out.println("Ответ: " + result2);

        } else if (znak.equals("*")) {
            int result3 = a * b;
            System.out.println("Ответ: " + result3);

        } else if (znak.equals("/")) {
            int result4 = a / b;
            System.out.println("Ответ: " + result4);
        } else {
            System.out.println("Ошибка!");
        }
    }
}
