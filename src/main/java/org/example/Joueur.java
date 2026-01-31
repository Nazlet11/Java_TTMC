package org.example;

public class Joueur {

    private int casesFranchiesNb;
    private int numJoueur;
    private String nomJoueur;
    private Equipe equipe;

    public int getCasesFranchiesNb(){ return casesFranchiesNb; }
    public int getNumJoueur(){ return numJoueur; }
    public String getNomJoueur(){ return nomJoueur; }

    public void setCasesFranchiesNb(int numJoueur){ this.casesFranchiesNb = casesFranchiesNb; }
    public void setNumJoueur(int numJoueur){ this.numJoueur = numJoueur; }
    public void setNomJoueur(String nomJoueur){ this.nomJoueur = nomJoueur; }

    public Joueur(int numJoueur, String nomJoueur, Equipe equipe){
        this.casesFranchiesNb = 0;
        this.numJoueur = numJoueur;
        this.nomJoueur = nomJoueur;
        this.equipe = equipe;
    }


    public String toString(){
        String message = "\n\nNuméro : " + this.numJoueur + ", Nom : " + this.nomJoueur + ", Nombre de cases franchies : " + this.casesFranchiesNb + "\nEquipe : " + this.equipe;
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
    }
}

