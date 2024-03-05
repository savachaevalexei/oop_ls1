package Clients;

import java.time.LocalDate;

public class Parrot extends Animal{
    public Parrot(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}
