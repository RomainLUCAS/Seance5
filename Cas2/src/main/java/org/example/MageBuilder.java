package org.example;

public class MageBuilder extends PersonnageBuilder{
    @Override
    public Personnage build() {
        return new Personnage(nom, attributs, "Equipement de Mage", apparence);
    }
}
