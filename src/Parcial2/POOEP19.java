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
public class POOEP19 { public static void main(String args[]){
    double lado, perimetro, altura, area;
    System.out.println("Ingrese el valor del lado del trianguo: ");
    Scanner entrada1 = new Scanner(System.in);
    lado = entrada1.nextDouble();
    
    perimetro = 3*lado;
    area = (Math.sqrt(3)*Math.pow(lado,2))/4;
    altura = (Math.sqrt(3)*lado)/2;
    
    System.out.println("El perimetro del triangulo es: "+perimetro);
    System.out.println("El area del triangulo es: "+area);
    System.out.println("La altura del triangulo es: " + altura);
    }
}
