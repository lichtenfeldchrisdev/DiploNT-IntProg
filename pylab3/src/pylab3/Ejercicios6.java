
package pylab3;

import java.util.Scanner;

public class Ejercicios6 {

    public static void main(String[] args) {
        
        int cuota, tipo, cant, totv, totl, cmayor;
        float prom;
        totv=totl=cmayor=0;
        String nombre, nmayor=null; 
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Estadisticas club nautico\n");
        System.out.println("Ingrese la cantidad de actual embarcaciones");
        cant = varEntrada.nextInt();
        
        for (int i = 1; i <= cant; i++) {
                        
            System.out.println("Nombre de la embarcación N°:"+i);
            nombre = varEntrada.next();
            
            System.out.println("Tipo de embarcación: ");
            tipo = varEntrada.nextInt();
            while (tipo != 1 && tipo != 2) {
                System.out.println("Tipo de embarcación no válida");
                System.out.println("Vuelva a ingresar el tipo de embarcación: ");
                tipo = varEntrada.nextInt();
            }
            
            System.out.println("Couta mensual abonada: ");
            cuota = varEntrada.nextInt();
            
            if (tipo==1 && cmayor<cuota) {
                cmayor = cuota;
                nmayor = nombre;
            }
            if (tipo==1) {
                totv += cuota;
            }else {
                totl += cuota;
            }
            System.out.println("");
        }        
        prom = (totv+totl)/cant;
        System.out.println("El total por veleros en el año fue: $ "+totv*12
                        +"\nEl total por lanchas en el año fue: $"+totl*12
                        +"\nEl que más aporto fue "+nmayor+" Con un total de: $"+cmayor
                        +"\nEl valor de la cuota promedio precibida es: $"+prom);                                        
    }
    
}
