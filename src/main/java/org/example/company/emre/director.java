package org.example.company.emre;

public class director extends calisan {

    public director(String isim, int yas, double bazMaas) {
        super(isim, yas, bazMaas);
    }

    @Override
    public String getUnvan() {
        return "Director";
    }
}
