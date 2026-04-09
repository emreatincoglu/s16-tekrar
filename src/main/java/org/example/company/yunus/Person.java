package org.example.company.yunus;

import org.example.company.yunus.Interfaces.PersonInterface;

public class Person implements PersonInterface {
    private String name;
    private String lastName;
    private int age;
    private String phone;
    private int id;

    public Person(String name, String lastName, int age, String phone, int id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    @Override
    public void live() {
        System.out.println("Kisi hayatta.");
    }

    @Override
    public void breath() {
        System.out.println("Kisi nefes alabiliyor.");
    }

    @Override
    public int move(int meter) {
        return meter;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", id=" + id +
                '}';
    }
}
