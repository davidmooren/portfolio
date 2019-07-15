package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, Date birthDate, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return    "ID Emp:         " + getId() + "\n"
                + "Nombre Emp:     " + getFirstName() + " " + getLastName() + "\n"
                + "Fecha Nacim:    " + new SimpleDateFormat("MMM d, yyyy").format(getBirthDate()) + "\n"
                + "Salario:        " + NumberFormat.getCurrencyInstance().format((double) getSalary());
    }
}