package com.prog;

public class Truck extends Object {

    private boolean isLoaded;
    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public void getLoaded() {
        if(isLoaded)
            System.out.println("The truck is loaded ");
        else
            System.out.println("The truck is not loaded");
    }
}
