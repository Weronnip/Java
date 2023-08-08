package com.prog;

import java.util.Scanner;

public class CreateCar extends Object {

    public CreateCar(String NameCar, float SpeedCar, int WeightCar, String ColorCar, float FuelCar, byte CoordinateCar) {
        super(NameCar, SpeedCar, WeightCar, ColorCar, FuelCar, new byte[]{CoordinateCar});
    }

    public static void main(String[] args) {

        System.out.println("----Panel Create Car----\n");
        CratedCars();

    }

    public static CreateCar CratedCars() {
        //CreateCar
        Scanner cars = new Scanner(System.in);

        System.out.println("----Create Car----\n");

        //NameCar
        System.out.print("Enter name car: ");
        String NameCar = cars.nextLine();

        //ColorCar
        System.out.print("Enter color car: ");
        String ColorCar = cars.nextLine();

        //SpeedCar
        System.out.print("Enter speed car: ");
        float SpeedCar = cars.nextFloat();

        //WeightCar
        System.out.print("Enter weight car: ");
        int WeightCar = cars.nextInt();

        //FuelCar
        System.out.print("Enter fuel car: ");
        float FuelCar = cars.nextFloat();

        //CoordinateCar
        System.out.print("Enter coordinate car: ");
        byte CoordinateCar = cars.nextByte();


        return new CreateCar(NameCar, SpeedCar, WeightCar, ColorCar, FuelCar, CoordinateCar);
    }

    @Override
    public void moveObject(float speed) {

    }

}
