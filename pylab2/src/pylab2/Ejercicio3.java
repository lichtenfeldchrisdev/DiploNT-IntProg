
package pylab2;

import java.util.Calendar;      //importa clase calentar 
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args)
    {
        int nac, act;
        Scanner varEntrada = new Scanner(System.in);
        System.out.println("Ingrese su añode nacimiento: ");
        nac = varEntrada.nextInt();                         
        act = Calendar.getInstance().get(Calendar.YEAR);     //llama a la fecha actual
        System.out.println(act);
        System.out.println("Su edad es: "+(act-nac)+" años"); // diferencia de años
    }
    
}
