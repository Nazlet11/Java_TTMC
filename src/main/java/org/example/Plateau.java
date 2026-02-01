package org.example;

import java.util.ArrayList;

public class Plateau {
    private int nbCase;

    public int getNbCase(){return nbCase;}

    public void setNbCase(){this.nbCase = this.nbCase;}

    public Plateau(int nbCase){
        this.nbCase = nbCase;
    }

    public void afficherCasesJoueurs(ArrayList<Joueur> joueurs){
        System.out.println("");
        for (Joueur lejoueur : joueurs) {
            int nbCaseRestante = nbCase - lejoueur.getCase();
            System.out.println("Le joueur " + lejoueur.getNomJoueur() + " est case " + lejoueur.getCase() + " il est a " + nbCaseRestante + " cases de la fin");
        }
    }


}
