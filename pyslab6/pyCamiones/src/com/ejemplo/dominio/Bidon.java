
package com.ejemplo.dominio;

public class Bidon extends Carga{
    
    private final float capacidad;
    private final float densidad ; 

    public Bidon(float capacidad, float densidad, String contenido) {
        super(contenido);
        this.capacidad = capacidad;
        this.densidad = densidad;
    }

    public float getDensidad() {
        return densidad;
    }

    public float getCapacidad() {
        return capacidad;
    }
    
    @Override
    public float calcularPeso() {
        float peso = capacidad * densidad ; 
        return peso ; 
    }
    
    //aca falta el tostring
}
