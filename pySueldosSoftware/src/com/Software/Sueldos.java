
package com.Software;


import com.software.dominio.Empresa;

public class Sueldos {

    public static void main(String[] args) {
//        
        Empresa empresa1 = new Empresa("rompesoftware");
        
        System.out.println(empresa1.mostrarNomina());
        empresa1.incremSueldo(0.25f);
        System.out.println(empresa1.mostrarNomina());
        
        
        
        
    }
    
}
