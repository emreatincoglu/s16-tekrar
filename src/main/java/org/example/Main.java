package org.example;

import org.example.company.Title;
import org.example.company.yunus.*;
import org.example.company.yunus.Interfaces.MaasHesaplayici;
import org.example.company.yunus.Salary.MaasHesapla;

public class Main {
    public static void main(String[] args) {

        MaasHesaplayici muhasebe = new MaasHesapla();


        Ceo ceo = new Ceo("Ahmet", "Kilic", 34, "555 555 55 55", 1, 50000);
        muhasebe.hesapla(ceo);
        ceo.manage();

        Director itDirector = new Director("Asli", "Cevval", 28, "545 545 54 54", 2, 40000);
        muhasebe.hesapla(itDirector);

        Department itDepartmani = new Department("IT (Bilgi Teknolojileri)", itDirector);

        Manager backendManager = new Manager("Kemal", "Sunal", 45, "533 111 22 33", 3, 30000);
        Manager frontendManager = new Manager("Hale", "Soygazi", 40, "532 444 55 66", 4, 30000);

        muhasebe.hesapla(backendManager);
        muhasebe.hesapla(frontendManager);

        itDepartmani.mudurEkle(backendManager);
        itDepartmani.mudurEkle(frontendManager);

        TeamLeader apiTakimLideri = new TeamLeader("Barış", "Manço", 35, "501 000 11 22", 5, 25000);
        TeamLeader uiTakimLideri = new TeamLeader("Cem", "Karaca", 38, "502 999 88 77", 6, 25000);

        muhasebe.hesapla(apiTakimLideri);
        muhasebe.hesapla(uiTakimLideri);

        itDepartmani.takimLideriEkle(apiTakimLideri);
        itDepartmani.takimLideriEkle(uiTakimLideri);

        Employee dev1 = new Employee("Rahmi", "Aslan", 23, "523 523 25 25", 7, Title.EMPLOYEE, 20000, "Backend Developer");
        Employee dev2 = new Employee("Ayşe", "Yılmaz", 25, "524 123 45 67", 8, Title.EMPLOYEE, 20000, "Frontend Developer");
        Employee qa1 = new Employee("Fatma", "Kaya", 26, "525 987 65 43", 9, Title.EMPLOYEE, 18000, "QA Tester");

        muhasebe.hesapla(dev1);
        muhasebe.hesapla(dev2);
        muhasebe.hesapla(qa1);

        itDepartmani.calisanEkle(dev1);
        itDepartmani.calisanEkle(dev2);
        itDepartmani.calisanEkle(qa1);


        System.out.println("\n======================================");
        System.out.println("   GÜNCEL DEPARTMAN DURUM RAPORU      ");
        System.out.println("======================================");

        itDepartmani.departmanRaporu();
    }
}