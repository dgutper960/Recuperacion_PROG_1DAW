package Tema_5.Actividad_4;

import java.util.Date;

/** Definimos una clase Book que representa un libro inmutable con un título, un autor y una fecha de publicación. */

public class Book {
    /** Definimos los campos para los libros */
    private String titulo;
    private String autor;
    private String fechaPublic;

    /** Creamos el constructor para que los campos sean obligatorios en las instancias */
    public Book(String titulo, String autor, String fechaPublic) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublic = fechaPublic;
    }

    /** Creamos el toString correspondiente  */
    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublic=" + fechaPublic +
                '}';
    }

    /** Creamos los getters and setters */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublic() {
        return fechaPublic;
    }

    public void setFechaPublic(String fechaPublic) {
        this.fechaPublic = fechaPublic;
    }
}
