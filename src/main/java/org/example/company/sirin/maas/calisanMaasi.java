package org.example.company.sirin.maas;

import org.example.company.MaasHesaplayici;

public class calisanMaasi implements MaasHesaplayici{
    private double vergiOrani;
    private double brutMaasi;

    public double getVergiOrani(){
        return vergiOrani;
    }
    public double getBrutMaasi(){
        return brutMaasi;
    }

    public calisanMaasi(double vergiOrani, double brutMaasi){
        this.vergiOrani = vergiOrani;
        this.brutMaasi = brutMaasi;
    }

    public double hesapla(double bazMaas) {
        double netMaasi = bazMaas + (brutMaasi * vergiOrani);
        return netMaasi;
    }
}
 

