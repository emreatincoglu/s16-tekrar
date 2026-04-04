package org.example.company.hamit;
import org.example.company.MaasHesaplayici;

public class calisan extends insan {
    private String unvan;
    private double bazMaas;
    

    public calisan(String isim, int yas, double bazMaas) {
        super(isim, yas);
        this.bazMaas = bazMaas;
        this.unvan="Çalışan";
        
    }

    public double getMaas(MaasHesaplayici hesaplayici) {
        return hesaplayici.hesapla(bazMaas);
    }

    public String getUnvan() {
        return "Çalışan";
    }

    public void bilgileriGoster() {
        System.out.println(
            "İsim:" + getIsim() +
            ", Yas:" +  getYas() +
            ", bazMaas:" + getMaas() +
            ", Ünvan:" + getUnvan()
        );
    }
    public void SetUnvan(String unvan){
        this.unvan = unvan;
    }

}


