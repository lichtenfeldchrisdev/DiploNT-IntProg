
package pylab3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        double x,y;
        byte opc;
        
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Programa para mover el robotito");
        x =  Math.random()*10;
        y =  Math.random()*10;                              
        System.out.println("La poscición inicial del robotito es ( "+x+" : "+y+" )\n" );
        
            
        do {
            System.out.println("1) Mover 10 pasos arriba\n"+"2) Mover 20 pasos a la abajo\n"+
                               "3) Mover 10 pasos a derecha\n"+ 
                               "4) Mover 20 a la izquierda\n5) Salir \n");            
            opc = varEntrada.nextByte();    
            
            while (opc<1 || 5<opc)
            {
                System.out.println("Ingrese una opcion correcta");
                System.out.println("1) Mover 10 pasos arriba\n"+"2) Mover 20 pasos abajo\n"+
                                   "3) Mover 10 pasos a derecha\n"+ 
                                   "4) Mover 20 a la izquierda\n5) Salir \n");    
                 opc = varEntrada.nextByte();
            }        
            switch (opc) {
                case 1: {y += 10; break;}
                case 2: {y -= 20; break;}
                case 3: {x += 10; break;}
                case 4: {x -= 20; break;}
                case 5: {System.out.println("hasta luego ameo"); break;}
            }           
            System.out.println("La poscición del robotito es ( "+x+" : "+y+" )\n" );
        } while (opc<5 && opc>0);
    }    
}
