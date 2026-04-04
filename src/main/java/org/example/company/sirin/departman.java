package org.example.company.sirin;

public class departman{
    private String fullName;
    private calisan[] calisanlar;
    private mudur[] mudurler;
    private director[] directors;
    private takimLideri[] takimLiderleri;


    public departman (String fullName,calisan[] calisanlar,mudur[] mudurler,director[] directors,takimLideri[] takimLiderleri){
        this.fullName = fullName;
        this.calisanlar=calisanlar;
        this.mudurler=mudurler;
        this.directors=directors;
        this.takimLiderleri=takimLiderleri;
    
    }

    public String getFullName(){
        return fullName;
    }

    public calisan[] getCalisanlar(){
        return calisanlar;
    }
    public mudur[] getMudurler(){
        return mudurler;
    }

    public director[] getDirectors (){
        return directors;
    }

    public takimLideri[] getTakimLiderleri(){
        return takimLiderleri;
    }

}