package Clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}
