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
public class POOEP22 {
    public static void main(String args[]){
        String nombre;
        double salariohora,horastrabajadas, salariomensual;
        
        System.out.println("Ingrese el nombre del empleado: ");
        Scanner entrada1 = new Scanner(System.in);
        nombre = entrada1.nextLine();
        
        System.out.println("Ingrese el valor del salario por hora: ");
        Scanner entrada2 = new Scanner(System.in);
        salariohora = entrada2.nextDouble();
        
        System.out.println("Ingrese numero de horas trabajadas: ");
        Scanner entrada3 = new Scanner(System.in);
        horastrabajadas = entrada3.nextDouble();
        
        salariomensual = horastrabajadas*salariohora;
        
        if (salariomensual>450000){
            System.out.println("El nombre del empleado es: "+ nombre);
            System.out.println("El salario del empleado es: "+ salariomensual);}
        else System.out.println("El nombre del empleado es: "+ nombre);
        
    }
    
}
