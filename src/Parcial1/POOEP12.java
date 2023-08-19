/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;
/**
 *
 * @author Juan Camilo
 */
public class POOEP12 {public static void main(String[] args){
    double DineroHora, SalBruto, HorasTrabajadas, RetenFuentePorcentaje,RetenFuente,SalNeto;
    DineroHora = 5000; //5000 unidades monetarias por hora
    HorasTrabajadas = 48; //Se asume que todas las 48 horas se trabajaron
    RetenFuentePorcentaje = 0.125; //Retenfuente en porcentaje
    SalBruto = HorasTrabajadas * DineroHora; // Salarrio bruto
    RetenFuente = RetenFuentePorcentaje * SalBruto; // Retencion en la fuente absoluto
    SalNeto = SalBruto - RetenFuente; //Salario neto calculado
    System.out.println("Su salario bruto es de: " + SalBruto);
    System.out.println("Su retencion en la fuente es de: " + RetenFuente);
    System.out.println("Su salario neto es de: "+ SalNeto); //Se imprimen resultados
    
    
            
    
}
    
}
