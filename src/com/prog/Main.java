package com.prog;
import java.util.Scanner;

public class Main {
// Циклы
    public static void main(String[] args) {

        for(int i = 1; i < 20; i += 2) {
            System.out.println("Element: " + i);

            if(i % 5 == 0) {
                continue;
            }

            if (i >= 12) {
                System.out.println("Element ready!");
                break;
            }
        }


//        int i = 2;
//
//        do {
//            System.out.println("Element: " + i);
//            i ++;
//        } while (i < 125);

//        int i = 100;
//        while(i > 2) {
//            System.out.println("Element: " + i);
//
//            i -= 15;
//        }
//        for(float i = 100; i > 0; i /= 2) {
//            System.out.println("Element: " + i);
//        }


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Действие: ");
//        String action = input.nextLine();
//
//        System.out.print("Введите первое число: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int num2 = input.nextInt();
//
//        int result;
//
//        switch (action) {
//            case "+":
//                result = num1 + num2;
//                System.out.println("Ответ: " + result);
//                break;
//            case "-":
//                result = num1 - num2;
//                System.out.println("Ответ: " + result);
//                break;
//            case "*":
//                result = num1 * num2;
//                System.out.println("Ответ: " + result);
//                break;
//            case "/":
//                if (num2 == 0)
//                    System.out.println("На 0 делить нельзя!");
//                else {
//                    result = num1 / num2;
//                    System.out.println("Ответ: " + result);
//                }
//                break;
//            default:
//                System.out.println("Ошибка в действии");
//        }

//        System.out.print("Проверка чисел: ");
//        int num = input.nextInt();
//
//        switch (num) {
//            case 1:
//                System.out.println("Number is 1");
//                break;
//            case 2:
//                System.out.println("Number is 2");
//                break;
//            case 3:
//                System.out.println("Number is 3");
//                break;
//            case 4:
//                System.out.println("Number is 4");
//                break;
//        }

//        System.out.print("Введите ваш логин: ");
//        String username = input.nextLine();
//
//        System.out.print("Введите пароль: ");
//        String pass = input.nextLine();
//
//        if (username.equals("Admin") && pass.equals("2005")) {
//            System.out.println(username + " Добро пожаловать!");
//        } else {
//            System.out.print("Неверный логин или пароль");
//        }

//        System.out.print("Введите переменную: +, -, *, /: ");
//        String znak = input.nextLine();
//
//        System.out.print("\nВведите перовое число: ");
//        int a = input.nextInt();
//
//        System.out.print("\nВведите второе число: ");
//        int b = input.nextInt();
//
//        if (znak.equals("+")) {
//            int result1 = a + b;
//            System.out.println("Ответ: " + result1);
//
//        } else if (znak.equals("-")) {
//            int result2 = a - b;
//            System.out.println("Ответ: " + result2);
//
//        } else if (znak.equals("*")) {
//            int result3 = a * b;
//            System.out.println("Ответ: " + result3);
//
//        } else if (znak.equals("/")) {
//            int result4 = a / b;
//            System.out.println("Ответ: " + result4);
//        } else {
//            System.out.println("Ошибка!");
//        }
    }
}
