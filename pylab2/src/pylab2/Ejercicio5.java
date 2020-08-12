
package pylab2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int r;
        double vol;
        Scanner varEntrada = new  Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera deseada:");
        r = varEntrada.nextInt();
        vol = 1.33333333*(Math.PI)*Math.pow(r, 3);              //por que si defini vol double 4/3 da 1 ?
        System.out.println("El volumen de la esfera es: "+vol);
                                                                        
    }
    
}
