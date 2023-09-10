/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial3.interfazfiguras;

/**
 *
 * @author Juan Camilo
 */
public class TrianguloRectangulo {
    int base;
    int altura;
    String respuesta;
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
    String determinarTipoTriangulo(){
        if((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa()))
                return respuesta = "es un triangulo equilatero";
        else if ((base!=altura)&&(base!=calcularHipotenusa())&& (altura!=calcularHipotenusa()))
            return respuesta ="es un triangulo escaleno";
        else return respuesta ="es un triangulo isosceles";         
    }
}
