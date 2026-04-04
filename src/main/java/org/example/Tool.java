package org.example;

public class Tool implements Workable {

    public Tool() {
    }

    public void work(){
        System.out.println("tool is working");
    }

    @Override
    public void start() {

    }

    //bunun burda ne isi var.
//    public int GenerateNumber(){
//        return 4;
//    }

}
