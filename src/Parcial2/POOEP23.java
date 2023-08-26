/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;
import java.util.Scanner;
/**
 *
 * @author Juan Camilo
 */
public class POOEP23 {
    public static void main(String args[]){
        double A, B, C, discriminante, sol1, sol2,sol,partereal,parteimag;
        
        System.out.println("Ingrese el valor de A: ");
        Scanner entrada1 = new Scanner(System.in);
        A = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        Scanner entrada2 = new Scanner(System.in);
        B = entrada2.nextDouble();
        
        System.out.println("Ingrese el valor de C: ");
        Scanner entrada3 = new Scanner(System.in);
        C = entrada3.nextDouble();
        
        discriminante = Math.pow(B,2) - 4*A*C;

        if (discriminante > 0){
            sol1 = (-B + Math.sqrt(discriminante))/(2*A);
            sol2 = (-B - Math.sqrt(discriminante))/(2*A);
            System.out.println("Las soluciones son " + sol1 + " y " + sol2);}
         else if (discriminante == 0){
            sol = -B / (2 * A);
            System.out.println("La solución es" + sol);}
         else {
            partereal = -B/(2*A);
            parteimag = Math.sqrt(-discriminante)/(2*A);
            System.out.println("Las soluciones son " + partereal + " + " 
                    + parteimag + "i y " + 
                    partereal + " - " + parteimag + "i");}
    }
    
}