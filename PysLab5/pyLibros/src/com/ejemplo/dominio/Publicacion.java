
package com.ejemplo.dominio;

public class Publicacion {
    private String titulo ;
    private int paginas ; 

    public Publicacion() {
        paginas = 1 ; 
        titulo = "Sin definir";
    }

    public Publicacion(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = validarPaginas(paginas);
    }


    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    private int validarPaginas(int paginas){

    return (paginas > 0)? paginas:1;
    }
    
    @Override                   //tengo toString en Publicacion, pero quiero especializarla y que haga 
    public String toString() {  //el toString como le pinte (@override) a la clase hija
        String aux = "Titulo: "+titulo+" tiene "+paginas;
        
        return aux;
    }
    
    
}
