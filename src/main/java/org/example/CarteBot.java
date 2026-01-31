package org.example;

import java.util.Scanner;

public class CarteBot {

    private String sujet;
    private int difficulté;
    private String question;
    private String reponse;
    Scanner sc;

    public String getSujet(){return sujet;}
    public int getDifficulté(){return difficulté;}
    public String getQuestion(){return question;}

    public CarteBot(String sujet, int difficulté, String question){
        this.sujet = "Féculents";
        this.difficulté = 1;
        this.question = "Sont-ils d'orgine animale ou végétale?";
    }

    public void pickUneCarte(){
        // faire randomisation de carte
        int difMax = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez une difficulté : ");
        int difChoisie = sc.nextInt();
        while(true){
            if (difChoisie > difMax || difChoisie < 1){
                System.out.println("Ce chiffre n'est pas valide");
                System.out.println("Choisissez une difficulté : ");
                difChoisie = sc.nextInt();
                continue;
            } else {
            System.out.println("Le joueur a choisie la difficulté " + difChoisie + "!");
            break;
            }
        }
        // faire set up des variable de carteBot
    }

    public boolean reponseJugement(String reponseJoueur, Joueur joueur){
        System.out.println("Repondez sans détérminants");
        if (reponseJoueur.equalsIgnoreCase(reponse)){
            joueur.avancerJoueur();
            return true;
        } else{
            return false;
        }

    }
}
