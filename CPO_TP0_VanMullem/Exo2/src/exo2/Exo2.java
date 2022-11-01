/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**TP0
 * Novembre 2022
 * Solene Van Mullem
 * Exo 2
 *
 * @author Soso
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Declaration des variables
        int result; // resultat
        int ind; //indice de la boucle for
        int nb; //initialisation nb (nombre d'entiers à additionner)
        //nb=5;
        Scanner sc = new Scanner(System.in); //add scanneer
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;// initialise result
        
// Addition des nb premiers entiers
        for (ind=1 ; ind <= nb ; ind++) {
            result=result+ind;
        }
// Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est: "+result);
              
}
    }
    
