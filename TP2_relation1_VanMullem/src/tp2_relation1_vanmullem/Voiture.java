/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation1_vanmullem;

/**
 *
 * @author Soso
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    
    @Override
    public String toString () {
    String repV;
    repV = ("Modele : " + Modele + "Marque : " + Marque + "Puissance : " + PuissanceCV);
    return repV;
    }

    public Voiture(String leModele, String laMarque, int laPuissance) { //affichage en ligne
    Modele = leModele;
    Marque = laMarque;
    PuissanceCV = laPuissance;  
    Proprietaire = null;
}
    Personne Proprietaire;
}

 