package fr.eni.ArcheDeNoe;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Arche arche = new Arche();
        Arche sexe = new Arche();
        int capacite = 0;
        char reponse = 0;
        String nom;

        do {
            System.out.println("$$$$$ WELCOME DANS L'ARCHE, je suis Noé $$$$$");
            // Noe renseigne le nom de l'animal
            Scanner scan = new Scanner(System.in);
            System.out.println("Quel est ton nom ?");
            nom = scan.nextLine();

            // Noe renseigne le sexe de l'animal
            System.out.println("Quel est ton sexe? (M pour masculin, F féminin)");
            String saisie = scan.nextLine();
            sexe.quelSexe(saisie);

            // Noe renseigne de quelle espece est l'animal
            System.out.println("Quel est ton espèce ? 0 pour chat, 1 pour chien, 2 pour gorille, 3 pour lapin");
            int saisie2 = scan.nextInt();
            scan.nextLine();
            arche.ajouterAnimal(nom, saisie, saisie2);
            capacite++;
            System.out.println("Voulez-vous ajouter un animal ? (O pour continuer N pour quitter)");

            reponse = scan.nextLine().charAt(0);
            //

        } while (reponse == 'O' || reponse == 'o');

            if (reponse == 'N' || reponse == 'n') {

                System.out.println("l'animal " + nom + " est dans l'arche");
                System.out.println("Vous avez " + capacite + "/8 animaux dans l'arche");

                System.out.println("L'arche possède à son bord : " + Chat.getNbChat() + " chat(s), " + Chien.getNbChien() + " chien(s), " +
                        Gorille.getNbGorille() + " gorille(s), " + Lapin.getNbLapin() + " lapin(s)");


                System.out.println("Le commis doit prévoir à bord " + StockNourriture.stockVegetaux() + " végétaux et " + StockNourriture.stockViande() + "kg de viande");


            }
    }

}


