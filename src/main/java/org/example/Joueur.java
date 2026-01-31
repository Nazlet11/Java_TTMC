package org.example;

public class Joueur {

    private int casesFranchiesnb;
    private int numJoueur;
    private String nomJoueur;
    private Equipe equipe;

    public int getCasesFranchiesnb(){ return casesFranchiesnb; }
    public int getNumJoueur(){ return numJoueur; }
    public String getNomJoueur(){ return nomJoueur; }

    public void setCasesFranchiesnb(int numJoueur){ this.casesFranchiesnb = casesFranchiesnb; }
    public void setNumJoueur(int numJoueur){ this.numJoueur = numJoueur; }
    public void setNomJoueur(String nomJoueur){ this.nomJoueur = nomJoueur; }

    public Joueur(int numJoueur, String nomJoueur, Equipe equipe){
        this.casesFranchiesnb = 0;
        this.numJoueur = numJoueur;
        this.nomJoueur = nomJoueur;
        this.equipe = equipe;
    }


    public String toString(){
        String message = "Numéro : " + this.numJoueur + ", Nom : " + this.nomJoueur + ", Nombre de cases franchies : " + this.casesFranchiesnb + " , Equipe : " + this.equipe;
        return message;
    }

    public void avancerJoueur(){
    }
}

