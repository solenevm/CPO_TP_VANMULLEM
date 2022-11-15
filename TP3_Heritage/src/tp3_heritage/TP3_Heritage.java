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
        String arme;
        int NivAtt = 0;
        
        
        Epee Excalibur = new Epee ("Excalibur", 7, 5);
        System.out.println(Excalibur);
        
        Epee Durandal = new Epee ("Durandal", 4, 7);
        System.out.println(Durandal);
        
        Baton Chene = new Baton ("Chene", 4, 5);
        System.out.println(Chene);
        
        Baton Charme = new Baton ("Charme", 5, 6);
        System.out.println(Charme);
        
        ArrayList<Arme> Tab = new ArrayList<Arme>();
        Tab.add(Durandal);
        Tab.add(Excalibur);
        Tab.add(Chene);
        Tab.add(Charme);
        
        System.out.println(Tab); // affichage tableau


     
    }
    
}
