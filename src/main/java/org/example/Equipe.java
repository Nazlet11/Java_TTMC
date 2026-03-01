package org.example;

public class Equipe {

    private String nomEquipe;
    private int numEquipe;
    private int nbJoueur;
    private int caseDeLequipe;

    public String getNomEquipe(){ return nomEquipe; }
    public int getNumEquipe(){ return numEquipe; }
    public int getNbJoueur(){ return nbJoueur; }
    public int getCaseDeLequipe(){ return caseDeLequipe; }

    public void setNomEquipe(String  nomJoueur){ this.nomEquipe = nomEquipe; }
    public void setNumEquipe(int numJoueur){ this.numEquipe = numEquipe; }
    public void setNbJoueur(String nomJoueur){ this.nbJoueur = nbJoueur; }
    public void setCaseDeLequipe(int caseDeLequipe){ this.caseDeLequipe = caseDeLequipe; }

    public Equipe(String nomEquipe, int numEquipe, int nbJoueur){

        this.nomEquipe = nomEquipe;
        this.numEquipe = numEquipe;
        this.nbJoueur = nbJoueur;
        this.caseDeLequipe = caseDeLequipe;
    }


    public String toString(){
        String message = "Nom : " + this.nomEquipe + " Numéro : " + this.numEquipe + ", Nombre de joueurs : " + this.nbJoueur;
        return message;
    }

    public void avancerJoueur(int nbCaseA_Avancer){
        this.caseDeLequipe = caseDeLequipe + nbCaseA_Avancer;
        System.out.println("Le joueur a avancé de " + nbCaseA_Avancer + " cases. Il est donc case " + this.caseDeLequipe + " du plateau");
    }
}

