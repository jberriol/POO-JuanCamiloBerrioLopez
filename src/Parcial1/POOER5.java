/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;

/**
 *
 * @author Juan Camilo
 */

public class POOER5 {public static void main(String[] args){
    double suma, x, y; //Defino variables
    suma = 0; // suma en 0
    x = 20; //x con valor
    y = 40; // y con valor
    suma = suma + x; //la suma cambia
    x = Math.pow(y,2) + x; //utilizo la potencia de la libreria Math
    suma = suma + (x/y); // Operacion final
    System.out.println("El valor de la suma es: " + suma); //Imprimo resultado
    }
    
}
