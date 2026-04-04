package org.example.company.emre;

public class departman {

    private String departmanAdi;
    private calisan[] calisanlar;
    private mudur[] mudurler;
    private takimLideri[] takimLiderleri;
    private director director;

    private int calisanSayisi;
    private int mudurSayisi;
    private int takimLideriSayisi;

    public departman(String departmanAdi, int calisanKapasite, int mudurKapasite, int takimLideriKapasite, director director) {
        this.departmanAdi = departmanAdi;
        this.calisanlar = new calisan[calisanKapasite];
        this.mudurler = new mudur[mudurKapasite];
        this.takimLiderleri = new takimLideri[takimLideriKapasite];
        this.director = director;
    }

    public String getDepartmanAdi() {
        return departmanAdi;
    }

    public director getDirector() {
        return director;
    }

    public void departmanBilgileri() {
        System.out.println("Departman Adı:" + departmanAdi + "Çalışanlar:" + calisanlar);
    }


    




}
