package org.example;

public class Joueur {

    private int numJoueur;
    private String nomJoueur;
    private Equipe equipe;

    public int getNumJoueur(){ return numJoueur; }
    public String getNomJoueur(){ return nomJoueur; }

    public void setNumJoueur(int numJoueur){ this.numJoueur = numJoueur; }
    public void setNomJoueur(String nomJoueur){ this.nomJoueur = nomJoueur; }

    public Joueur(int numJoueur, String nomJoueur, Equipe equipe){
        this.numJoueur = numJoueur;
        this.nomJoueur = nomJoueur;
        this.equipe = equipe;
    }


    public String toString(){
        String message = "\n\nNuméro : " + this.numJoueur + ", Nom : " + this.nomJoueur + ",\nEquipe : " + this.equipe;
        return message;
    }

    public String getNomgetNumget(){
        String message = this.nomJoueur + ", numéro " + this.numJoueur + " de l'équipe " + this.equipe.getNomEquipe();
        return message;
    }

    public Equipe getEquipe(){
        return equipe;
    }

    public void avancerJoueur(int nbCaseA_Avancer){
        this.casesFranchiesNb = casesFranchiesNb + nbCaseA_Avancer;
        System.out.println("Le joueur a avancé de " + nbCaseA_Avancer + " cases. Il est donc case " + this.casesFranchiesNb + " du plateau");
    }
}

