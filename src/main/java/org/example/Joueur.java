package org.example;

public class Joueur {

    private int casesFranchiesnb;

    public int getCasesFranchiesnb(){ return casesFranchiesnb; }

    public void setCasesFranchiesnb(int numJoueur){ this.casesFranchiesnb = casesFranchiesnb; }

    public Joueur(int casesFranchiesnb){
        this.casesFranchiesnb = casesFranchiesnb;
    }

    /*
    public String toString(){
        String message = this.numJoueur + ", " + this.nom + ", " + this.pseudo + ", " + this.classement + ",\nclub : " + aaa();
        return message;
    }
*/
    public void avancerJoueur(){
    }
}

