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
public class POOER7 {
    public static void main(String args[]){
        double a,b;
        System.out.println("Ingrese el valor de A: ");
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();
        
        if (a>b)
            System.out.println("A es mayor que B");
        else if (a<b)
            System.out.println("A es menor que B");
        else
            System.out.println("A es igual a B");
        
    }
}
