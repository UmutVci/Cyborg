package com.umutavci;

public abstract class lebend{

    public void Autofahren(){
        System.out.println(" ist Auto gefahren");
    };
    public void Arbeiten(){
        System.out.println(" hat gerarbeitet");
    }
    public abstract void entscheide(Gefahrensituationen gefahr);

}
