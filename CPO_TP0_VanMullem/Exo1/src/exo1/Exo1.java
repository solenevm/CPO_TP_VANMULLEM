/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

import java.util.Scanner;

/**TP 0
 * novembre 2022
 * Solène Van Mullem
 * Exo 1
 * @author Soso
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour"); //si erreur --> explication sur le point d'exclamation rouge sur la ligne concerné
        System.out.println("au revoir"); //utilisation complétion (=proposition de netbeans)
        
        String prenom;
        Scanner sc; //ajouter scanner pour java
        sc = new Scanner(System.in);
        System.out.println("Bonjour, veuillez entrer votre prenom.");
        prenom = sc.nextLine();
        System.out.println("Votre prenom est : "+ prenom);
    }
    
}
