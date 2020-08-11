package pylab1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) 
    {
        
        float km, pr, kmL, consumo, importe;
        Scanner varEntrada = new Scanner(System.in);
         
        System.out.println("Ingrese los kilometros a recorrer: ");
        km = varEntrada.nextFloat();
        System.out.println("Ingrese el $/Lt de combustible: ");
        pr = varEntrada.nextFloat();
        System.out.println("Ingrese el rendimiento de Kms/lt de combustible: ");
        kmL = varEntrada.nextFloat();
        
        consumo = km/kmL;
        importe = consumo*pr;
        System.out.println("El vehiculo consumira "+consumo+" Lts de combustible "+"a un costo total de $"+importe);
    }
    
}
