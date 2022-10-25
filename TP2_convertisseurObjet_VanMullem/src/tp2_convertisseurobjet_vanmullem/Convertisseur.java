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
    public void Convertisseur(){ //création constructeur
        nbConversions = 0; //initialisation de la variable nbConversions
    }
    public double CelciusVersKelvin(double a){ //variable double (permet d'avoir un nombre décimal)
        a=a+273; //calcul de conversion correspondant de C° vers K
        nbConversions+=1;
        return a; //retour du résultat
    }
    
    //même principe pour chaque conversions
    public double KelvinVersCelcius(double b) {
        b=b-273;
        nbConversions+=1;
        return b;
    }
    public double FahrenheitVersCelcius (double c) {
        c=(c-32)/1.8;
        nbConversions +=1;
        return c;
    }
    
    public double CelciusVersFahrenheit (double d){
        d=(d*1.8)+32;
        nbConversions+=1;
        return d;
    }
    
    public double FahrenheitVersKelvin (double e){
        e=(e+459.67)*(5/9);
        nbConversions+=1;
        return e;       
    }
    
    public double KelvinVersFahreinheit (double f) {
        f=(f*(9/5))-459.67;
        nbConversions+=1;
        return f;
    }
    @Override
   public String toString () {
       return "nb de conversions" + nbConversions;
   }
}
