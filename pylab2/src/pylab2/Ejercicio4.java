
package pylab2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int c100,c200,c500,c1000,ret;
        Scanner varEntrada = new Scanner(System.in);
        System.out.println("Bienvenido a Black Link");
        System.out.println("Ingrese el monto de dinero a retirar:");
        ret = varEntrada.nextInt();
                                
        c1000=ret/1000;
        ret-=(1000*c1000);
        c500=ret/500;
        ret-=(500*c500);
        c200=ret/200;
        ret-=(200*c200);
        c100=ret/100;
        ret-=(100*c100);
        
        System.out.println("Ud. debe retirar");
        System.out.println(c100+" billetes de 100");
        System.out.println(c200+" billetes de 200");
        System.out.println(c500+" billetes de 500");
        System.out.println(c1000+" billetes de 1000");
        System.out.println("Queda disponible en su cuenta: $"+ret);
    
        
    }    
    
}
