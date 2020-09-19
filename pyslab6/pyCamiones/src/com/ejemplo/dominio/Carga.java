
package com.ejemplo.dominio;

public abstract class Carga implements Comparable<Carga>{  // defino como clase abstracta por que no quiero instanciar objetos de clase carga
                                                            //solo es una abstracción mayor de la cual heredan caja, packing y bidon
    private final String contenido;                  //implements Comparable me permite redefinir CompareTo para esta clase

    public Carga(String contenido) {
        this.contenido = contenido;
    }
    
    public String getContenido(String contenido){
        return contenido ; 
    }
    
    public abstract float calcularPeso(); // definiendo un metodo abstracto obligo a las 
                                          //clases hijas a definirlo en ellas

    @Override
    public String toString() {
        return "La carga de contenido" + contenido ;
    }

        //Extoy dando los criterios de comparacion
    @Override
    public int compareTo(Carga bulto) {
        int  criterio = 0;
        if(this.calcularPeso() > bulto.calcularPeso()){
            criterio = 1;
        }else if (this.calcularPeso() < bulto.calcularPeso()){
            criterio = -1 ;
        }
        return criterio ;  
    }
    
    
    
}
