package pylab3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num, cpar, cimpar, anterior;
        boolean hay0, alter;
        cpar = cimpar = anterior = 0;
        hay0 = false;
        alter = true;
        Scanner varEntrada = new Scanner(System.in);

        System.out.println("Análisis de serie numerica\nel programa finalizara con un número negativo\n");

        do {
            System.out.println("Ingresar número:\n");
            num = varEntrada.nextInt();

            if (num != 0) {
                if (num < 0) {
                    break;             //rompo el ciclo para que no haga toda la comparación cuando ingreso un negativo para salir
                }               
                if (num % 2 == 0) {             
                    cpar += 1;                 // si es par cuenta par
                    if (anterior % 2 == 0 && anterior != 0) {      //siendo par, si el anterior tambien es par, baja la bardera     
                        alter = false;                         //no tiene que comparar con el 0
                    }
                } else {
                    cimpar += 1;                            // si es impar,cuenta impar
                    if (anterior % 2 != 0 && anterior != 0) {   //siendo impar,si el anterior tambien, baja la bandera
                        alter = false;
                    }
                }
            }else{
                hay0=true;     //si hubo cero no entro a la comparacion y levanta bandera
            }
            
            anterior = num;         //almaceno numero anterior para la prtox vuelta 
        } while (num >= 0);     //rompe do-while si se ingresa negativo

        if (alter == true) {         // si la bandera se mantuvo true la secuencia fue alternada
            System.out.println("La secuencia se mantuvo alternada");
        } else {
            System.out.println("La secuencia no fue alternada");
        }

        System.out.println("La cantidad de pares es: " + cpar + "\nLa cantidad de impares es: " + cimpar);

        if (hay0) {
            System.out.println("Hubo al menos algún cero");    
        } else {
            System.out.println("No hubo ceros");
        }
    }
}
