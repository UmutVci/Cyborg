package com.umutavci;

public class Mensch extends lebend implements IMensch{
    public void Essen() {
        System.out.println("hat gegessen.");
    }
    public void Schlafen(){
        System.out.println("hat geschlafen.");
    }
    @Override
    public void entscheide(Gefahrensituationen gefahr){
        int moglichkeit = (int)(Math.random()*100);
        Reagierung reagierung;
        if(moglichkeit < 25){
            reagierung = Reagierung.UNENTSCHEIDEN;
            System.out.println("TOT");
        }
        else{
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
    };


}
