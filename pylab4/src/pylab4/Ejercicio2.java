
package pylab4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int dado1[] , dado2[], suma[] ;      //defino 1 lista para cada dado y otra para los valoresde las suma de los dados
        int lanz , ciguales , lanzImpar;     // ||   cantidad de lanzamientos, contador de lanz con ambos num iguales y n° de lanz  con sma impar
        Scanner varEntrada = new Scanner(System.in) ;     
        ciguales = lanzImpar = 0 ;          
        
        System.out.println("¿Cuantas veces va a lanzar los dados?");
        lanz = varEntrada.nextInt();
        dado1 = new int [lanz] ;
        dado2 = new int [lanz] ;        //inicializo tamaño de los vectores 
        suma = new int [lanz] ; 
        
        for (int i = 0 ; i<lanz ; i++ )
        {
            dado1[i] = (int) (Math.random()*6) + 1 ;
            dado2[i] = (int) (Math.random()*6) + 1 ;            
            System.out.println("Lanzamiento "+(i+1)+"|\n\t\tDado 1 --> "+dado1[i]+"\t Dado2 --> "+dado2[i]);
            
            if (dado1[i] == dado2[i])
            {
                ciguales += 1 ;
            }         
            suma[i] = dado1[i] + dado2 [i] ;   //almaceno en la lista de sumas para ver cual fue la primer suma impar         
        }
        
        for (int i = 0 ; i < lanz ; i++)            //recorrro la lista de sumas 
        {
            if ((dado1[i] + dado2 [i])%2 != 0)
            {
                lanzImpar = (i+1) ;                 //cuando encuentro la primer suma impar, rompo el recorrido
                break ; 
            }
        }        
        System.out.println("Hubo "+ciguales+" lanzamientos con los mismos valores");
        System.out.println("estos representan el "+((ciguales/(lanz*1.0)*100))+" % de los lanzamientos");
        System.out.println("La primera suma impar de los dados se dio en el lanzamiento N° "+lanzImpar) ;                
    }
    
}
