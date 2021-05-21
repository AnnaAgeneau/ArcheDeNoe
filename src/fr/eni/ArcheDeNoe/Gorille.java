package fr.eni.ArcheDeNoe;
/**
 * auteur anna ageneau
 * date 19/05/21
 */

public class Gorille extends Animal implements Végétarien{
    private static int nbGorille = 0;


    public Gorille(String nom, String sexe) {
        super(nom, sexe);
        Gorille.nbGorille++;
    }

    public static int getNbGorille() {

        return nbGorille;
    }


}
