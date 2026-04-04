package org.example;

public class Hammer extends Tool implements HammerInterface, Workable{

    private HammerInterface _hammerInterface;

    public Hammer() {
    }

    public Hammer(HammerInterface hammerInterface)
    {
        _hammerInterface = hammerInterface;
    }

    public void setHammer(HammerInterface hammerInterface)
    {
        _hammerInterface = hammerInterface;
    }

    @Override
    public void start()
    {
        System.out.println("hammer is starting...");
    }

    @Override
    public void nail()
    {
        if(_hammerInterface != null){
            _hammerInterface.nail();
        }else{
            System.out.println("hammer is nailing");
        }
    }
}
