
package com.software.dominio;

public class Consultor extends Trabajador{
    
    private float cantHs ;
    private final float prHs ;

    public Consultor(float prHs, String puesto, String legajo, String nombre, String fechaC) {
        super(puesto, legajo, nombre, fechaC);
        this.prHs = prHs;
        cantHs = 1 ; 
    }

    public void setCantHs(float cantHs) {
        this.cantHs = cantHs;
    }

    public float getCantHs() {
        return cantHs;
    }

    public float getPrHs() {
        return prHs;
    }

    @Override
    public float calcularPaga() {
        float paga = cantHs * prHs ; 
        return paga ; 
    }

    @Override
    public String toString() {
        return super.toString() + " Cobra un total de $ " + (cantHs*prHs); 
    }
    
    
    
    
}
