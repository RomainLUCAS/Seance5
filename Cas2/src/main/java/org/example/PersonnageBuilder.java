package org.example;

public abstract class PersonnageBuilder {
    protected String nom;
    protected String attributs;
    protected String equipement;
    protected String apparence;

    public PersonnageBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public PersonnageBuilder setAttributs(String attributs) {
        this.attributs = attributs;
        return this;
    }

    public PersonnageBuilder setEquipement(String equipement) {
        this.equipement = equipement;
        return this;
    }

    public PersonnageBuilder setApparence(String apparence) {
        this.apparence = apparence;
        return this;
    }

    public abstract Personnage build();
}
