package com.prog;

import java.util.Scanner;

public class TTH {
    public static void main(String[] args) {
        // OOP: classes and objects

        Scanner loaded = new Scanner(System.in);
        System.out.print("Enter loaded truck: ");
        boolean booleans = loaded.nextBoolean();

        Car bmw = new Car(
                "BMW m5 F99",
                375.5f,
                2000,
                "Black",
                60f,
                new byte[] {(byte) 100, 43, 65});

        Car bugatti = new Car(
                "Bugatti Cheron M90",
                450f,
                1500,
                "Black Red",
                150f,
                new byte[] {(byte) 120, 54, 65});

        Car Tayota_Camry = new Car(
                "Tayota Camry 3.5",
                324f,
                1600,
                "Green",
                70f,
                new byte[] {(byte) 115, 54, 21}
        );

        Truck Mersedes = new Truck(
                5452,
                new byte[] {(byte) 94, 23,25},
                 false
        );

        Mersedes.setLoaded(booleans);
        Mersedes.getLoaded();

    }
}
