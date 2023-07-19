package com.prog;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String data = input.nextLine();
        System.out.print("\n Результат: " + data);
    }
}
