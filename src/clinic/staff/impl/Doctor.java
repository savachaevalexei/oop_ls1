package clinic.staff.impl;

import clinic.staff.Staff;

import java.time.LocalDate;

public class Doctor extends Staff {
    public Doctor(String name, LocalDate age, String specialization) {
        super(name, age, specialization);
    }

    public void doOperation(){
        if (getType().equals("Doctor"))
            System.out.println("Проводит операцию");
    }
}
