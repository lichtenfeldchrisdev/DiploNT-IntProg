
package puntoplano;

import java.util.Scanner;
import puntoplano.dominio.CreadorPunto;

public class PuntoPlano {

    public static void main(String[] args) 
    {
        CreadorPunto punto ;
        Scanner ingreso ;
        ingreso = new Scanner(System.in);
        float x,y ; 
        System.out.println("Ingrese las coordenadas de un punto x,y respectivamente");
        x=ingreso.nextFloat();
        y=ingreso.nextFloat();
        punto = new CreadorPunto(x,y);

        System.out.println(punto.toString()); 
    }
    
}
