
package com.ejemplo.dominio;


public class Libro extends Publicacion{ 

    
    private String isbn;
    private String autor;
  
    
    public Libro() {
        super();
        isbn = "Sin ISBN";
        autor = "Desconocido";
    }

    public Libro(String isbn, String autor, String titulo, int paginas) {
        
        super(titulo, paginas);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    @Override
    public String toString() {
        
        String aux = "El libro con ISBN " + isbn + ", creado por el autor: "
                + autor + " tiene: " + getPaginas() + " páginas.";
        return aux;
    }
}
