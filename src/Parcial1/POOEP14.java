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
public class POOEP14 {public static void main(String[] args){
        double x, cubo, cuadrado; //defino variables
        System.out.println("Escriba un numero: ");
        Scanner entrada = new Scanner(System.in);
        x = entrada.nextDouble();
        cubo = x*x*x;
        cuadrado = x*x;
        System.out.println("El cuadrado del numero escogido es: " + cuadrado);
        System.out.println("El cubo del numero escogido es: "+ cubo);
}    
    
}
