/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage;

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
        
        Arme couteau = new Arme ("couteau", 40 );
        System.out.println(couteau);
        
        Epee excalibur = new Epee ("Excalibur", 7, 5);
        System.out.println(excalibur);
        
        Epee Durandal = new Epee ("Durandal", 4, 7);
        System.out.println(Durandal);
        
        Baton Chene = new Baton ("Chene", 4, 5);
        System.out.println(Chene);
        
        Baton Charme = new Baton ("Charme", 5, 6);
        System.out.println(Charme);

        // TODO code application logic here
    }
    
}
