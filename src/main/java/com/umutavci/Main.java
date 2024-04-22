package com.umutavci;

public class Main {
    public static void main(String[] args) {
        Cyborg cyborg = new Cyborg();
        Mensch mensch = new Mensch();
        Roboter roboter= new Roboter();
        mensch.entscheide(Gefahrensituationen.GEFAHR_RECHTS);

    }
}