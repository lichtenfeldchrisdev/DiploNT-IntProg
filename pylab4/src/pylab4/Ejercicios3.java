package pylab4;

import java.util.Scanner;

public class Ejercicios3 {
    public static void main(String[] args)
    {
        float tiempos[], aux, prom, tgan, tTot;
        int aban ;
        Scanner entrada = new Scanner(System.in);
        tTot = tgan = 0;
        aban = 0 ;        
        tiempos = new float[20];
                                            //ingreso los datos al arreglo
        for (int i = 0; i < 20; i++) 
        {
            System.out.println("Ingrese el tiempo n° "+(i+1));
            tiempos [i] = entrada.nextFloat() ;
            tTot += tiempos [i] ; 
            if (tiempos[i]==0)
            {
                aban += 1 ;                //conteo de los que abandonaron
            }               
        }
                                        
        for (int i = 0; i < tiempos.length - 1; i++)
        {
            for (int j = i+1; j < tiempos.length ; j++) 
            {
                if (tiempos[j]<tiempos[i])
                {
                    aux = tiempos[i] ;
                    tiempos[i] = tiempos[j] ;                   //ordenamiento del arreglo
                    tiempos[j] = aux ; 
                }
            }
        }
        System.out.println("Los tiempos en mins son: ");
        
        for (int i = 0 ; i < tiempos.length ; i++)
        {
            if (tiempos[i]!=0)
            {
                System.out.print((i+1-aban)+") "+tiempos[i]+"  ");      //formato de la salida
            }
        }
        tgan = tiempos[aban];
        prom = tTot/(20-aban) ;
        System.out.println("\nLa  cantidad de abandonos es "+aban);
        System.out.println("El tiempo promedio de la carrera es "+prom);
        System.out.println("El tiempo ganador es "+tgan);
    }  

}
