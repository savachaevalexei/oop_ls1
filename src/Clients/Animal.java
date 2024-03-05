package Clients;

import java.time.LocalDate;

public class Animal {
    protected   String name;
    protected Float weight;
    protected LocalDate age;
    protected Owner owner;
    public Animal(String name, Float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public Animal() {
        this("ЖИВОТНОЕ", 100F, LocalDate.now(), new Owner());
    }

    private void sleep (){
        System.out.println(getType() + " Sleep");
    }
    private void wakeUp(){
        System.out.println(getType() + " Wake up");
    }
    private void wakeUp(int time ){

        System.out.println(getType() + " Wake up in " + time);
    }
    private void eat(){
        System.out.println(getType() + " Eat");
    }
    private void play(){
        System.out.println(getType() + " Play");
    }

    public void toGo(){
        if (getType().equals("Cat") || getType().equals("Rabbit") || getType().equals("Duck") || getType().equals("Dog") || getType().equals("Lion"))
            System.out.println(getType() + " Go");
    }

    public void fly(){
        if (getType().equals("Duck") || getType().equals("Parrot"))
            System.out.println(getType() + " fly");
    }

    public void swim(){
        if (getType().equals("Fish") || getType().equals("Duck"))
            System.out.println(getType() + "swim");
    }

    public void live(){
        wakeUp(10);
        eat();
        play();
        sleep();
    }
    public String getName() {
        return name;
    }

    public Float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("name=%s, weight=%s, age=%s, owner=%s", name, weight, age, owner);
    }

}
