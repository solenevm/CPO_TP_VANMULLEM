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
public class Baton extends Arme {
    int age;
    
    public Baton(String lenom, int leniveau, int a){
        super(lenom, leniveau);
        if (age<100){
            age = a;
        }else{
            age = 0;
        }
    }

    @Override
    public String toString() {
        return "Baton{" + "Nom arme : "+ arme + ", Niveau arme : " + niveau + ", age : " + age + "}";
    }
    
}
