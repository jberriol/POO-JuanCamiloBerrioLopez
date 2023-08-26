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
public class POOEP21 {
    public static void main(String args[]){
        double lado1, lado2, lado3, perimetro, semiperimetro, area;
        
        System.out.println("Ingrese el valor del lado del lado 1 del triangulo: ");
        Scanner entrada1 = new Scanner(System.in);
        lado1 = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor del lado del lado 2 del triangulo: ");
        Scanner entrada2 = new Scanner(System.in);
        lado2 = entrada2.nextDouble();
        
        System.out.println("Ingrese el valor del lado del lado 3 del triangulo: ");
        Scanner entrada3 = new Scanner(System.in);
        lado3 = entrada3.nextDouble();
        
        perimetro = lado1+lado2+lado3;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*
                (semiperimetro-lado1)*
                (semiperimetro-lado2)*
                (semiperimetro-lado3)); //Utilizando formula de Heron
        
        System.out.println("El perimetro del triangulo es: "+ perimetro);
        System.out.println("El semiperimetro del triangulo es: " + semiperimetro);
        System.out.println("El area del triangulo, por formula de Heron es"
                + " :" + area);
        
    }
    
}
