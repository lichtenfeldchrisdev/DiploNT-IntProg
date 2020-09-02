/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Biblioteca {
    private final Libro[] estanteria;
    private int ultimoLibro;

    public Biblioteca() {
         estanteria = new Libro[20];
         ultimoLibro = 0; 
    }
    
    public Biblioteca(int cant) {
        estanteria = new Libro[cant];
    }
    
    public Libro[] getEstanteria(){
        return estanteria;
    }
    
    public boolean agregarLibro(Libro unLibro){
        boolean aux = false; 
//        for (int i = 0; i < estanteria.length; i++) {
//            if(estanteria[i]==null){
//                estanteria[i] = unLibro;
//                aux = true; // avisar que se pudo agregar el libro a la estantería
//                break;  // corto para que no agregue el libro a todos los lugares vacios
//            }
//        }
        if (ultimoLibro < estanteria.length) {  //sino esta lena la estanteria 
            estanteria[ultimoLibro] = unLibro;  //acceso directo (no secuencial) al arreglo
            aux = true ;                        //es más eficiente que recorrer el arreglo
            ultimoLibro++;
            
        }
        return aux;//permite informar si efectivamente se pudo agregar el libro      
    }

    public String mostrarListado() {
        String aux = "Estanteria:\n[";
        for (int i = 0; i < estanteria.length; i++) {
            if(estanteria[i]!=null){        //si en estanteria[i] hay libro
                aux += estanteria[i].getTitulo() + "\t|";
            }else{
                aux = aux + "Lugar vacío\t|";
            }
                
        }
        aux +="]";
        
        return aux;
    }
    
    
    
    
    
    
    
}
