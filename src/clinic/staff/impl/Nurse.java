package clinic.staff.impl;

import clinic.staff.Staff;

import java.time.LocalDate;

public class Nurse extends Staff {
    public Nurse(String name, LocalDate age, String specialization) {
        super(name, age, specialization);
    }

    public void doVaccination(){
        if (getType().equals("Nurse"))
            System.out.println("Проводит вакцинацию");
    }
}
