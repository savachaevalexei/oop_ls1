import Clients.Animal;
import Clients.Dog;
import Clients.Lion;
import Clients.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лева", 200F, LocalDate.now(), new Owner());
        Dog haski = new Dog("Лаки", 30F, LocalDate.now(), new Owner());

        Lion test = new Lion();
        System.out.println(test);

        leva.live();

        List<Animal> animals = new ArrayList<>();
        animals.add(leva);
        animals.add(haski);
        animals.add(test);
        System.out.println(animals);

        // Передать новое значения для поля "вес"
        // leva.setWeight(300F);

        System.out.println(leva.getType());

        System.out.println(haski);
        System.out.println(haski.getType());

    }
}