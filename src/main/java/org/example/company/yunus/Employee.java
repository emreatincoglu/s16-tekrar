package org.example.company.yunus;

import org.example.company.Title;

public class Employee extends Person {
    private Title title;
    private double salary;
    private String occupation;

    public Employee(String name, String lastName, int age, String phone, int id, Title title, double salary ) {
        super(name, lastName, age, phone, id);
        this.title = title;
        this.salary = salary;
    }

    public Employee(String name, String lastName, int age, String phone, int id, Title title, double salary, String occupation  ) {
        super(name, lastName, age, phone, id);
        this.title = title;
        this.salary = salary;
        this.occupation = occupation;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        if(Title.EMPLOYEE.equals(title)){
            return "Employee Bilgileri: " + super.toString() +
                " | Unvan: " + title +
                    " | Is Alani: " + occupation +
                " | Maaş: " + salary;
        }
        return "Employee Bilgileri: " + super.toString() +
                " | Unvan: " + title +
                " | Maaş: " + salary;
    }


}
