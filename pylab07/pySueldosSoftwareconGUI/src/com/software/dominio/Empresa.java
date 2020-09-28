
package com.software.dominio;

import java.util.ArrayList;


public class Empresa {
    private final String cuit ; 
    private final String razonSocial ; 
    ArrayList<Trabajador> nomina = new ArrayList<>();   

    public Empresa(String razonSocial) {
        this.cuit = generaCuit();
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public ArrayList<Trabajador> getNomina() {
        return nomina;
    }
        
    public void agregarEmpleado(Trabajador persona){
        nomina.add(persona) ; 
    }
    
    public void incremSueldo(float porc){
        for (Trabajador x : nomina) {
            if (x instanceof Empleado){
               // x.setSueldo(x.getSueldo()*porc);
                ((Empleado) x).setSueldo(((Empleado) x).getSueldo()*(1+porc));
            }
        }
    }
    
    public String mostrarNomina(){
        StringBuilder aux = new StringBuilder("Nomina \n");
            for (Trabajador x : nomina) {
                aux.append(x.toString()).append("\n") ; 
        }
        
        return aux.toString();
    }
    
    public String presupuestoMensual(){
        float aux = 0 ;
        for (Trabajador x : nomina) {
            aux += x.calcularPaga();        //llamanda polimorfica
        }
        return Float.toString(aux); 
    }
    
    private String generaCuit(){
        int aux = (int) (100 * Math.random());
        StringBuilder cad = new StringBuilder(String.valueOf(aux));
        aux = (int) (100000000 * Math.random());
        cad.append("-").append(aux).append("-");
        aux = (int) (100 * Math.random());
        cad.append(aux);
        return cad.toString() ;         
    }
    
}
    