
package com.ejemplo;

import com.ejemplo.dominio.CuentaBanco;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args)
    {
        CuentaBanco micuenta;
        micuenta = new CuentaBanco();           //variable objeto creada por la clase cuenta banco
        Scanner entrada = new Scanner(System.in) ; 
        
        micuenta.setCodigo((long)(Math.random()*100000000)); // pasando mensaje (genero numero de cuenta
        System.out.println("Su cuenta fue creada con exito  con el numero "+micuenta.getCodigo());
        
        System.out.println("Que operación desea realizar: ");
        System.out.println("1) Extraccion \n2) Ingreso \n3) Consulta de saldo \n4) Salir");
        micuenta.operacion(micuenta.menu(entrada.nextInt()));
        
        
        
    }
    
}
