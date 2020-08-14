
package pylab3;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        
        String articulo; 
        float pr,prd=0,cl;
       // byte cl;
        Scanner varEntrada = new Scanner(System.in);        
        System.out.println("Carga de inventario ");
        
        do {            
            System.out.println("Ingrese producto: ");
            articulo = varEntrada.next();
            System.out.println("Ingrese el precio:");
            pr = varEntrada.nextFloat();
            System.out.println("Ingrese código de decuento:");
            cl= varEntrada.nextFloat();
            if (cl==1 || cl==2) 
            {
                prd = pr*(1-cl/10); //cuando hay una división todos los componentes del calculo deben ser float o double? 
                System.out.println("El producto es :"+articulo+"\nPrecio de lista: $"+pr+"\nPrecio con desc: $"+prd+"\n");
            }else 
            {
                System.out.println("La clave ingresada es incorrecta \nvuelva a cargar el articulo");
            }
            
        } while (true);
        
    }
    
}
