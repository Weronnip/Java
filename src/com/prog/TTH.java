package com.prog;

public class TTH {
    public static void main(String[] args) {
        // OOP: classes and objects

//        Car bmw = new Car(
//                "BMW m5 F99",
//                375.5f,
//                2000,
//                "Black",
//                60f,
//                new byte[] {(byte) 100, 43, 65});
//
//        Car lab = new Car(
//                "Lambor",
//                345f,
//                1955,
//                "Gold",
//                80f,
//                new byte[] {(byte) 23, 65, 123}
//
//        );
//        lab.engine.setValues(true, 10334);
//        lab.engine.info();
//
//
//        Truck Kamaz = new Truck(
//                "Kamaz",
//                255f,
//                2334,
//                "BlackGreen",
//                new byte[] {(byte) 123, 127, 23}
//        );
//        Kamaz.engine.setValues(false, 105450);
//        Kamaz.engine.info();

        Car flycar = new Car(
                "Goniger",
                454f,
                2000,
                "Black",
                234f,
                new byte[] {(byte) 25, 36, 76}
        ) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Fly Car");
            }
        };

        flycar.moveObject(4798);

    }

}
