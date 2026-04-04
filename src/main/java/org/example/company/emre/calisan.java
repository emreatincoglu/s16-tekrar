package org.example.company.emre;

import org.example.company.MaasHesaplayici;

public class calisan extends insan {

    private double bazMaas;
    private MaasHesaplayici calisanMaasi;
    

    public calisan(String isim, int yas, double bazMaas, MaasHesaplayici hesaplama) {
        super(isim, yas);
        this.bazMaas = bazMaas;
        calisanMaasi = hesaplama;
    }

    public double getMaas() {
        return calisanMaasi.hesapla(bazMaas);
    }

    public String getUnvan() {
        return "Çalışan";
    }

    @Override
    public void bilgileriGoster() {
        System.out.println(
                "İsim: " + getIsim()
                + ", Yaş: " + getYas()
                + ", Baz Maaş: " + getMaas()
                + ", Ünvan: " + getUnvan()
        );
    }

    
}
