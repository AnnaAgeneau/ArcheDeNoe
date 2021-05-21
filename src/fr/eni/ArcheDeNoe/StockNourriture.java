package fr.eni.ArcheDeNoe;

public class StockNourriture {

    static int stockVegetaux(){
        final int NB_VEGETAUX = 10;
        final int JOURS = 10;

        int stockVegetaux = (((NB_VEGETAUX * Lapin.getNbLapin()) + (NB_VEGETAUX * Gorille.getNbGorille())) * JOURS) ;
        return stockVegetaux;
    }


    static int stockViande(){
        final int KG_VIANDE = 30;
        final int JOURS = 10;

        int stockViande = (((KG_VIANDE * Chat.getNbChat()) + (KG_VIANDE * Chien.getNbChien())) * JOURS);
        return stockViande;


    }



}
