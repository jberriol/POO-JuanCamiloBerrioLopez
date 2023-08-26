/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2.pruebafiguras;

/**
 *
 * @author Juan Camilo
 */
public class Rectangulo {
    int base;
    int altura;
    
    Rectangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
    } //Esto es un constructor
    
    double calcularArea(){ //Esto es un metodo
        return (base*altura);
    }
    
    double calcularPerimetro(){//Esto es otro metodo
        return (2*(base+altura));
    }
    
}
