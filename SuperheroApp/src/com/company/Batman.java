package com.company;

public class Batman extends Superhero {
    @Override
    void getToThePlace() {
        System.out.println("На-на-на-на! Batman прибыл!");
    }

    //Добраться быстро
    void getToThePlaceSimply(Drivable vehicle) {
        vehicle.drive();
    }

//    void getToThePlaceImmediately(Delorean delorean) {
//        delorean.drive();
//    }
//
//    void getToThePlaceImmediately(BatMobile batMobile) {
//        batMobile.drive();
//    }

    //Добраться неспеша
    void getToThePlaceImmediately() {

    }
}
