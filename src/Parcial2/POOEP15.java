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
public class POOEP15 {
    public static void main(String args[]){
        double pesoA,pesoB,pesoC,pesoD;
        
        System.out.println("Ingrese el peso de la esfera A: ");
        Scanner entrada1 = new Scanner(System.in);
        pesoA = entrada1.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        Scanner entrada2 = new Scanner(System.in);
        pesoB = entrada2.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        Scanner entrada3 = new Scanner(System.in);
        pesoC = entrada3.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera D: ");
        Scanner entrada4 = new Scanner(System.in);
        pesoD = entrada4.nextDouble();
        
        if ((pesoA==pesoB)&&(pesoA==pesoC)){
            if (pesoD>pesoA)
                System.out.println("La esfera D es la diferente");
            else System.out.println("La esfera D es la diferente");}
        if ((pesoA==pesoB)&&(pesoA==pesoD)){
            System.out.println("La esfera C es la diferente");
            if (pesoC>pesoA)
                System.out.println("Y es de mayor peso");
            else System.out.println("Y es de menor peso");}
        if ((pesoA==pesoB)&&(pesoA==pesoD)){
            System.out.println("La esfera  B es la diferente");
            if (pesoB>pesoD)
                System.out.println("Y es de mayor peso");
            else System.out.println("Y es de menor peso");}
        else 
            System.out.println("La esfera A es la diferente");
            if (pesoB>pesoA)
                System.out.println("Y es de menor peso");
            else System.out.println("Y es de mayor peso");
            }
    }
