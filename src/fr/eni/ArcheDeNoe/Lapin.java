package fr.eni.ArcheDeNoe;

/**
 * auteur anna ageneau
 * date : 19/05/21
 *
 *
 */

public class Lapin extends Animal implements Végétarien{
        private static int nbLapin = 0;



        public Lapin(String nom, String sexe) {
                super(nom, sexe);
                Lapin.nbLapin++;

        }

        public static int getNbLapin() {
                return nbLapin;
        }


}
