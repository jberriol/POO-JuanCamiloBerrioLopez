/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2.pruebafiguras;

/**
 *
 * @author Juan Camilo
 */
public class TrianguloRectangulo {
    int base;
    int altura;
    
    TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return ((base*altura)/2);
    }
    
    double calcularPerimetro(){
        return (base+altura+calcularHipotenusa());
    }
    
    double calcularHipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    void determinarTipoTriangulo(){
        if((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa()))
                System.out.print("Es un triangulo equilatero");
        else if ((base!=altura)&&(base!=calcularHipotenusa())&& (altura!=calcularHipotenusa()))
            System.out.print("Es un triangulo escaleno");
        else System.out.print("Es un triangulo isosceles");         
    }
}
