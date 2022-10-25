/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_vanmullem;

/**
 *
 * @author Soso
 */
public class BouteilleBiere {
    public String nom; //création des attributs 
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte; 
    public void lireEtiquette() { //création attribut d'action 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ); //affichage étiquette
    }
    public void Décapsuler(){ //création attribut décapsuler
        if (ouverte==false){ //cas où bouteille est fermée
            ouverte=true; // ouvrir la bouteille
            System.out.println("Biere ouverte"); //affichage état d'ouverture de la bouteille
        }else{
            System.out.println(" erreur : biere déjà ouverte"); //affichage état d'ouverture de la bouteille
            ouverte=false;
        }
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //affichage en ligne
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}
@Override
    public String toString() { // retourner les infos
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";

    if (ouverte == true ) chaine_a_retourner += "oui" ; // permet de dire quelle bouteille est ouverte ou non
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
}