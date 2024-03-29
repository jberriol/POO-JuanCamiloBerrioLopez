/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial4.Inmuebles;

/**
 *
 * @author Juan Camilo
 */
public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBaños, int
    valorAdministracion) {
    super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    this.valorAdministracion = valorAdministracion;
    }
    void imprimir() {
        super.imprimir(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Valor de la administracion = $" +valorAdministracion);
        System.out.println();
    }
    
}
