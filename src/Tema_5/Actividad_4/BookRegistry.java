package Tema_5.Actividad_4;

/** Creamos una clase BookRegistry que mantiene un registro de todos los libros agregados y proporciona los métodos:
 * -> addBook(), creamos un nuevo objeto Book inmutable y lo agregamos a la lista de libros.
 * -> searchByTitle(), buscamos libros que coincidan con el título dado
 * y devolvemos una lista de objetos Book inmutables que contienen la información del libro */

// Importamos las clases necesarias
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookRegistry {
    /**
     * Creamos la lista para registrar los libros
     */
    private final List<Book> registerBook;

    /**
     * Creamos el constructor para almacenar los libros en un ArrayList<>()
     */
    public BookRegistry() {
        this.registerBook = new ArrayList<>();
    }

    /**
     * Creamos el método addBook() del enunciado, cuidamos los parámetros de entrada
     */
    public void addBook(String titulo, String autor, String fechaPublic) {
        /** Constructor para el nuevo libro insertado */
        Book nuevoBook = new Book(titulo, autor, fechaPublic);
        /** Hacemos un add en la lista que hemos creado antes */
        registerBook.add(nuevoBook);
        /** Se puede poner un mensaje tras la inserción */
        System.out.println("El libro: " + nuevoBook + "\nSe ha añadido correctamente.");
    }


    /**
     * Creamos el método para buscar por título
     */
    public List<Book> searchByTitle(String titulo) {
        /** Creamos el arrayList para recorrerlo */
        List<Book> Libros = new ArrayList<>();
        /** foreach para buscar el libro */
        for (Book libro : registerBook) {
            /** Condicional para ver si el titulo coincide con la búsqueda */
            /** Debemos usar equals e ignoramos las May/Min  */
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                Libros.add(libro);
            }
        }
        return Libros;
    }
}

