package clinic;

import clinic.clients.*;
import clinic.clients.impl.*;
import clinic.staff.impl.Doctor;
import clinic.staff.impl.Nurse;
import clinic.vetclinic.VeterinaryClinic;


import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic.addClient(new Dog("Дружок", 7F, LocalDate.now(), new Owner()));
        clinic.addClient(new Duck("Скрудж", 7F, LocalDate.now(), new Owner()));
        clinic.addClient(new Parrot("Кеша", 7F, LocalDate.now(), new Owner()));
        clinic.addClient(new Cat("Маруся", 7F, LocalDate.now(), new Owner()));
        clinic.addClient(new Fish("Немо", 7F, LocalDate.now(), new Owner()));
        clinic.addClient(new Lion("Симба", 7F, LocalDate.now(), new Owner()));
        clinic.addClient(new Rabbit("Роджер", 7F, LocalDate.now(), new Owner()));

        System.out.println("Летающие:");
        System.out.println(clinic.getFlyable());

        System.out.println("Бегающие:");
        System.out.println(clinic.getGoable());

        System.out.println("Плавающие:");
        System.out.println(clinic.getSwimable());

        Doctor doc = new Doctor("Док", LocalDate.now(), "Хирург");
        doc.doOperation();

        Nurse nur = new Nurse("Шурка", LocalDate.now(), "Вакцинатор");
        nur.doVaccination();


    }
}

