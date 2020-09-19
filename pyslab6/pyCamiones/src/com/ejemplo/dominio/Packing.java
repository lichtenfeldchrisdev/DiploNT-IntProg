
package com.ejemplo.dominio;

public class Packing extends Carga{
    
    private final float pesoCaja ;
    private final int cantCajas ; 
    private final float pesoPallet ; 

    public Packing(float pesoCaja, int cantCajas, float pesoPallet, String contenido) {
        super(contenido);
        this.pesoCaja = pesoCaja;
        this.cantCajas = cantCajas;
        this.pesoPallet = pesoPallet;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public float getPesoCaja() {
        return pesoCaja;
    }

    public float getPesoPallet() {
        return pesoPallet;
    }
        
    @Override
    public float calcularPeso() {
        float peso = pesoCaja * cantCajas + pesoPallet ; 
        return peso;
    }

    
    
    
}
