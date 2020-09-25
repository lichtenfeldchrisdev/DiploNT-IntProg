
package com.museo.dominio;

public class Obra extends Objetos{
    private final String autor ; 
    private final String pais ; 

    public Obra(String autor, String pais, int codigo, String nombre, int anio) {
        super(codigo, nombre, anio);
        this.autor = autor;
        this.pais = pais;
    }

    public String getAutor() {
        return autor;
    }

    public String getPais() {
        return pais;
    }
    
    @Override
    public String name()
    {
        StringBuilder aux ;
        aux = new StringBuilder(getNombre()).append("(")
        .append(getPais()).append(")") ; 
        return aux.toString() ; 
    }

    @Override
    public String toString() {
        return super.toString() + " Fue realizado en " +pais +
                " por el autor " + autor;  
    }
    
    
}
