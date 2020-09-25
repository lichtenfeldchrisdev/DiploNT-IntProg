
package com.museo;

import com.museo.dominio.Historico;
import com.museo.dominio.Objetos;
import com.museo.dominio.Obra;
import com.museo.dominio.Sala;

public class Ejecutable {

    public static void main(String[] args) {
        Objetos momia1 = new Historico("Nilo y Sahara", "Antiguo egipto", 43243, "Tutankamón", -1400) ; 
        Objetos cuadro1 = new Obra("Leonardo Da Vinci", "Francia", 3454432, "Gioconda", 1452) ;
        
        Sala sala1 = new Sala("A", "norte") ; 
        
        sala1.agregaObra(momia1);
        sala1.agregaObra(cuadro1);
        
        System.out.println(sala1.MostrarMayoresA(1600) + "\n\n");
        System.out.println(sala1.muestraObras());       
    }
    
}
