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
                Jeu.main(null);
                break;
            case 2:
                System.exit(0);
                break;
        }

    }
}
