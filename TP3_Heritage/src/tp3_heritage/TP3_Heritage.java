/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Soso
 */
public class TP3_Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        //création armes
        Epee Excalibur = new Epee ("Excalibur", 7, 5);
        System.out.println(Excalibur);
        
        Epee Durandal = new Epee ("Durandal", 4, 7);
        System.out.println(Durandal);
        
        Baton Chene = new Baton ("Chene", 4, 5);
        System.out.println(Chene);
        
        Baton Charme = new Baton ("Charme", 5, 6);
        System.out.println(Charme);
        
        //création tableau d'armes
        ArrayList<Arme> TabArme = new ArrayList<Arme>();
        TabArme.add(Excalibur);
        TabArme.add(Durandal);
        TabArme.add(Chene);
        TabArme.add(Charme);
        
        System.out.print(TabArme);
        //affichage du tableau A RETRAVAILLER
        //System.out.print("[ " + TabArme.get(0));
        
        //for (int i=0 ; i<TabArme.size() ; i++){
        //System.out.print(TabArme.get(i) + ", " );// affichage tableau  
        //}
   
        //System.out.print(" ]");
        
        
        //création 2 magicien
        Magicien Gandalf = new Magicien ("Gandalf", 65, true);
        System.out.println(Gandalf);
        
        Magicien Garcimore = new Magicien ("Garcimore", 44, false);
        System.out.println(Garcimore);
        
        //création 2 guerrier
        Guerrier Conan = new Guerrier ("Conan", 78, false);
        System.out.println(Conan);
        
        Guerrier Lanister = new Guerrier ("Lanister", 45, true);
        System.out.println(Lanister);
        
        //création tableau de personnages
        ArrayList<Personnages> TabPerso = new ArrayList<Personnages>();
        TabPerso.add(Gandalf);
        TabPerso.add(Garcimore);
        TabPerso.add(Conan);
        TabPerso.add(Lanister);
        
        System.out.print(TabPerso);
        
        
}
}