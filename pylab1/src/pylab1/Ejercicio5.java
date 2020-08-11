package pylab1;

import java.util.Scanner;
        

public class Ejercicio5 {

    public static void main(String[] args) {
        int a, b, suma, resta1, resta2 , producto;
        Scanner varEntrada = new Scanner(System.in);
        System.out.println("Ingrese A");
        a = varEntrada.nextInt();
        System.out.println("Ingrese B");
        b = varEntrada.nextInt();
        
        suma = a+b;
        producto = a*b;
        resta1 = a-b;
        resta2 = b-a;
        
        System.out.println("A+B = "+suma);
        System.out.println("AxB = "+producto);
        System.out.println("A-B = "+resta1);
        System.out.println("B-A = "+resta2);        
    
    }
    
}
