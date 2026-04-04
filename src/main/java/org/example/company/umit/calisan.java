package org.example.company.umit;
import org.example.company.MaasHesaplayici;

public class calisan extends insan {
    private String unvan;
    private double bazMaas;
    private MaasHesaplayici hesaplayici;
    

    public calisan(String isim, int yas, double bazMaas, MaasHesaplayici hesaplayici) {
        super(isim, yas);
        this.bazMaas = bazMaas;
        this.unvan="Çalışan";
        this.hesaplayici=hesaplayici;
    }

    public double getMaas() {
        return hesaplayici.hesapla(bazMaas);
    }

    public String getUnvan() {
        return unvan;
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


