
package com.ejemplo.dominio;


public class Revista extends Publicacion{
    private int codigo;

    public Revista() {
        
        codigo = 1;
    }

    public Revista(int codigo, String titulo, int paginas) {
        super(titulo, paginas);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
       
        return "Revista " + super.toString();
    }
}
