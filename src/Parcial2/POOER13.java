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
public class POOER13 {
    public static void main(String args[]){
        double valcomp, valpag,pdes;
        String color,verde, blanco, amarillo, azul;
        
        System.out.println("Ingrese el valor de la compra: ");
        Scanner entrada1 = new Scanner(System.in);
        valcomp = entrada1.nextDouble();
        
        System.out.println("Ingrese el color de la bolita (en minuscula): ");
        Scanner entrada2 = new Scanner(System.in);
        color = entrada2.nextLine();
        
        System.out.println(color);
       
        
        if(color.equals("blanco"))
            pdes=0;
        else if (color.equals("verde"))
            pdes= 10;
        else if (color.equals("amarillo"))
            pdes=25;
        else if (color.equals("azul"))
            pdes=50;
        else
            pdes=100;
        
        valpag= valcomp-(pdes*valcomp/100);
        System.out.println("El ciente debe pagar: $"+valpag);
        //El resultado de escritorio en el libro es INCORRECTO, pues 543450-50%
        //es 271725 NO 271275. Error humano.
        
        
    }
    
}
