package clinic.clients.impl;

import clinic.clients.Animal;
import clinic.clients.Goable;
import clinic.clients.Owner;
import clinic.clients.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Собака грызет");
    }

    @Override
    public double run() {
        return 15;
    }

    @Override
    public double swim() {
        return 5;
    }
}
