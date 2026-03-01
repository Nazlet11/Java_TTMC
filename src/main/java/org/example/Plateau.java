package org.example;

import java.util.ArrayList;

public class Plateau {
    private int nbCase;

    public int getNbCase(){return nbCase;}

    public void setNbCase(){this.nbCase = this.nbCase;}

    public Plateau(int nbCase){
        this.nbCase = nbCase;
    }

    public void afficherCasesJoueurs(ArrayList<Equipe> equipes){
        System.out.println("");
        for (Equipe equipe : equipes) {
            int nbCaseRestante = nbCase - equipe.getCaseDeLequipe();
            System.out.println("L'équipe " + equipe.getNomEquipe() + " est case " + equipe.getCaseDeLequipe() + " , et est a " + nbCaseRestante + " cases de la fin");
        }
    }


}
