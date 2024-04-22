package com.umutavci;

public class Roboter extends lebend implements IRoboter{
    public void Aufladen(){
        System.out.println("hat aufgeladen");
    }
    public void Warten(){
        System.out.println("hat gewartet");
    }

    @Override
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
