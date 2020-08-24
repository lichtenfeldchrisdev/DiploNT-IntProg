
package pylab4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) 
    {
        int multas, cods[], coincidencia, mayorCoincidencia,codMayCoinc ;
        float imp[], tot ;
        Scanner entrada = new Scanner(System.in) ; 
                
        System.out.println("Ingrese la cantidad de actas labradas durante el fin de semana ");
        tot = mayorCoincidencia = codMayCoinc = 0 ;
        multas = entrada.nextInt() ;
        cods = new int[multas] ;
        imp = new float[multas] ; 
        
        System.out.println("Ingresar códigos de las infracciones");
        
        for (int i = 0 ; i < cods.length ; i++)     //carga  de los código de infraccion en el arreglo
        {
            do
            {
                System.out.println("Acta N° "+(i+1)+" Código de infracción:");
                cods[i] = entrada.nextInt() ;               //validacion del código ingresado en e arreglo
            }
            while(cods[i]<1 && 20<cods[i]);
            
            switch(cods[i])                             //carga del arreglo de importes 
            {
                case 1: imp[i] = 50 ; break ; 
                case 2: imp[i] = 100 ;break ;  
                case 3: imp[i] = 150 ;break ;  
                case 4: imp[i] = 200 ;break ;  
                case 5: imp[i] = 250 ;break ;  
                case 6: imp[i] = 300 ;break ;  
                case 7: imp[i] = 350 ;break ;  
                case 8: imp[i] = 400 ;break ;  
                case 9: imp[i] = 450 ;break ;  
                case 10: imp[i] = 500;break ; 
                case 11: imp[i] = 550; break ;
                case 12: imp[i] = 600; break ;
                case 13: imp[i] = 650; break ;
                case 14: imp[i] = 700; break ;
                case 15: imp[i] = 750; break ;
                case 16: imp[i] = 800; break ;
                case 17: imp[i] = 850; break ;
                case 18: imp[i] = 900; break ;
                case 19: imp[i] = 950; break ;
                case 20: imp[i] = 1000 ; break ;
            }
            tot += imp[i] ;                     //Calcula el importe total de infracciones            
        } 
        System.out.println("El monto por actas labradas fue de $"+tot);
        
        for (int i = 0 ; i < cods.length ; i++)
        {    
            coincidencia = 0 ;            
            for (int j = 0 ; j < cods.length ; j++)
            {
                if ((i+1) == cods[j])
                {                               //recorro la lista de infracciones comparando cada uno de los codigos 
                    coincidencia += 1 ;                 
                }
            }
            
            if (coincidencia !=0 )              //Si hubo coincidencias los muestro por pantalla
            {
                System.out.println("El código "+(i+1)+" se repitió "+coincidencia+" veces. ");
                
                if (mayorCoincidencia<coincidencia)
                {
                    mayorCoincidencia = coincidencia ;          //almaceno el nummero mayor de coincidencias y su codigo
                    codMayCoinc = i+1 ;                     
                }
            }
        }
        System.out.println("El código de infracción más recurrente fue el"+codMayCoinc+" en un total de "+mayorCoincidencia+" actas");
    }
}
    

