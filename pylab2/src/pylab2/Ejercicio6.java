
package pylab2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        double a,b,c;
        double sp, sup;
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Ingrese los lados del triangulo deseado: ");
        
        System.out.println("Lado A");
        a = varEntrada.nextInt();
        System.out.println("Lado A");           //Por que no puedo ingresar ladoscon coma siendo a,b,c, double?
        b = varEntrada.nextInt();
        System.out.println("Lado A");
        c = varEntrada.nextInt();
        
        sp = (a+b+c)/2;              //Por que si ingreso los lados como int, sup=0? habiendo def sup como double
        sup = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c)); 
                                                    /* por que si intento hacer con variables
                                                    de tipo float da posible perdida de datos*/  
        System.out.println("La superficie del triangulo ingresado es: "+sup);
        
    }                                                         
    
}
