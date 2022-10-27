package tp2_relation1_vanmullem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Soso
 */
public class Personne {
    String Nom;
    String Prenom;
    
    public Personne (String leNom, String lePrenom){
    Nom = leNom;
    Prenom = lePrenom;
    int voiture=0;
    }
    
    @Override
    public String toString () {
    String repP;
    repP = ("Nom = " + Nom + "Prenom = " + Prenom);
    return repP;
    }
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if(voiture_a_ajouter==null){
        return true;
        }else{
        return false;
        }
    }
}

