
package pylab3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int x,y;
        byte opc;
        
        Scanner varEntrada = new Scanner(System.in);
        
        System.out.println("Programa para mover el robotito");
        x = (int) Math.round(Math.random()*10);         //Genero un número aleatorio entre 0,0000000000000001y 0,999999999999
        y = (int) Math.round(Math.random()*10);         //lo redondeo y lo transformo a entero                     
        System.out.println("La poscición inicial del robotito es ( "+x+" : "+y+" )\n" );
        
            
        do {                                                        
            System.out.println("1) Mover 10 pasos arriba\n"+"2) Mover 20 pasos a la abajo\n"+
                               "3) Mover 10 pasos a derecha\n"+                                //ingreso de una a en de opciones
                               "4) Mover 20 a la izquierda\n5) Salir \n");            
            opc = varEntrada.nextByte();    
            
            while (opc<1 || 5<opc)              //valido que la opción ingresada sea correcta
            {
                System.out.println("Ingrese una opcion correcta");
                System.out.println("1) Mover 10 pasos arriba\n"+"2) Mover 20 pasos abajo\n"+
                                   "3) Mover 10 pasos a derecha\n"+ 
                                   "4) Mover 20 a la izquierda\n5) Salir \n");    
                 opc = varEntrada.nextByte();
            }        
            switch (opc) {                 //habiendo validado la opcion ingresada
                case 1: {y += 10; break;}  //hago la acción  según los valores posibles de opc 
                case 2: {y -= 20; break;}
                case 3: {x += 10; break;}
                case 4: {x -= 20; break;}
                case 5: {System.out.println("Hasta luego ameo"); break;}
            }           
            System.out.println("La poscición del robotito es ( "+x+" : "+y+" )\n" );
        } while (opc<5 && opc>0);
    }    
}
