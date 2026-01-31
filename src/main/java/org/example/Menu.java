package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        System.out.println("Bienvenue au TTMC! Entrez une touche\n\n1 : Commencer\n2 : Quitter");
        Scanner sc = new Scanner(System.in);
        int reponse = sc.nextInt();
        String reponseStr = sc.nextLine();
        switch (reponse) {
            case 1:
                System.out.println("Entrez le nombre de joueurs :");
                reponse = Integer.parseInt(sc.nextLine());
                System.out.println("Création de " + reponse + " Joueurs...");
                ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
                for (int i = 0; i < reponse; i++) {
                    System.out.println("Entrez le nom du Joueur " + (i + 1) + " : ");
                    reponseStr = sc.nextLine();
                    joueurs.add(new Joueur(reponseStr));
                }
                for(Joueur lejoueur : joueurs){
                    System.out.println(lejoueur.toString());
                }

                break;
            case 2:
                System.exit(0);
                break;
        }

    }
}
