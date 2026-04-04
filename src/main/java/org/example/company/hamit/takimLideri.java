package org.example.company.hamit;

public class takimLideri extends calisan {

    public takimlideri(String ad, int yas, double maas) 
    {
        super(ad, yas, maas);
    }

    public void ekibiYönet() 
    {
        System.out.println("takım lideri: " + ad);
    }
}
