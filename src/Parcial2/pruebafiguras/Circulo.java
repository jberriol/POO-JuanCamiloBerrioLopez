/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2.pruebafiguras;

/**
 *
 * @author Juan Camilo
 */
public class Circulo {
    int radio;

    Circulo(int radio) {
        this.radio = radio; //Constructor
    }

    double calcularArea() {
        return Math.PI*Math.pow(radio,2); //Metodo
    }

    double calcularPerimetro() {
        return 2*Math.PI*radio; //Metodo
}
}

