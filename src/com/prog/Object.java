package com.prog;

public class Object {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;
    public float fuel;
    public String name;

    public void setValues(String _name, float _speed, int _weight, String _color, float _fuel, byte[] _coordinate) {
        name = _name;
        speed = _speed;
        weight = _weight;
        color = _color;
        fuel = _fuel;
        coordinate = _coordinate;
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
