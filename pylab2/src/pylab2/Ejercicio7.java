
package pylab2;
import java.util.Scanner;

public class Ejercicio7 {


    public static void main(String[] args) {
        int num,u,d,c;
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero de 3 cifras");
        num = varEntrada.nextInt();
        
        c = num/100;
        num -= c*100;
        d = num/10;
        num -= d*10;       
        
        System.out.println("Unidad= "+num);
        System.out.println("Decena= "+d);
        System.out.println("Centena= "+c);
    }
    
}
