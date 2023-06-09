package Tema_5.Actividad_4;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        /** Creamos el constructor para registrar libros **/
        BookRegistry registerBook = new BookRegistry();
        /** Añadimos nuevos libros con addBook() */
        registerBook.addBook("Las Tumbas de Atuan", "Ursula K. Le Guin", "1999-10-23");
        registerBook.addBook("Mestiza", " Maria Campbell", "1973");
        registerBook.addBook("La mujer de la falda violeta", "Natsuko Imamura", "2020-08-31");
        registerBook.addBook("El Ceniciento", "Anónimo", "desconocida");


        /** Buscamos libros con el método searchByTitle() */
        List<Book> searchBook = registerBook.searchByTitle("La Mujer de la Falda Violeta");

        /** Debemos poner esto para mostrar la búsqueda por pantalla */
        System.out.println("Libros coincidentes con la búsqueda: ");
        /** El nombre de la lista es searchBook, el nombre del índice es Libro */
        for (Book Libro:searchBook) {
            System.out.println(Libro);
        }


    }
}