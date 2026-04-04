package org.example.company.emre;

public class takimLideri extends calisan {

    public takimLideri(String isim, int yas, double bazMaas) {
        super(isim, yas, bazMaas);
    }

    @Override
    public String getUnvan() {
        return "Takım Lideri";
    }
}
