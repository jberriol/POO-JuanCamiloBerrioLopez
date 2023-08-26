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
public class POOER11 {
    public static void main(String args[]){
        double numero1,numero2,numero3,mayor;
        
        System.out.println("Ingrese el primero numero: ");
        Scanner entrada1 = new Scanner(System.in);
        numero1 = entrada1.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        Scanner entrada2 = new Scanner(System.in);
        numero2 = entrada2.nextDouble();
        
        System.out.println("Ingrese el tercer numero: ");
        Scanner entrada3 = new Scanner(System.in);
        numero3 = entrada3.nextDouble();
        
        if ((numero1>numero2) && (numero1>numero3))
            mayor = numero1;
        else if (numero2>numero3)
            mayor = numero2;
        else
            mayor = numero3;
        
        System.out.println("El valor mayor entre: "+numero1+", "+numero2+
                " y "+numero3+" es: "+ mayor);
        
    }
    
}
