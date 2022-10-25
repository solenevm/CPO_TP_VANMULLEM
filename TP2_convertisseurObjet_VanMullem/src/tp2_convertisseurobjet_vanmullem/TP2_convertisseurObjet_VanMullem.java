/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_vanmullem;

import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class TP2_convertisseurObjet_VanMullem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc;
        sc= new Scanner(System.in);
        double saisie_Temp; //le nombre saisie par l'utilisateur
        saisie_Temp=0;
        double saisie_cv; //nombre de comparaison que l'utilisateur choisira
        saisie_cv=0;
        double Valeur;//Valeur après conversion
        Valeur=0;
             
        Convertisseur c = new Convertisseur(); // création obj convertisseur
        
        System.out.println("Saisir la température de votre choix");
        saisie_Temp=sc.nextDouble(); //demande de saisie
        System.out.println("Que voulez-vous convertir ? Choisir le numéro de conversions correspondant.");
        System.out.println("Index numéro de conversion : \n 1:CelciusVersKelvin \n 2:KelvinVersCelcius \n 3:FahrenheitVersCelcius \n 4:CelciusVersFahrenheit \n 5:FahrenheitVersKelvin \n 6:KelvinVersFahrenheit");
        saisie_cv=sc.nextDouble();// saisie du numéro de conversion sur interface 

        //cas où choix de conversion 1
        if (saisie_cv==1){
            Valeur=c.CelciusVersKelvin(saisie_Temp);
            System.out.println(Valeur+"K");//affichage du résultat avec la bonne unité 
        }
        
        //cas où choix de conversion 2
         if (saisie_cv==2){
            Valeur=c.KelvinVersCelcius(saisie_Temp);
            System.out.println(Valeur+"C");
        }
         
        //cas où choix de conversion 3
         if (saisie_cv==3){
            Valeur=c.FahrenheitVersCelcius(saisie_Temp);
            System.out.println(Valeur+"C");
        }
         
         //cas où choix de conversion 4
          if (saisie_cv==4){
            Valeur=c.CelciusVersFahrenheit(saisie_Temp);
            System.out.println(Valeur+"F");
        }
          
        //cas où choix de conversion 5
           if (saisie_cv==5){
            Valeur=c.FahrenheitVersKelvin(saisie_Temp);
            System.out.println(Valeur+"K");
        }
           
        //cas où choix de conversion 6
        if (saisie_cv==6){
            Valeur=c.KelvinVersFahreinheit(saisie_Temp);
            System.out.println(Valeur+"F");
        }        
    }
}
