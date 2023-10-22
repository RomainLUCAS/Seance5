package org.example;

public class DragonBuilder extends PersonnageBuilder{
    @Override
    public Personnage build() {
        return new Personnage(nom, attributs, "Equipement de Dragon", apparence);
    }
}
