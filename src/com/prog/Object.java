package com.prog;

public class Object {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;
    private float fuel;
    private String name;

    public Object(String name, float speed, int weight, String color, float fuel, byte[] coordinate) {
        System.out.println("Created Car: \n");
        setValues(name, speed, weight, color, fuel, coordinate);

        System.out.println(getValues());
    }

    public Object(int weight, byte[] coordinate) {
        System.out.print("Created Truck: ");
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(this.getValues());
    }

    public void setValues(String name, float speed, int weight, String color, float fuel, byte[] coordinate) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.fuel = fuel;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Name car: " + name + "\n\nSpeed: " +
                speed + "\nWeight: " + weight +
                "\nColor: " + color + "\nFuel: " + fuel + "\n\n";

        String infoCoordinates = "Coordinetes:\n";

        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
