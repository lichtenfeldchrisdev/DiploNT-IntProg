
package com.software.dominio;

public class Empleado extends Trabajador{
    
    
    private float sueldo ; 
    private float hsExtra ; 

    public Empleado(float sueldo, String puesto, String legajo, String nombre, String fechaC) {
        super(puesto, legajo, nombre, fechaC);
        this.sueldo = sueldo;
        hsExtra = 0;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }
        
    public void setHsExtras(float h){
        hsExtra = h ; 
    }

    public float getHsExtra() {
        return hsExtra;
    }
    
    @Override
    public float calcularPaga() {
        float aux = sueldo + 300 * hsExtra;
        return aux;
    }

    @Override
    public String toString() {
        return super.toString() + " Percibe un total de $ " + sueldo;
    }
    
    
    
    
    
    
}

