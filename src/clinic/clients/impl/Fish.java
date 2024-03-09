package clinic.clients.impl;

import clinic.clients.Animal;
import clinic.clients.Owner;
import clinic.clients.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }

    @Override
    public double swim() {
        return 10;
    }
}
