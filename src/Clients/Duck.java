package Clients;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String name, Float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}
