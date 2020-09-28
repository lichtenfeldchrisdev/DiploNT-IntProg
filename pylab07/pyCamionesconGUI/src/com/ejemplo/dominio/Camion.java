
package com.ejemplo.dominio;

import java.util.ArrayList;
import java.util.Collections;


public class Camion {
    
    private byte estado ;  // 1 se puede cargar, 2 en reparación 3 en viaje 
    private float cargaMax ; 
    private ArrayList<Carga> carga ;
    private float pesoTotal ; 

    public Camion(float cargaMax) {
        estado = 1 ; 
        this.cargaMax = cargaMax ; 
        this.carga = new ArrayList<>(); 
        pesoTotal = 0 ; 
    }
    
    public void setEstado (byte estado){
        this.estado = estado ; 
    }

    public byte getEstado() {
        return estado;
    }
    
    
    public boolean subirCarga(Carga bulto){
        boolean aux = false ; 
        
        if (estado == 1 && ( pesoTotal + bulto.calcularPeso() ) < cargaMax) {
            this.carga.add(bulto) ;
            aux = true ; 
            pesoTotal += bulto.calcularPeso();
        }        
        return aux ;  
    } 
    
    public boolean bajarCarga(Carga bulto){
        boolean aux = false ; 
        
        if (carga.contains(bulto) && estado == 1) {
            carga.remove(carga.indexOf(bulto)) ;
            pesoTotal -= bulto.calcularPeso();
            aux = true ; 
        }
        return aux ; 
    }
    
    public String verCarga(){
        String aux = "El total de bultos es " + carga.size() + "Peso Total: " + pesoTotal; 
        return aux ;         
        }
    
    public String listadoCargas(){
        
        Collections.sort(carga); //pude usar sort por que redefiní compareTo en la clase base
        StringBuilder aux = new StringBuilder("Listado de cargas:\n "); //optimizacion de memoria en el uso de cadenas
                                                                    //no queda guardada una nueva cadena en cada concatenacion
        for (Carga x : carga) {                        //para que luego el garbage collector limpie cuando se desrreferencian
            aux.append(x.toString()).append("\n") ; 
        }
        return aux.toString(); // aca usa el tostring de la clase StringBuilder 
    }
    
    public boolean listoParaSalida(){
        boolean aux = false ; 
        
        aux =(estado == 1 && pesoTotal >= 0.75*cargaMax ) ;
            
        return aux ; 
    }
}
    
    
        

