package com.company;

public class Main {

    public static void main(String[] args) {
        Batman batman = new Batman();
        Delorean delorean = new Delorean();
        BatMobile batMobile = new BatMobile();
        batman.getToThePlaceSimply(batMobile);
        ScoobyDooCar scoobyDooCar = new ScoobyDooCar();
        batman.getToThePlaceSimply(scoobyDooCar);
    }
}
