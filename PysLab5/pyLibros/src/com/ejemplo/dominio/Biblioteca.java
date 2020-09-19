
package com.ejemplo.dominio;

public class Biblioteca {             //implicitamente todas las clases o sus padres heredan de Objects
    private final Publicacion[] estanteria;  // final por que el tamaño del objeto estanteria es fijo . 
    private int ultimo;

    public Biblioteca() {
         estanteria = new Publicacion[20];
         ultimo = 0; 
    }
    
    public Biblioteca(int cant) {
        estanteria = new Libro[cant];
    }
    
    public Publicacion[] getEstanteria(){
        return estanteria;
    }
    
    public boolean agregarPublicacion(Publicacion unaPublicacion ){
        boolean aux = false; 
//        for (int i = 0; i < estanteria.length; i++) {
//            if(estanteria[i]==null){
//                estanteria[i] = unLibro;
//                aux = true; // avisar que se pudo agregar el libro a la estantería
//                break;  // corto para que no agregue el libro a todos los lugares vacios
//            }
//        }
        if (ultimo < estanteria.length) {  //sino esta lena la estanteria 
            estanteria[ultimo] = unaPublicacion;  //acceso directo (no secuencial) al arreglo
            aux = true ;                        //es más eficiente que recorrer el arreglo
            ultimo++;            
        }
        return aux;//permite informar si efectivamente se pudo agregar el libro      
    }

    public String mostrarListado() {
        String aux = "Estanteria:\n[";
        for (int i = 0; i < estanteria.length; i++) {
            if(estanteria[i]!=null){        //si en estanteria[i] hay libro
                aux += estanteria[i].getTitulo() + "\t|";  // getTitulo() lo entienden los libros 
                                                           // y las revistas por que ambar heredan de publicacion el metodo
            }else{
                aux = aux + "Lugar vacío\t|";
            }           
        }
        aux +="]";
        
        return aux;
    }
    
    public String buscarPublicacion(String titulo){
        String aux = "La publicación no se encuentra en la biblioteca"; 
        
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i]!=null){       
                if (estanteria[i].getTitulo().equals(titulo)) {
                    aux = estanteria[i].toString(); 
                    break; // no quiero seguir buscando a menos que tengo el libro 2 veces
                }
            }
        }
        return aux ; 
    }
    
    public int contarLibros(int paginas){
        int aux=0 ;
        for (int i = 0 ; i<estanteria.length ; i++){
            if (estanteria[i]!=null){
                if (estanteria[i] instanceof Libro) // Comparo tipo del objeto en estanteria[i] con el tipo Libro.
                aux +=1;
            }
        }        
        return aux ; 
    }
}
