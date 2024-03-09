package clinic.clients.impl;

import clinic.clients.*;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable {
    public Duck(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Утка клюет");

    }

    @Override
    public double fly() {
        return 2;
    }


    @Override
    public double swim() {
        return 5;
    }

    @Override
    public double run() {
        return 3;
    }
}
