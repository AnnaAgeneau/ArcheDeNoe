package fr.eni.ArcheDeNoe;

import java.util.Scanner;

/**
 * auteur anna ageneau
 * date 19/05/21
 * création de l'Arche
 * l'Arche va permettre de mettre les méthodes
 * qui vont enregisrter un nouvel animal entrant dans l'arche
 */

public class Arche {

    // je crée un tableau de 8 car on ne peut mettre que 8 animaux dans mon arche
    private Animal[] tabAnimaux = new Animal[8];

    public Arche() {
    }

    public void quelSexe(String quelSexe){
        if (quelSexe.equals("M")) {
            System.out.println("Masculin");
        } else if (quelSexe.equals("F")) {
            System.out.println("Feminin");
        } else {
            System.out.println("Veuillez écrire M ou F svp");
        }
    }

    public void ajouterAnimal(String nom, String sexe, int espece) {
        switch (espece) {
            case 0:

                Animal animal0 = new Chat(nom, sexe);
                for (int i = 0; i < tabAnimaux.length; i++) {
                    if (this.tabAnimaux[i] == null) {
                        this.tabAnimaux[i] = animal0;
                    }

                }
                break;

            case 1:
                Animal animal1 = new Chien(nom, sexe);
                for (int i = 0; i < tabAnimaux.length; i++) {
                    if (this.tabAnimaux[i] == null) {
                        this.tabAnimaux[i] = animal1;
                    }
                }
                break;

            case 2:
                Animal animal2 = new Gorille(nom, sexe);
                for (int i = 0; i < tabAnimaux.length; i++) {
                    if (this.tabAnimaux[i] == null) {
                        this.tabAnimaux[i] = animal2;
                    }
                }
                break;

            case 3:
                Animal animal3 = new Lapin(nom, sexe);
                for (int i = 0; i < tabAnimaux.length; i++) {
                    if (this.tabAnimaux[i] == null) {
                        this.tabAnimaux[i] = animal3;
                    }
                    break;
                }

        }
    }

            public void capaciteArche (int capacite){

            }



}






