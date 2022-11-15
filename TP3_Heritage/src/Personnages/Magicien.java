package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Personnages.Personnages;

/**
 *
 * @author Soso
 */
public class Magicien extends Personnages {
    boolean confirme;
    
    public Magicien(String nom, int niveauvie, boolean confirme) {
        super(nom, niveauvie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setVie(int Vie) {
        this.Vie = Vie;
    }

    public boolean isConfirme() {
        return confirme;
    }

    public String getNom() {
        return Nom;
    }

    public int getVie() {
        return Vie;
    }

    @Override
    public String toString() {
        return "Magicien{" + "nom : " + Nom + ", vie :" + Vie + ", confirme=" + confirme + '}';
    }
    
    
}
