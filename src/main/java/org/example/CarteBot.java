package org.example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CarteBot {

    private String sujet;
    private int difficulté;
    private String question;
    private String reponse;
    private String cheminCarte;

    public String getSujet(){return sujet;}
    public int getDifficulté(){return difficulté;}
    public String getQuestion(){return question;}
    public String getCheminCarte(){return cheminCarte;}

    public void setCheminCarte(String cheminCarte){this.cheminCarte = cheminCarte;}

    public CarteBot(String sujet, int difficulté, String question){
        this.sujet = "Féculents";
        this.difficulté = 1;
        this.question = "Sont-ils d'orgine animale ou végétale?";
        this.reponse = "Vegetale";
        this.cheminCarte = "C:/CartesCSV/plaisir.csv";
    }

    public void lectureQuestion(){

        try (BufferedReader br = new BufferedReader(new FileReader(cheminCarte))) {

            String ligne = br.readLine();

                String[] colonnes = ligne.split(";");

                if (colonnes[2] != null){
                    this.question = colonnes[2];

                    System.out.println(colonnes[2] + " | " + colonnes[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectionDifficulte(Scanner sc){

        try (BufferedReader br = new BufferedReader(new FileReader(cheminCarte))) {

            String ligne;

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
                System.out.println("Le joueur a choisi la difficulté " + difChoisie + "!");
                break;
                }
            }


            while ((ligne = br.readLine()) != null) {

                String[] colonnes = ligne.split(";");

                if (Integer.parseInt(colonnes[1]) == difChoisie){
                    this.sujet = colonnes[0];
                    this.difficulté = Integer.parseInt(colonnes[1]);
                    this.question = colonnes[2];
                    this.reponse = colonnes[3];
                }

                if (colonnes.length < 4){ System.out.println("Fichier CSV pas correct");}


                System.out.println(colonnes[2] + " | " + colonnes[3]);
                /* Debug
                System.out.println(
                        colonnes[0] + " | " + Integer.parseInt(colonnes[1]) + " | " + colonnes[2] + " | " + colonnes[3]
                );
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
