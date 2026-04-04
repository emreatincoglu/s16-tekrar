package org.example.company.umit;

import org.example.company.MaasHesaplayici;

public class takimlideri extends calisan {

    public takimlideri(String isim, int yas, double bazMaas, MaasHesaplayici hesaplayici) {
        super(isim, yas, bazMaas, hesaplayici);
        super.SetUnvan("Takım Lideri");}
         public void bilgileriGoster() {
        System.out.println(
            "İsim: " + getIsim() +
            ", Yaş: " + getYas() +
            ", Ünvan: " + getUnvan() +
            ", Baz Maaş: " + super.getMaas()
        );
    }}
