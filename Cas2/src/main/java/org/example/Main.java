package org.example;

public class Main {
    public static void main(String[] args) {
        PersonnageBuilder guerrierBuilder = new GuerrierBuilder();
        Personnage guerrier = guerrierBuilder
                .setNom("Guerrier 1")
                .setAttributs("Force élevée, Agilité moyenne, Intelligence faible")
                .setEquipement("Epee à deux mains")
                .setApparence("Apparence du guerrier")
                .build();

        PersonnageBuilder mageBuilder = new MageBuilder();
        Personnage mage = mageBuilder
                .setNom("Mage 1")
                .setAttributs("Force faible, Agilité moyenne, Intelligence élevée")
                .setApparence("Apparence du mage")
                .build();

        PersonnageBuilder dragonBuilder = new DragonBuilder();
        Personnage dragon = dragonBuilder
                .setNom("Dragon 1")
                .setAttributs("Force élevée, Agilité moyenne, Intelligence moyenne")
                .setApparence("Apparence du dragon")
                .build();

        guerrier.afficher();
        mage.afficher();
        dragon.afficher();
    }
}