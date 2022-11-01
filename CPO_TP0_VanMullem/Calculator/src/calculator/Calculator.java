/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/** TP0
 * Novembre 2022
 * Solene Van Mullem
 * Exercice Calculator
 *
 * @author Soso
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("""
                         Please enter the operator :
                         1) add
                         2) substract
                         3) multiply
                         4) divide
                         5) modulo
                         """);
        //demande de choix de l'opérateur par l'utilisateur
        int operateur;
        Scanner sc = new Scanner(System.in); //add scanneer
        System.out.println("\n Entrer le nombre correspondant a l'operateur que vous souhaitez entre 1 et 5:");
        operateur=sc.nextInt();
        
        //cas où operateur pas entre 1 et 5
        if ((operateur<1) || (operateur>5)){
            System.out.println("Erreur. Choisissez un nombre entre 1 et 5");
            operateur=sc.nextInt(); //demande à l'utilisateur de re rentrer l'operateur
        }
        
        // operateur valide
        //entrer la première valeur pour le calcul
        int operande1;
        System.out.println("\n Entrer une premiere valeur :");
        operande1=sc.nextInt();
        
        //entre la deuxième valeur pour le calcul
        int operande2;
        System.out.println("\n Entrer une seconde valeur :");
        operande2=sc.nextInt();
        
        float resultat;
        resultat=0;
        
        
        if (operateur ==1){
            resultat = operande1 + operande2;
        }
        
        if (operateur ==2){
            resultat = operande1 - operande2;
        }
        
        if (operateur ==3){
            resultat = operande1 * operande2;
        }
        
        if (operateur ==4){
            resultat = operande1/operande2;
        }
        
        if (operateur ==5){
            resultat = operande1%operande2;
        }
        
        System.out.println("Le resultat est : " + resultat);
    }
    
}
