package com.prog;

public class Truck extends Object {

    public Engine engine = new Engine();

    private boolean isLoaded;
    public Truck(String name, float speed, int weight, String color, byte[] coordinate) {
        super(name, speed, weight, color, coordinate);
    }

    public Truck(String name, float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super(name, speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("The Truck is moving at a speed of: " + speed);
    }

    public void setValues(String name, float speed, int weight, String color, float fuel, byte[] coordinate,
                          boolean isLoaded) {
        super.setValues(name, speed, weight, color, fuel, coordinate);

        this.isLoaded = isLoaded;

    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded() {
        if(isLoaded)
            return "The truck is loaded 🟢";
        else
            return "The truck is not loaded 🔴";
    }
}
