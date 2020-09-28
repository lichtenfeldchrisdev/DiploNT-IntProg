
package com.museo.dominio;

public abstract class Objetos {
    
    private final int codigo;
    private final String nombre;
    private final int anio;

    public Objetos(int codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnio() {
        return anio;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString(){
        return "|El objeto " + nombre + "|Código: " + codigo ; 
    }
    
    public String compareTo(Objetos x){
        
        StringBuilder aux ;
        aux = new StringBuilder("El objeto: ") ;
        if(getAnio() < x.getAnio())
        {
            aux.append(getNombre()).append("Es más viejo que ")
            .append(x.getNombre()) ;
        }
        else if (x.getAnio() < getAnio()) 
        {
            aux.append(x.getNombre()).append("Es más viejo que ")
            .append(getNombre()) ;
        }else
        {
            aux.append(x.getNombre()).append("tiene la misma antiguedad que ")
            .append(getNombre()) ; 
        }
        return aux.toString() ; 
    }
    
    public abstract String name();
}

