package clinic.clients.impl;

import clinic.clients.Animal;
import clinic.clients.Goable;
import clinic.clients.Owner;

import java.time.LocalDate;

public class Lion extends Animal implements Goable {

    public Lion(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Лев ест");
    }

    @Override
    public double run() {
        return 20;
    }
}
