package fr.eni.ArcheDeNoe;

/**
 * auteur : anna ageneau
 * date : 19/05/21
 * classe abstaite Animal
 * nom, sexe et espece
 *
 */
public abstract class Animal {
    protected String nom;
    protected String sexe;


    public Animal(String nom, String sexe) {
        this.nom = nom;
        this.sexe = sexe;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                '}';
    }
}