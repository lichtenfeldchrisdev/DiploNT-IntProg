package pylab3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int x, y;
        double dist;
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Ingrese coordenada x");
        x = varEntrada.nextInt();
        System.out.println("Ingrese coordenada y");
        y = varEntrada.nextInt();
        
        if (x>0 && y>0) {
            System.out.println("El Punto se encuentra en el primer cuadrante");
        }
        if (x<0 && y<0) {
            System.out.println("Elpuunto se encuentra en el tercercuadrante");
        }
        dist = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println("La distancia al origen de coordenadas es "+dist);
    }

}
