package org.example;

public class Personnage {
    private String nom;
    private String attributs;
    private String equipement;
    private String apparence;

    public Personnage(String nom, String attributs, String equipement, String apparence) {
        this.nom = nom;
        this.attributs = attributs;
        this.equipement = equipement;
        this.apparence = apparence;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Attributs : " + attributs);
        System.out.println("Equipement : " + equipement);
        System.out.println("Apparence : " + apparence);
    }
}
