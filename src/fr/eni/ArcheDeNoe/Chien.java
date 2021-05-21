package fr.eni.ArcheDeNoe;
/**
 * auteur anna ageneau
 * date 19/05/21
 */

public class Chien extends Animal implements Carnivore{
    private static int nbChien = 0;


    public Chien(String nom, String sexe) {
        super(nom, sexe);
        Chien.nbChien++;

    }

    public static int getNbChien() {
        return nbChien;
    }


}
