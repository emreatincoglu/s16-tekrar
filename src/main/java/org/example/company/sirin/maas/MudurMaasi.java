package org.example.company.sirin.maas;

public class MudurMaasi extends calisanMaasi{
    private int tecrubeYili;

    public int getTecrubeYili(){
        super(vergiOrani, brutMaasi);
        return tecrubeYili;
    }

    public MudurMaasi(double vergiOrani, double brutMaasi, int tecrubeYili){
        super(vergiOrani, brutMaasi);
        this.tecrubeYili = tecrubeYili;
    }


}