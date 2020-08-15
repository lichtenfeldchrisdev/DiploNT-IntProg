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
                    break;      //para que no haga toda la comparacióncon el neg que rompe el do
                }
                if (num % 2 == 0) {
                    cpar += 1;
                    if (anterior % 2 == 0 && anterior != 0) {
                        alter = false;
                    }
                } else {
                    cimpar += 1;
                    if (anterior % 2 != 0 && anterior != 0) {
                        alter = false;
                    }
                }
            }else{
                hay0=true;
            }
            /* if ((anterior%2==0 && num%2==0) || (anterior%2!=0 && num%2!=0) && num!=0)  // si rompe altern pero despues la sigue no funciona
            {
                alter=false;
            }*/
            anterior = num;
        } while (num >= 0);

        if (alter == true) {
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
