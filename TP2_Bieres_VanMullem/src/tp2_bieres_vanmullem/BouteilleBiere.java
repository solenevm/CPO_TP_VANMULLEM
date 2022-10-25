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
    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte; 
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ); 
    }
    public void Décapsuler(){
        if (ouverte==false){
            ouverte=true;
            System.out.println("Biere ouverte");
        }else{
            System.out.println(" erreur : biere déjà ouverte");
            ouverte=false;
        }
    }

   

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}

@Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";

    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
}