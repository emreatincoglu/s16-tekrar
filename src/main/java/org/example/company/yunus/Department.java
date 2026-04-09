package org.example.company.yunus;

import org.example.company.yunus.Interfaces.DepartmentInterface;

import java.util.ArrayList;
import java.util.List;

public class Department implements DepartmentInterface {
    private String isim;
    private Director direktor;

    private List<Employee> calisanlar;
    private List<Manager> mudurler;
    private List<TeamLeader> takimLiderleri;

    public Department(String isim, Director direktor) {
        this.isim = isim;
        this.direktor = direktor;

        this.calisanlar = new ArrayList<>();
        this.mudurler = new ArrayList<>();
        this.takimLiderleri = new ArrayList<>();
    }


    public void calisanEkle(Employee yeniCalisan) {
        calisanlar.add(yeniCalisan);
    }

    public void takimLideriEkle(TeamLeader yeniLider) {
        takimLiderleri.add(yeniLider);
    }

    public void mudurEkle(Manager yeniMudur) {
        mudurler.add(yeniMudur);
    }

    @Override
    public void departmanRaporu() {
        System.out.println("Departman: " + isim);
        System.out.println("Direktör: " + direktor.getName());

        System.out.println("// --- // Calisanlar // // --- //)");
        for (Employee calisan : calisanlar) {
            System.out.println(calisan.toString());
        }
        System.out.println("Calisan sayisi " + calisanlar.size());

        System.out.println("// --- // Takim Liderleri // // --- //)");
        for (TeamLeader takimLideri : takimLiderleri) {
            System.out.println(takimLideri.toString());
        }
        System.out.println("Takim Lideri sayisi " + takimLiderleri.size());

        System.out.println("// --- // Mudurler // // --- //)");
        for (Manager mudur : mudurler) {
            System.out.println(mudur.toString());
        }
        System.out.println("Mudur Sayisi" + mudurler.size());
    }
}