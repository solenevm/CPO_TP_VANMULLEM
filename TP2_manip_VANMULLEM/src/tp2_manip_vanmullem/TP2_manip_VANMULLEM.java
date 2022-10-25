/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_vanmullem;

/**
 *
 * @author Soso
 */
public class TP2_manip_VANMULLEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ; // méthode 1
        Tartiflette assiette2 = new Tartiflette(600) ; // méthode 2
        Tartiflette assiette3 = assiette2 ; // assiette 2 est remplacée par l'assiette 3
        
        //Moussaka assiette666 = assiette1 ; 
        //Moussaka assiette667 = new Tartiflette() ;
        // Réponse quest 6 : non car il faut qu'il est ait un nom identique
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;

        
        Moussaka [] tab = new Moussaka[10]; //création tableau de 10 valeurs de calories pour la Moussaka
        for (int i=0; i<1; i++) {
            tab[i]=new Moussaka (i);
        }     
    }
    
}
