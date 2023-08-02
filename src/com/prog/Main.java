package com.prog;

public class Main {
    public static void main(String[] args) {
        // OOP: classes and objects
        Object bmw = new Object();
        bmw.setValues("BMW m5 F99", 375.5f, 2000, "Black", 60f,
                new byte[] {(byte) 243, 43, 65});
        String result_bmw = bmw.getValues();
        System.out.println("Specifications car: \n\n" + result_bmw);
//        bmw.name = "BMW m5 F99";
//        bmw.speed = 375.5f;
//        bmw.fuel = 60f;
//        bmw.weight = 2000;
//        bmw.color = "black";
//        bmw.coordinate = new byte[] {0, 0, 0};

        Object bugatti = new Object();
        bugatti.setValues("Bugatti Cheron M90", 450f, 1500, "Black Red", 150f,
                new byte[] {(byte) 230, 54, 65});
        String result_bugatti = bugatti.getValues();
        System.out.println("Specifications car: \n\n" + result_bugatti);
//        bugatti.name = "Bugatti Cheron M90";
//        bugatti.speed = 450f;
//        bugatti.fuel = 150f;
//        bugatti.weight = 1500;
//        bugatti.color = "Black Red";
//        bugatti.coordinate = new byte[]{(byte) 230, 53, 65 };




    }
}
