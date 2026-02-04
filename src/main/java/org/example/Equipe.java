package org.example;

public class Equipe {

    private String nomEquipe;
    private int numEquipe;
    private int nbJoueur;

    public String getNomEquipe(){ return nomEquipe; }
    public int getNumEquipe(){ return numEquipe; }
    public int getNbJoueur(){ return nbJoueur; }

    public void setNomEquipe(String  nomJoueur){ this.nomEquipe = nomEquipe; }
    public void setNumEquipe(int numJoueur){ this.numEquipe = numEquipe; }
    public void setNbJoueur(String nomJoueur){ this.nbJoueur = nbJoueur; }

    public Equipe(String nomEquipe, int numEquipe, int nbJoueur){

        this.nomEquipe = nomEquipe;
        this.numEquipe = numEquipe;
        this.nbJoueur = nbJoueur;
    }


    public String toString(){
        String message = "Nom : " + this.nomEquipe + " Numéro : " + this.numEquipe + ", Nombre de joueurs : " + this.nbJoueur;
        return message;
    }

    public void avancerJoueur(){
    }
}

