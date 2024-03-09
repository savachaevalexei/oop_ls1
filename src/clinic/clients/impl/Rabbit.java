package clinic.clients.impl;

import clinic.clients.Animal;
import clinic.clients.Goable;
import clinic.clients.Owner;

import java.time.LocalDate;

public class Rabbit extends Animal implements Goable {
    public Rabbit(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Кролик грызет");
    }

    @Override
    public double run() {
        return 20;
    }
}
