/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_vanmullem;

/**
 *
 * @author Soso
 */
public class TP2_Bieres_VanMullem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere() ;{
    uneBiere.nom = "Cuvée des trolls";
    uneBiere.degreAlcool = 7.0 ;
    uneBiere.brasserie = "Dubuisson";
    uneBiere.ouverte = false;
    uneBiere.lireEtiquette();
    }
    BouteilleBiere autreBiere = new BouteilleBiere() ;{
    autreBiere.nom = "Leffe";
    autreBiere.degreAlcool = 6.6 ;
    autreBiere.brasserie = "Abbaye de Leffe";
    autreBiere.ouverte = false;
    autreBiere.lireEtiquette();
    }
}
}
    
