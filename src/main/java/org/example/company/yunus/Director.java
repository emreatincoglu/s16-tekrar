package org.example.company.yunus;

import org.example.company.Title;
import org.example.company.yunus.Interfaces.ManageInterface;

public class Director extends Employee implements ManageInterface {
    public Director(String name, String lastName, int age, String phone, int id, double salary) {
        super(name, lastName, age, phone, id, Title.DIRECTOR, salary);
    }

    @Override
    public void manage() {
        System.out.println(getTitle().getAciklama() + " " +  getName() + " " + "Direktif veriyor.");
    }
}
