package org.example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Random;

public class CarteBot {

    private String sujet;
    private int difficulté;
    private int difMax;
    private String question;
    private String reponse;
    private String cheminCarte;

    File dossier;
    Random random;

    public String getSujet(){return sujet;}
    public int getDifficulté(){return difficulté;}
    public String getQuestion(){return question;}
    public String getCheminCarte(){return cheminCarte;}

    public void setCheminCarte(String cheminCarte){this.cheminCarte = cheminCarte;}

    public CarteBot(String sujet, int difficulté, String question){
        this.sujet = "Féculents";
        this.difficulté = 1;
        this.difMax = 10;
        this.question = "Sont-ils d'orgine animale ou végétale?";
        this.reponse = "Vegetale";
        this.cheminCarte = "C:/CartesCSV";

        this.dossier = new File(cheminCarte);
        this.random = new Random();
    }

    public void selectionCarte(){
        File[] fichiers = dossier.listFiles();

        int rd = random.nextInt(fichiers.length);
        System.out.println(fichiers[rd].getName());

        this.cheminCarte = "C:/CartesCSV" + "/"  + fichiers[rd].getName();
    }

    public void lectureSujet(){

        try (BufferedReader br = new BufferedReader(new FileReader(cheminCarte))) {

            String ligne = br.readLine();


            while ((ligne = br.readLine()) != null) {
                String[] colonnes = ligne.split(";");
                this.difMax = Integer.parseInt(colonnes[1]);

                if (colonnes.length < 4){ System.out.println("Fichier CSV pas correct");}
                if (colonnes[0] != null){
                    this.sujet = colonnes[0];

                }
            }

            System.out.println("Le sujet sera : " + this.sujet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectionDifficulte(Scanner sc){

        try (BufferedReader br = new BufferedReader(new FileReader(cheminCarte))) {

            String ligne;

            System.out.println("La difficulté max est " + this.difMax + ". Choisissez une difficulté : ");
            int difChoisie = Integer.parseInt(sc.nextLine());
            while(true){
                if (difChoisie > this.difMax || difChoisie < 1){
                    System.out.println("Ce chiffre n'est pas valide");
                    System.out.println("Choisissez une difficulté : ");
                    difChoisie = sc.nextInt();
                    continue;
                } else {
                System.out.println("Le joueur a choisi la difficulté " + difChoisie + "!");
                break;
                }
            }

            //bool stop pour s arreter si la lecture du fichier est arrivé a la difficulté demandé de l utilisaztruerz
            boolean stop = false;
            while ((ligne = br.readLine()) != null && !stop) {

                String[] colonnes = ligne.split(";");

                if (Integer.parseInt(colonnes[1]) == difChoisie){
                    this.sujet = colonnes[0];
                    this.difficulté = Integer.parseInt(colonnes[1]);
                    this.question = colonnes[2];
                    this.reponse = colonnes[3];
                    System.out.println("La question est " + "\"" + colonnes[2] + "\"");
                    stop = true;
                }

                if (colonnes.length < 4){ System.out.println("Fichier CSV pas correct");}


                /* debug
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
        System.out.println("Donnez la réponse : ");
        String reponseJoueur = sc.nextLine();
        if (reponseJoueur.equalsIgnoreCase(reponse)){
            System.out.println("Bonne réponse!");
            joueur.avancerJoueur(difficulté);
        } else{
            System.out.println("Mauvaise réponse!");
            System.out.println("Le joueur reste a la case " + joueur.getCasesFranchiesNb());
        }

    }
}
