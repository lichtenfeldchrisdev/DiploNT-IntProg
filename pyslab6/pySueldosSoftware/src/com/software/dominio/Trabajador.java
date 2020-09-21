
package com.software.dominio;

public abstract class Trabajador {
    
    private final String puesto ;
    private final String legajo ; 
    private final String nombre ; 
    private final String fechaC ; 

    public Trabajador(String puesto, String legajo, String nombre, String fechaC) {
        this.puesto = puesto;
        this.legajo = legajo;
        this.nombre = nombre;
        this.fechaC = fechaC;
    }
    
    public String getLegajo(){
        return legajo ;
    }

    public String getFechaC() {
        return fechaC;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
    public abstract float calcularPaga();
    
    public String toString(){
        return "El trabajador "+ nombre +" Legajo : "+ legajo + " Contratado el " +fechaC+
                " en el puesto "+ puesto ;
    }
}
