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
public class POOEP24 {
    public static void main(String args[]){
        double A,B,C;
        
        System.out.println("Ingrese el valor de la esfera A: ");
        Scanner entrada1 = new Scanner(System.in);
        A = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor de la esfera B: ");
        Scanner entrada2 = new Scanner(System.in);
        B = entrada2.nextDouble();
        
        System.out.println("Ingrese el valor de la esfera C:  ");
        Scanner entrada3 = new Scanner(System.in);
        C = entrada3.nextDouble();
        
        //Dado que el ejercicio dice que son de diferente peso se procede asi
        
        if ((A>B)&& (A>C)){
            System.out.println("La esfera mas pesada es la A");}
        else if ((B>A)&&(B>C)){
            System.out.println("La esfera mas pesada es la B");}
        else System.out.println("La esfera mas pesada es la C");
        
    }
    
}
