package com.prog;

public class Car extends Object{

    public Engine engine = new Engine();

    private boolean iscoming;
    public Car(String name, float speed, int weight, String color, float fuel, byte[] coordinate) {
        super(name, speed, weight, color, fuel, coordinate);
    }

    public Car(String name, float speed, int weight, String color, float fuel, byte[] coordinate, boolean iscoming) {
        super(name, speed, weight, color, fuel, coordinate);
        this.iscoming = iscoming;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("The car is moving at a speed of: " + speed);
    }


    public void setComing(boolean coming) {
        iscoming = coming;
    }

    public void getComing() {
        if(iscoming)
            System.out.println("\nThe car is coming 🟢");
        else
            System.out.println("\nThe car is not going 🔴");
        System.out.println("-----------------");
    }

}
