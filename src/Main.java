import Clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лева", 200F, LocalDate.now(), new Owner());
        Dog haski = new Dog("Лаки", 30F, LocalDate.now(), new Owner());
        Duck skrudj = new Duck("mcDuck", 10F, LocalDate.now(), new Owner());
        Parrot ara = new Parrot("Ara", 10F, LocalDate.now(), new Owner());
        Rabbit rodjer = new Rabbit("Rodjer", 2F, LocalDate.now(), new Owner());
        Fish doroti = new Fish("Doroti", 0.05F, LocalDate.now(), new Owner());
        Cat matros = new Cat("Matroskin", 1.5F, LocalDate.now(), new Owner());
//        Lion test = new Lion();
//        System.out.println(test);
//        leva.live();
//        List<Animal> animals = new ArrayList<>();
//        animals.add(leva);
//        animals.add(haski);
//        animals.add(test);
//        System.out.println(animals);
//        System.out.println(leva.getType());






    }
}