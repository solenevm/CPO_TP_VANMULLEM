/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author Soso
 */
public class Personnages {
    String Nom;
    int Vie;
    
    public Personnages (String nom, int niveauvie){
        Nom = nom;
        Vie = niveauvie;
    }
    @Override
    public String toString() { //methode
        String chaine_a_retourner;
        chaine_a_retourner = "Nom du personnage : " + Nom + "\n" + "Niveau de vie : " + Vie;
        return chaine_a_retourner;
}}
