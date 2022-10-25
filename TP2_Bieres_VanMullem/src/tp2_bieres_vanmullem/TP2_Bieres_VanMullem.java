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
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
    //uneBiere.nom = "Cuvée des trolls";
    //uneBiere.degreAlcool = 7.0 ;
    //uneBiere.brasserie = "Dubuisson";
    //uneBiere.ouverte = false;
    //uneBiere.lireEtiquette();
    
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
    //BouteilleBiere autreBiere = new BouteilleBiere() ;{
    //autreBiere.nom = "Leffe";
    //autreBiere.degreAlcool = 6.6 ;
    //autreBiere.brasserie = "Abbaye de Leffe";
    //autreBiere.ouverte = false;
    //autreBiere.lireEtiquette();
    //autreBiere.lireEtiquette();
    
    BouteilleBiere Biere1 = new BouteilleBiere("Corona", 4.5 ,"Brasserie") ;
    BouteilleBiere Biere2 = new BouteilleBiere("Heineken", 5.0 ,"Bar") ;
    BouteilleBiere Biere3 = new BouteilleBiere("Chouffe", 8.0 ,"Le Babar") ;
    
    uneBiere.Décapsuler();
    System.out.println(uneBiere);
    System.out.println(autreBiere);
    System.out.println(Biere1);
    System.out.println(Biere2);
    System.out.println(Biere3);
}    
}
