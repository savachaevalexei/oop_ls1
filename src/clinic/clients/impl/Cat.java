package clinic.clients.impl;

import clinic.clients.Animal;
import clinic.clients.Goable;
import clinic.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {
    public Cat(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public double run() {
        return 10;
    }
}
