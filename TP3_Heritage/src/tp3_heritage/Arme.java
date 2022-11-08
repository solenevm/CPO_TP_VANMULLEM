/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author Soso
 */
public class Arme {
    String arme;
    int niveau;
    
    public Arme(String lenom, int leniveau){ //constructeur 1
        arme = lenom;
        niveau = leniveau;
    }
    @Override
    public String toString() { //methode
        String chaine_a_retourner;
        chaine_a_retourner = "Nom d'arme : " + arme + "\n" + "Niveau d'attaque : " +niveau;
        return chaine_a_retourner;
    }
}
