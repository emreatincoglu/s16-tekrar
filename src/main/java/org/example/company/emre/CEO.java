package org.example.company.emre;

public class CEO extends calisan {

    public CEO(String isim, int yas, double maas) {
        super(isim, yas, maas);
    }

    @Override
    public String getUnvan() {
        return "CEO";
    }
}