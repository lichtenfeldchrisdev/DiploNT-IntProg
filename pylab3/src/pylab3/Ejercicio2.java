
package pylab3;
import java.util.Scanner;
public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        short año;
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Calculo de años biciestos:");
        System.out.println("Ingrese el año a verificar:");
        año = varEntrada.nextShort();
        
        if (año%4==0 || (año%100==0 && año%400==0))
        {           
            System.out.println("Es biciesto");             //Consultar si esta indentación y lugar de las llaves 
        }                                                  //es o no una buena práctica.       
        else
        {
            System.out.println("No es biciesto");
        }       
    }
}

