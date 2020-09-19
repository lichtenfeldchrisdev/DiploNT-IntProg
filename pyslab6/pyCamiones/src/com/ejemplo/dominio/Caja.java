
package com.ejemplo.dominio;

public class Caja extends Carga{
    
    private final float peso ; 

    public Caja(float peso, String contenido) {
        super(contenido);
        this.peso = peso;
    }

    
   
    public float calcularPeso() {
        return peso ;
    }

    @Override
    public String toString() {
        return super.toString() + "pesa: " + peso ; 
    }
    
    
    
    
    
    
    
}
