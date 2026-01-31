package org.example;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        System.out.println("Bienvenue au TTMC! Entrez une touche\n\n1 : pour commencer\n2 : Partie Administrateur");
        Scanner sc = new Scanner(System.in);
        String reponse = sc.nextInt();
        switch (reponse) {
            case 1:
                System.out.println("");
                break;
        }

    }
}
