
package pylab2;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args)
    {
        int nac, act;
        Scanner varEntrada = new Scanner(System.in);
        System.out.println("Ingrese su añode nacimiento: ");
        nac = varEntrada.nextInt();
        act = Calendar.getInstance().get(Calendar.YEAR);   
        System.out.println(act);
        System.out.println("Su edad es: "+(act-nac)+" años");
    }
    
}
