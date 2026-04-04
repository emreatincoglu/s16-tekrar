package org.example.company.sirin;

public class calisan extends insan{
    private long id;
    private String departman;
    private String iseGiris;
    private int maas;
    

    private calisan(long id, String departman, String iseGiris,int maas){
        super(isim, cinsiyet, telefonNo, tcNo, adres, yas);
        this.id = id;
        this.departman = departman;
        this.iseGiris = iseGiris;
        this.maas = maas;
        System.out.println("Çalışan id: " + id + "Departmanı: " + departman +
                "İşe giriş tarihi: " + iseGiris + "Maaşı: " + maas);
    }

    private calisan(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }
    public String getDepartman(){
        return departman;
    }
    public String getIseGiris(){
        return iseGiris;
    }
    public int getMaas(){
        return maas;
    }

    public void setId(long id){
        this.id = id;
    }
    public void setDepartman(String departman){
        this.departman = departman;
    }
    public void setIseGiris(String iseGiris){
        this.iseGiris = iseGiris;
    }
    public void setMaas(int maas){
        this.maas = maas;
    }



    
}