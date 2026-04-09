package org.example.company.yunus;

import org.example.company.Title;
import org.example.company.yunus.Interfaces.ManageInterface;

public class Manager extends Employee implements ManageInterface {
    public Manager(String name, String lastName, int age, String phone, int id, double salary) {
        super(name, lastName, age, phone, id, Title.MANAGER, salary);
    }

        @Override
        public void manage() {
            System.out.println(getTitle().getAciklama() + " " +  getName() + " " + "yonetiyor.");
        }
    }
