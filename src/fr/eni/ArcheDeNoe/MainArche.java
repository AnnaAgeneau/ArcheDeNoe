package fr.eni.ArcheDeNoe;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws ExceptionArche {


        Arche arche = new Arche();
        char reponse = 0;
        String nom;
        String sexe;

        // je crée une boucle où je peux entrer le nom, sexe et espece de mon animal, tant que
        // la capacité de l'arche n'est pas atteinte
        do {
            System.out.println("$$$$$ WELCOME DANS L'ARCHE, je suis Noé $$$$$");
            // Noe renseigne le nom de l'animal

            System.out.println("Quel est ton nom ?");
            nom = scan.nextLine();

            // Noe renseigne le sexe de l'animal
            System.out.println("Quel est ton sexe? (M pour masculin, F féminin)");
            sexe = saisieSexe();

            // Noe renseigne de quelle espece est l'animal
            System.out.println("Quel est ton espèce ? 0 pour chat, 1 pour chien, 2 pour gorille, 3 pour lapin");
            int espece = scan.nextInt();
            scan.nextLine();

            Animal animalAAjouter = null;

            switch (espece) {
                case 0:
                    animalAAjouter = new Chat(nom, sexe);
                    break;

                case 1:
                    animalAAjouter = new Chien(nom, sexe);
                    break;

                case 2:
                    animalAAjouter = new Gorille(nom, sexe);
                    break;

                case 3:
                    animalAAjouter = new Lapin(nom, sexe);
                    break;
            }
            try {
                arche.ajouterAnimal(animalAAjouter);
                System.out.println("l'animal " +  animalAAjouter.nom + " est dans l'arche");
            } catch (ExceptionArche e){
                System.out.println(e.getMessage());
            }


            System.out.println("Voulez-vous ajouter un animal ? (O pour continuer N pour quitter)");

            reponse = scan.nextLine().charAt(0);
            //

        } while ((reponse == 'O' || reponse == 'o') && arche.placeDispo());

        if (!arche.placeDispo()) {
            System.out.println("on est complet !!");

        }



        System.out.println("Vous avez " + arche.listeAnimaux.size() + "/" + Arche.capaciteArche + " animaux dans l'arche");

        System.out.println("L'arche possède à son bord : " + Chat.getNbChat() + " chat(s), " + Chien.getNbChien() + " chien(s), " +
                Gorille.getNbGorille() + " gorille(s), " + Lapin.getNbLapin() + " lapin(s)");


        System.out.println("Le commis doit prévoir à bord " + StockNourriture.stockVegetaux() + " végétaux et " + StockNourriture.stockViande() + "kg de viande");


    }

    public static String saisieSexe() {
        String saisie;

        do {
            saisie = scan.nextLine().toUpperCase();

            if (saisie.equals("M")) {
                System.out.println("Masculin");
            } else if (saisie.equals("F")) {
                System.out.println("Feminin");
            } else {
                System.out.println("Veuillez écrire M ou F svp");
            }

        } while (!saisie.equals("M") && !saisie.equals("F"));

        return saisie;
    }

}


