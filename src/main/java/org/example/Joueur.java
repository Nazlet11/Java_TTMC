package org.example;

public class Joueur {

    private int casesFranchiesnb;
    private String nomJoueur;

    public int getCasesFranchiesnb(){ return casesFranchiesnb; }
    public String getNomJoueur(){ return nomJoueur; }

    public void setCasesFranchiesnb(int numJoueur){ this.casesFranchiesnb = casesFranchiesnb; }
    public void setNomJoueur(String nomJoueur){ this.nomJoueur = nomJoueur; }

    public Joueur(String nomJoueur){
        this.casesFranchiesnb = 0;
        this.nomJoueur = nomJoueur;
    }


    public String toString(){
        String message = "Nom : " + this.nomJoueur + ", Nombre de cases franchies : " + this.casesFranchiesnb;
        return message;
    }

    public void avancerJoueur(){
    }
}

