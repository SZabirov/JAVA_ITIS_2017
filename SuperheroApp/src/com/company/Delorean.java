package com.company;

public class Delorean implements Flyable, Drivable {
    @Override
    public void drive() {
        System.out.println("Поехали назад в будущее!");
    }

    @Override
    public void fly() {
        System.out.println("Полетели назад в будущее!");
    }
}
