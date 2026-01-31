package org.example;

import java.util.Scanner;

public class CarteBot {

    private String sujet;
    private int difficulté;
    private String question;
    private String reponse;

    public String getSujet(){return sujet;}
    public int getDifficulté(){return difficulté;}
    public String getQuestion(){return question;}

    public CarteBot(String sujet, int difficulté, String question){
        this.sujet = "Féculents";
        this.difficulté = 1;
        this.question = "Sont-ils d'orgine animale ou végétale?";
        this.reponse = "Vegetale";
    }

    public void pickUneCarte(Scanner sc){
        // faire randomisation de carte
        int difMax = 10;
        System.out.println("Choisissez une difficulté : ");
        int difChoisie = Integer.parseInt(sc.nextLine());
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
        /*
        this.sujet = sujetCarte;
        this.difficulté = difCarte;
        this.question = quesCarte;
        this.reponse = repCarte;
         */
    }

    public void reponseJugement(Joueur joueur, Scanner sc){
        System.out.println("Repondez sans détérminants");
        String reponseJoueur = sc.nextLine();
        if (reponseJoueur.equalsIgnoreCase(reponse)){
            joueur.avancerJoueur(difficulté);
            System.out.println("Bonne réponse!");
        } else{
            System.out.println("Mauvaise réponse!");
        }

    }
}
