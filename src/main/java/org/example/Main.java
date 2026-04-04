package org.example;

//s o l i d -> clean code.

//s -> single resp.
//o -> open/close
//l -> liskov
//i -> interface seg.
//d -> dependency inversion (DI) -> depenecy injection

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.work();

        Hammer ham = new Hammer();
        ham.start();

        Tool tool1 = new Hammer();
        tool1.work();

        HammerInterface hammerInterface = new Hammer();
        hammerInterface.nail();

        Workable hammerWorkable = new Hammer();
        hammerWorkable.work();
        hammerWorkable.start();

        SkrewDriver skrewDriver = new SkrewDriver();


        Hammer objWithInterface = new Hammer(skrewDriver);
        objWithInterface.nail();

        objWithInterface.setHammer(skrewDriver);

     



    }
}