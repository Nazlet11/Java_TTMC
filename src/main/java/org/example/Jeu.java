package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {

    static boolean victoireCheck(){
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarteBot carteBot = new CarteBot("null", 1, "null");
        String reponseStr;

        int nbEquipe = 0;
        int nbJoueurs = 0;



        // demande nb d equipes
        System.out.println("Entrez le nombre d'équipes");
        nbEquipe = Integer.parseInt(sc.nextLine());
        while(true){
            if (nbEquipe > 6 || nbEquipe < 2){
                System.out.println("Vous ne pouvez pas choisir en dessous de 2 ou au dela de 6!");
                System.out.println("Entrez le nombre d'équipes' :");
                nbEquipe = Integer.parseInt(sc.nextLine());
                continue;
            } else {
                System.out.println("Création de " + nbEquipe + " équipes...\n");
                break;
            }
        } ArrayList<Equipe> equipes = new ArrayList<Equipe>();

        // demande nb de joueurs
        System.out.println("Entrez le nombre de joueurs de l'équipe : ");
        nbJoueurs = Integer.parseInt(sc.nextLine());
        while(true){
            if (nbJoueurs > 4 || nbJoueurs < 2){
                System.out.println("Vous ne pouvez pas choisir en dessous de 2 ou au dela de 4!");
                System.out.println("Entrez le nombre de joueurs :");
                nbJoueurs = Integer.parseInt(sc.nextLine());
                continue;
            } else {
                System.out.println("Création de " + nbJoueurs + " Joueurs...\n");
                break;
            }
        } ArrayList<Joueur> joueurs = new ArrayList<Joueur>();





        // creation des equipes
        for (int i = 0; i < nbEquipe; i++) {
            int numero = (i + 1);
            System.out.println("Entrez le nom de l'équipe " + numero + " : ");
            reponseStr = sc.nextLine();
            Equipe equipe = new Equipe(reponseStr, numero, nbJoueurs);
            equipes.add(equipe);
        }

        // pr chaque equipe, creation de tt les joueurs
        for(Equipe lequipe : equipes){
            for (int i = 0; i < nbJoueurs; i++) {
                int numero = (i + 1);
                System.out.println("\nEntrez le nom du Joueur numéro " + numero + " de l'équipe : ");
                reponseStr = sc.nextLine();
                joueurs.add(new Joueur(numero, reponseStr, lequipe));
            }

        }
        // liste tt les joueurs
        for(Joueur lejoueur : joueurs){
            System.out.println(lejoueur.toString());
        }

        System.out.println("\nEntrez le nombre de case du plateau : ");
        reponseStr = sc.nextLine();
        Plateau plateau = new Plateau(Integer.parseInt(reponseStr));


        System.out.println("Le jeux commence.");
        // game loop
        while (victoireCheck()){
            System.out.println("Sélection d'une carte au hasard...");
            carteBot.pickUneCarte();
            System.out.println(carteBot.getSujet());
            reponseStr = sc.nextLine();
            carteBot.reponseJugement();

        }







    }
}
