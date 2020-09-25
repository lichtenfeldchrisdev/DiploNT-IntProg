
package com.museo.dominio;

public class Historico extends Objetos{
    private final String zona ; 
    private final String origen;
    
    public Historico(String zona, String origen, int codigo , String nombre, int anio){
        super(codigo, nombre, anio);
        this.zona = zona;
        this.origen = origen;    
    }

    public String getZona() {
        return zona;
    }

    public String getOrigen() {
        return origen;
    }

   
    @Override
    public String name(){
        StringBuilder aux ;
        aux = new StringBuilder(getNombre()).append("(")
        .append(getZona()).append(")") ; 
        return aux.toString() ; 
    }

    @Override
    public String toString() {
        return super.toString() + " Fue hallado en " + zona +
                " y es de origen "+ origen ; 
    }
    
    
    
    
}
