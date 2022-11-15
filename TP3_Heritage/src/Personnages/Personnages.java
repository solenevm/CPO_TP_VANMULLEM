/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

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
    public String toString() {
        return "Personnages{" + "Nom=" + Nom + ", Vie=" + Vie + '}';
    }

}
