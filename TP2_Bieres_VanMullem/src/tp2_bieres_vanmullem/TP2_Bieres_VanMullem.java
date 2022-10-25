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
    
    // création obj autreBiere dans la classe BouteilleBiere + attribution
    // d'un nom, degré et brasserie
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;

    // meme principe que pour la bière précédente
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
