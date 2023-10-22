package org.example;

public class GuerrierBuilder extends PersonnageBuilder{
    @Override
    public Personnage build() {
        return new Personnage(nom, attributs, "Equipement de Guerrier", apparence);
    }
}
