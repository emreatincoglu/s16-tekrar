package org.example.company.sirin;

public class takimLideri{
    private String fullName;
    private departman[] departmans;



    public takimLideri(String fullName,departman[] departmans){
        this.fullName=fullName;
        this.departmans=departmans;
    }


    public String getFullName(){
        return fullName;
    }


    public departman[] departmans(){
        return departmans;
    }
}