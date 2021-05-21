package fr.eni.ArcheDeNoe;

/**
 * auteur anna ageneau
 * date 19/05/21
 */

public class Chat extends Animal implements Carnivore {
    private static int nbChat = 0;


    public Chat(String nom, String sexe) {
        super(nom, sexe);
        Chat.nbChat++;


    }

    public static int getNbChat() {

        return nbChat;
    }


}