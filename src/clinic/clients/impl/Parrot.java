package clinic.clients.impl;

import clinic.clients.Animal;
import clinic.clients.Flyable;
import clinic.clients.Owner;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable {
    public Parrot(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("попугай клюет");
    }

    @Override
    public double fly() {
        return 1;
    }
}
