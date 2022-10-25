/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_vanmullem;

/**
 *
 * @author Soso
 */
public class Convertisseur {
    int nbConversions;
    public void Convertisseur(){
        nbConversions = 0;
    }
    public double CelciusVersKelvin(double a){
        a=a+273;
        nbConversions+=1;
        return a;
    }
    
    public double KelvinVersCelcius(double b) {
        b=b-273;
        nbConversions+=1;
        return b;
    }
}
