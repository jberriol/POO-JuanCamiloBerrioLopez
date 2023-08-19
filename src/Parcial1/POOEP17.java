/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;
import java.util.Scanner;
/**
 *
 * @author Juan Camilo
 */
public class POOEP17 {public static void main(String[] args){
        double radio, area, perimetro;
        System.out.println("Digite el radio del circulo: ");
        Scanner entradaR = new Scanner(System.in); //Pregunto por el radio
        radio = entradaR.nextDouble();
        area = Math.PI*Math.pow(radio,2); //Area con todas las cifras
        perimetro = 2*Math.PI*radio; // Perimetro con todas las cifras
        System.out.println("El area del circulo es: " + area); 
        System.out.println("El perimetro del ciruclo es: " + perimetro);
        //Imprimo resultados
        
        
}
    
}
