package com.umutavci;

public class Cyborg extends Roboter implements ICyborg{

    public void Essen() {
        System.out.println("hat gegessen.");
    }
    public void Schlafen(){
        System.out.println("hat geschlafen.");
    }
    public void entscheide(Gefahrensituationen gefahr) {
        Reagierung reagierung;
        switch(gefahr){
            case GEFAHR_LINKS:
                System.out.println("Bei einer GEFAHR_LINKS wird nach rechts ausgewichen.");
                reagierung = Reagierung.RECHTS;
                break;
            case GEFAHR_RECHTS:
                System.out.println("Bei einer GEFAHR_RECHTS wird nach links ausgewichen.");
                reagierung = Reagierung.LINKS;
                break;
            case GEFAHR_VORNE:
                System.out.println("Bei einer GEFAHR_VORNE wird gebremst.");
                reagierung = Reagierung.BREMSEN;
                break;
        }
    }
}
