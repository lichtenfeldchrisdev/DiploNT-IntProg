//Calcule el perimetro de un cuadrado ingresando un lado arbitrario
package pylab1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner varEntrada = new Scanner(System.in);
        int lado,per;
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = varEntrada.nextInt();
        per=lado*4;
        System.out.println("El perimetro de la figura para el lado solicitado es: "+per);
    }
    
}
