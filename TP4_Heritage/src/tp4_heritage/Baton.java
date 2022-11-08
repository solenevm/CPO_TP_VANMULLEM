/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_heritage;

/**
 *
 * @author Soso
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String lenom, int leniveau, int a){
        super(lenom, leniveau);
        age = a;
    }
}
