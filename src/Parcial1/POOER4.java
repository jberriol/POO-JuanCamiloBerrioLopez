import java.util.Scanner;


public class POOER4 {public static void main(String[] args){
        int edana, edmama, edalber, edjuan; //tipeando variables
        Scanner entradaJ = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        edjuan = entradaJ.nextInt(); //edad de juan por teclado
        edalber = (2*edjuan)/3; //edad de alberto
        edana = (4*edjuan)/3; //edad de ana
        edmama = edjuan+edalber+edana; //edad de la mama, que es la suma de las edades
        System.out.println("Las edades son : ");
        System.out.println("Alberto = "+ edalber );
        System.out.println("Juan = "+ edjuan );
        System.out.println("Ana = "+ edana );
        System.out.println("Mama = "+ edmama ); //imprimo todo
    }
    
}