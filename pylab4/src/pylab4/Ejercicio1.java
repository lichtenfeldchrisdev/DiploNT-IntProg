
package pylab4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) 
    {
        float mediapos , medianeg;
        int acuneg , acupos , cneg , cpos , nums[];         //def variables necessarias 
        
        Scanner varEntrada = new Scanner(System.in);        //inicializo variable obeto de entrada 
        nums = new int[100];                                
        acuneg = acupos = cneg = cpos = 0;                  //asignacion multiple a acumuladores y contadores
        
        for (int i= 0 ; i < nums.length ; i++)              //ciclo que recorrera el arreglo
        {
            System.out.println("Cargando el número "+(i+1)+"\nDigite el numero : ");
            nums[i] = varEntrada.nextInt();
            
            if (nums[i]<0) 
            {
                acuneg += nums[i] ;         //si es positivo, acumula el valor y lo cuenta
                cneg += 1 ;
            }else if (nums[i]>0)
            {
                acupos +=nums[i] ;          //si es negativo, acumula el valor y lo cuenta
                cpos +=1 ;
            }
        }
        medianeg = (float) acuneg / cneg ; 
        mediapos = (float) acupos / cpos ;
        System.out.println("La media de positivos es --> "+mediapos+"\nLa media de negativos es --> "+medianeg);
    }    
}
