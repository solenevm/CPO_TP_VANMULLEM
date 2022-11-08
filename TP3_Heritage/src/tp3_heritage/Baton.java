/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

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
}
