package com.prog;

public abstract class Object {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;
    private float fuel;
    private String name;

    protected Object(String name, float speed, int weight, String color, float fuel, byte[] coordinate) {
        System.out.println("\nCreated Car: \n");
        setValues(name, speed, weight, color, fuel, coordinate);
//        System.out.println(getValues());
    }

    protected Object(String name, float speed, int weight, String color, byte[] coordinate) {
        System.out.print("\nCreated Truck: \n\n");
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
//        System.out.println(this.getValues());
        System.out.println("-----------------");
    }

    protected void setValues(String name, float speed, int weight, String color, float fuel, byte[] coordinate) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.fuel = fuel;
        this.coordinate = coordinate;
    }

    public abstract void moveObject(float speed);

    protected String getValues() {
        String info = "Name car: " + name + "\n\nSpeed: "
                + speed +  " km/h" + "\nWeight: " + weight +
                "\nColor: " + color + "\nFuel: " + fuel + "L" + "\n";

        String infoCoordinates = "Coordinetes: ";

        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + ".";
        }
        return info + infoCoordinates;
    }

    class Engine {

        private boolean IsReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.IsReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady) {
            this.IsReady = isReady;
        }

        public void info() {
            if(IsReady)
                System.out.println("Engine in order");
            else
                System.out.println("Engine broken, engine passed: " + this.km + "km");
        }

    }
}
