
package pylab3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        byte hs, mins;
        String am_pm="AM";
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Conversión de hoario 24Hs->12Hs");
        System.out.println("Ingrese las Hs: ");
        hs = varEntrada.nextByte();
        System.out.println("Ingrese las Mins: ");        
        mins = varEntrada.nextByte();
        if ((hs<0 || hs>24)||(mins<0 || mins>60)) 
        {
            System.out.println("Los datos ingresados son incorrectos");
        }else if (hs>12) {
            hs-=12;
            am_pm="PM";
            System.out.println("La hora es : "+hs+":"+mins+" "+am_pm);
        }else{
            am_pm="AM";
            System.out.println("LA hora es : "+hs+":"+mins+" "+am_pm);
        }
        
    }
    
}
