
package pylab2;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int hs, mins, segs;
        hs=mins=segs=0;
        Scanner varEntrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos deseada para la conversión: ");
        segs = varEntrada.nextInt();
        
        while (segs>59) {
             mins+=1;
             segs-=60;    
        }
        while (mins>59){
            hs+=1;
            mins-=60;
        }
        System.out.println("El tiempo transcurrido es: "+hs+" hs :"+mins+" mins :"+segs+" segs");
    }
    
}
