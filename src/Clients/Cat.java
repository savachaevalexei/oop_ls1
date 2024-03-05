package Clients;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}
