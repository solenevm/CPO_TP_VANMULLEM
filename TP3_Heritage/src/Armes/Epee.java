/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Soso
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee (String lenom, int leniveau, int f){
        super(lenom, leniveau);
        if (finesse<100){
            finesse = f;
        }else{
            finesse = 0;
        }
    }
}
