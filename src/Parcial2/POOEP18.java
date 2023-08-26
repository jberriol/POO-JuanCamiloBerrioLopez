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
public class POOEP18 {
    public static void main(String args[]){
    double salariobruto,salarioneto,valorretencion,retencion;
    int codigoempleado;
    String nombres;
    double horastrabajadasmes;
    double valorhoratrabajada;
    double pretencionenlafuente;
    
    System.out.println("Ingrese el codigo del empleado: ");
    Scanner entrada1 = new Scanner(System.in);
    codigoempleado = entrada1.nextInt();
    
    System.out.println("Ingrese el nombre del empleado: ");
    Scanner entrada2 = new Scanner(System.in);
    nombres = entrada2.nextLine();
    
    System.out.println("Ingrese el numero de horas trabajadas este mes: ");
    Scanner entrada3 = new Scanner(System.in);
    horastrabajadasmes = entrada3.nextDouble();
    
    System.out.println("Ingrese el valor unitario de la hora trabajada: ");
    Scanner entrada4 = new Scanner(System.in);
    valorhoratrabajada = entrada4.nextDouble();
     
    System.out.println("Ingrese el porcentaje de retencion en la fuente (en porcentaje, sin el signo %): ");
    Scanner entrada5 = new Scanner(System.in);
    pretencionenlafuente = entrada5.nextDouble();
    
    salariobruto = horastrabajadasmes*valorhoratrabajada;
    salarioneto = salariobruto - salariobruto*(pretencionenlafuente/100);
    
    System.out.println("El codigo del empleado es: "+ codigoempleado);
    System.out.println("El nombre del empleado es: "+ nombres);
    System.out.println("El salario bruto del empleado es: "+ salariobruto);
    System.out.println("El salario neto del empleado es: "+ salarioneto);
    }
}    
