package clinic.staff;

import java.time.LocalDate;

public abstract class Staff {
    protected String name;
    protected LocalDate age;
    protected String specialization;

    public Staff(String name, LocalDate age, String specialization){
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }





    public String getType() {
        return getClass().getSimpleName();
    }
    public String toString() {
        return String.format("name=%s,  age=%s, specialization=%s", name, age, specialization);
    }
}
