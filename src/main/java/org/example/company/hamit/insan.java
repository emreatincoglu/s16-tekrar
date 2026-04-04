package org.example.company.hamit;

import org.example.company.insanInterface;

public class insan implements insanInterface {

    public void live() {
        System.out.println(isim + " yaşamına devam ediyor.");
    }
    

    public int move(int meter) {
        System.out.println("İnsan " + meter + " metre hareket etti.");
        return meter;
    }

    public void breath() {
        System.out.println(isim + "nefes alıyor.");
    }

    private String isim;
    private int yas;

    public insan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim + "Yaş:" + yas);
    }

}

