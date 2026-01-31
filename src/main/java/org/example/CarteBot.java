package org.example;

public class CarteBot {

    private String sujet;
    private int difficulté;
    private String question;

    public String getSujet(){return sujet;}
    public int getDifficulté(){return difficulté;}
    public String getQuestion(){return question;}

    public CarteBot(String sujet, int difficulté, String question){
        this.sujet = "Féculents";
        this.difficulté = 1;
        this.question = "Sont-ils d'orgine animale ou végétale?";
    }

    public void pickUneCarte(){
        // a faire
    }

    public void reponseJugement(){
        // a faire
    }
}
