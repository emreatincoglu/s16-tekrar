package org.example.company.yunus;

import org.example.company.Title;
import org.example.company.yunus.Interfaces.ManageInterface;

public class Ceo extends Employee implements ManageInterface {
    public Ceo(String name, String lastName, int age, String phone, int id, double salary ) {
        super(name, lastName, age, phone, id, Title.CEO, salary);
    }

    @Override
    public void manage() {
        System.out.println(getTitle().getAciklama() + " " +  getName() + " " + "yonetiyor.");
    }
}
