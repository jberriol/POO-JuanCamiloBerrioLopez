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
public class POOER10 {
    public static void main(String args[]){
        double PAT, PAGMAT;
        int EST;
        String NOM, NI;
        
        System.out.println("Ingrese numero de inscripcion :");
        Scanner entrada1 = new Scanner(System.in);
        NI = entrada1.nextLine();
        
        System.out.println("Ingrese el nombre del estudiante: ");
        Scanner entrada2 = new Scanner(System.in);
        NOM = entrada2.nextLine();
        
        System.out.println("Ingrese el valor del patrimonio: ");
        Scanner entrada3 = new Scanner(System.in);
        PAT = entrada3.nextDouble();
        
        System.out.println("Ingrese el estrato: ");
        Scanner entrada4 = new Scanner(System.in);
        EST = entrada4.nextInt();
        
        PAGMAT = 50000;
        if ((PAT>2000000) && (EST>3))
                PAGMAT = PAGMAT + PAT*0.03;
        System.out.println("El estudiante con numero de inscripcion "
                + ""+ NI +" "+ "y nombre " + NOM +" " + "debe pagar $"+ PAGMAT);
                
        
        
    }
    
}
