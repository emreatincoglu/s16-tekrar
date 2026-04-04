package org.example.company.sirin;

public class director {
    private String fullName;
    private departman[] departmans;



    public director (String fullName,departman[] departmans){
        this.fullName = fullName;
        this.departmans=departmans;
    }
    public String getFullName(){
        return  fullName;
    }

    public departman[] getDepartmans(){
        return departmans;
    }
}