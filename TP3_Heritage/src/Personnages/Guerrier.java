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
public class Guerrier extends Personnages {
    boolean cheval;
    
    public Guerrier(String nom, int niveauvie, boolean cheval) {
        super(nom, niveauvie);
        this.cheval = cheval;
    }

    //setter
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setVie(int Vie) {
        if (Vie>0){
           this.Vie = Vie; 
        }
    }

    // getter
    public boolean isCheval() {
        return cheval;
    }

    public String getNom() {
        return Nom;
    }

    public int getVie() {
        return Vie;
    }
    
    @Override
    public String toString(){
        return "Guerrier{" + "nom : " + Nom + ", vie :" + Vie + ", deplacement :" +cheval + "}";
    }
    
    
}
