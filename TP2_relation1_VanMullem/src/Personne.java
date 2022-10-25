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
        if(Voiture_voiture_a_ajouter==null){
        return true;
    }
        }else{
        return false;
}
}
