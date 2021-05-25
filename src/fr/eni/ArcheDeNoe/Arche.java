package fr.eni.ArcheDeNoe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * auteur anna ageneau
 * date 19/05/21
 * création de l'Arche
 * l'Arche va permettre de mettre les méthodes
 * qui vont enregisrter un nouvel animal entrant dans l'arche
 */

public class Arche {

    // je crée un tableau de 8 car on ne peut mettre que 8 animaux dans mon arche
    // private Animal[] tabAnimaux = new Animal[8];
    ArrayList<Animal> listeAnimaux = new ArrayList<Animal>();
    public static int capaciteArche = 8;
    /*private boolean gorilleMasculin = false;
    private boolean gorilleFeminin = false;
    private boolean chatMasculin = false;
    private boolean chatFeminin = false;
    private boolean lapinMasculin = false;
    private boolean lapinFeminin = false;
    private boolean chienMasculin = false;
    private boolean chienFeminin = false;
*/

    public Arche() {
    }

    /**
     * méthode pour ajouter un animal dans l'arche
     * indication du sexe et de l'espèce de l'animal
     * puis ajout de cet animal dans l'arche
     * @param animal
     *
     */

    public void ajouterAnimal(Animal animal) throws ExceptionArche{
        controleIndividu(animal);
       /* if (animal instanceof Chien) {
            if (animal.sexe.equals("M"))
                chienMasculin = true;
            else chatFeminin = true;
        }
        if (animal instanceof Chat) {
            if (animal.sexe.equals("M"))
                chatMasculin = true;
            else chatFeminin = true;
        }
        if (animal instanceof Gorille) {
            if (animal.sexe.equals("M"))
                gorilleMasculin = true;
            else gorilleFeminin = true;
        }
        if (animal instanceof Lapin) {
            if (animal.sexe.equals("M"))
                lapinMasculin = true;
            else lapinFeminin = true;
        }*/

        listeAnimaux.add(animal);

    }


    /**
     * méthode qui regarde dans la liste au fur et à mesure l'animal + son sexe
     *
     *
     * @param animalAAjouter
     * @throws ExceptionArche
     */
    public void controleIndividu(Animal animalAAjouter) throws ExceptionArche {
        Iterator<Animal> it = listeAnimaux.iterator();
        // hasNext permet au curseur de vérifier s'il y a un élément suivant
        while (it.hasNext()) {
            // next permet de renvoyer le prochain élément de la liste
            Animal animalEnCoursDeTest = it.next();
            // si mon animal en cours de test à les memes cacteristique que l'animal que j'ajoute
            // - meme espece (on teste la classe des 2 objets avec getClass)
            // - meme sexe (on teste avec l'attribut sexe)fv
            // alors je renvoie une exception
            if (animalEnCoursDeTest.getClass().equals(animalAAjouter.getClass())
                    && animalEnCoursDeTest.sexe.equals(animalAAjouter.sexe)) {
                throw new ExceptionArche("Une animal de même espèce et de même sexe est déjà présent");
            }


        }
    }


    public boolean placeDispo() {
        return listeAnimaux.size() < capaciteArche;

    }
    /*
    /**
     * métholde qui permet de relever les expections selon le sexe de l'animal
     * il faut un animal de chaque sexe dans l'arche
     *
     * @param animal
     * @throws ExceptionArche
     */
    /*
    private void controleIndividu (Animal animal) throws ExceptionArche{
        if (animal instanceof Chien){
            if (animal.sexe.equals("M") ) {
                if (chienMasculin) {
                    throw new ExceptionArche("un chien mâle est déjà présent à bord ! Sorry !!");
                }
            } else if (chienFeminin){
                    throw new ExceptionArche("une femelle chien est déjà à bord ! Sorry !");

            }
        }
        if (animal instanceof Chat){
            if (animal.sexe.equals("M") ) {
                if (chatMasculin) {
                    throw new ExceptionArche("un chat mâle est déjà présent à bord ! Sorry !!");
                }
            } else if (chatFeminin){
                throw new ExceptionArche("une femelle chat est déjà à bord ! Sorry !");

            }
        }
        if (animal instanceof Gorille){
            if (animal.sexe.equals("M") ) {
                if (gorilleMasculin) {
                    throw new ExceptionArche("un gorille mâle est déjà présent à bord ! Sorry !!");
                }
            } else if (gorilleFeminin){
                throw new ExceptionArche("une femelle gorille est déjà à bord ! Sorry !");

            }
        }
        if (animal instanceof Lapin){
            if (animal.sexe.equals("M") ) {
                if (lapinMasculin) {
                    throw new ExceptionArche("un lapin mâle est déjà présent à bord ! Sorry !!");
                }
            } else if (lapinFeminin){
                throw new ExceptionArche("une femelle lapin est déjà à bord ! Sorry !");

            }
        }

     */




    }









