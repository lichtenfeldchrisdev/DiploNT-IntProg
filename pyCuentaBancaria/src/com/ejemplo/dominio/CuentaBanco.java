
package com.ejemplo.dominio;

import java.util.Scanner;


public class CuentaBanco   // la clase cuenta banco es el molde de todos los objetos(cuentas) que voy a crear
{
    //atributos
    private long codigo;
    private float saldo ;   //los atributos de una clase deben permanecer ocultos
    private String titular; //
    Scanner monto = new Scanner(System.in) ; 

    
    
    //comportamientos de acceso o accesores (metodos)
    public long getCodigo()          //pedir código
    {
        return codigo;              //dentro de los metodos siempre tengo acceso a los atributos de la clase    
    }
    
    public void setCodigo(long cod)  //tipo y nombre de parametro que recibe el metodo
    {
        codigo = cod ;              
    }
    
    public float getSaldo()
    {
        return saldo ; 
    }
    
    public int menu (int opc)
    {
        while(4<opc && opc<1)
        {
            System.out.println("Ingresar opción válida");
            System.out.println("1) Extraccion \n2) Ingreso \n3) Consulta de saldo ");
            opc = monto.nextInt() ;            
        }
        
        return opc ; 
    }
    
    public float operacion (int opc)
    {
        switch(opc)
        {
            case 1 :
            { 
                System.out.println("Ingrese monto a retirar");
                saldo -= monto.nextDouble() ;
                break;
            }
            case 2 :
            { 
                System.out.println("Ingrese monto a depositar");
                saldo += monto.nextDouble() ;
                break;
            }
            case 3 :
            {
                System.out.println("Su saldo es "+saldo);
                break ; 
                       
            }
        }
        return saldo ; 
    }
}   
    

