
package com.museo.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sala {
    private final String nombre;
    private final String ala ; 
    private ArrayList<Objetos> coleccion ;

    public Sala(String nombre, String ala) {
        this.nombre = nombre;
        this.ala = ala;
        coleccion = new ArrayList<>() ;
    }

    public String getAla() {
        return ala;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregaObra(Objetos x){
        coleccion.add(x) ; 
    }
    
    public String muestraObras(){
        StringBuilder aux = new StringBuilder("Listado de objetos \n\n") ;
        for (Objetos x : coleccion) {
            aux.append(x.toString()).append("\n") ; 
        }
        return aux.toString(); 
    }
    
    public String MostrarMayoresA(int años){
        StringBuilder viejos = new StringBuilder("Las obras mas antiguas a ")
                                        .append(años).append(" años son : \n\n"); 
        for (Objetos x : coleccion) {
            if(LocalDate.now().getYear() - x.getAnio() >= años){
                viejos.append(x.toString()) ; 
            }
        }
        return viejos.toString() ;
    }
}
