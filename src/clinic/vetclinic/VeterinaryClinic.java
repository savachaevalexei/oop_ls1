package clinic.vetclinic;

import clinic.clients.Animal;
import clinic.clients.Flyable;
import clinic.clients.Goable;
import clinic.clients.Swimable;
import clinic.staff.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {
    private final List<Staff> staff;
    private final List<Animal> animals;

    public VeterinaryClinic(){
        this.animals = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public List<Animal> getSwimable(){
        List<Animal> swimable = animals.stream().filter(pat -> pat instanceof Swimable).collect(Collectors.toList());
        return swimable;
    }

    public List<Animal> getGoable(){
        List<Animal> goable = animals.stream().filter(pat -> pat instanceof Goable).collect(Collectors.toList());
        return goable;
    }

    public List<Animal> getFlyable(){
        List<Animal> flyable = animals.stream().filter(pat -> pat instanceof Flyable).collect(Collectors.toList());
        return flyable;
    }

    public void addClient(Animal client){
        animals.add(client);
    }

    public void addStaff(Staff worker){
        staff.add(worker);
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public List<Animal> getAnimals() {
        return animals;
    }


}
