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
public class POOER12 {
    public static void main(String ar[]){
        String nom;
        double nht, vht,het, hee8,salario;
        
        
        System.out.println("Ingrese el nombre del trabajador: ");
        Scanner entrada1 = new Scanner(System.in);
        nom = entrada1.nextLine();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        Scanner entrada2 = new Scanner(System.in);
        nht = entrada2.nextDouble();
        
        System.out.println("Ingrese el valor de las horas trabajads: ");
        Scanner entrada3 = new Scanner(System.in);
        vht = entrada3.nextDouble();
        
        if (nht>40){
            het = nht-40;
            if (het>8){
                hee8 = het-8;
                salario = 40*vht +16*vht+hee8*3*vht;}
            else
                salario = 40*vht + het*2*vht;}
        else salario = nht*vht;
        
        System.out.println("El trabajador "+nom+" devengo: $"+salario);
        
                    
        
    }
    
}
