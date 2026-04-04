
package org.example.company.sirin;
import org.example.company.insanInterface;

public class insan implements insanInterface {
    private String isim;
    private String cinsiyet;
    private int telefonNo;
    private String tcNo;
    private String adres;
    private int yas;


    @Override
    public void live(){
        System.out.println("Çalışan hayatta.");
    }

    @Override
    public int move(int meter){
        return meter ;
    }

    @Override
    public void breath(){
        System.out.println("Çalışan nefes alabiliyor.")
    }



    private void insan(String isim, int yas){
        this.isim = isim;
        this.yas = yas;
    }

    private void insan(String isim, String cinsiyet, 
    int telefonNo, String tcNo,  String adres, int yas ){
        System.out.println("İsim: " + isim + "Cinsiyet: " + cinsiyet + "Telefon numarası: " + telefonNo +
        "Tc kimlik no: " + tcNo + "Adres: " + adres + "Yaşı: " + yas)        )
    }

    public String getIsim(){
        return isim;
    }
    public String getCinsiyet(){
        return cinsiyet;
    }
    public int getTelefonNo(){
        return telefonNo;
    }
    public String getTcNo(){
        return tcNo;
    }
    public String getAdres(){
        return adres;
    }
    public int getYas(){
        return yas;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }
    public void setCinsiyet(String cinsiyet){
        this.cinsiyet = cinsiyet;
    }
    public void setTelefonNo(int telefonNo){
        this.telefonNo = telefonNo;
    }
    public void tcNo(String tcNo){
        this.tcNo = tcNo;
    }
    public void setAdres(String adres){
        this.adres = adres;
    }
    public void setYas(int yas){
        this.yas = yas;
    }


}