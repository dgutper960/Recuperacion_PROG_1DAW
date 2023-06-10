package Tema_6.Actividad_6_1;

/** Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:

 Recibe como parámetros una cadena (String) y un entero (int);
 Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length(): int” de la clase “String”)
 devuelve el carácter en la posición correspondiente (puedes hacer uso del método “charAt(int)” de la clase “String”).
 En caso contrario, construye y lanza una excepción de tipo “Exception”.  */

public class Main {
    public static void main(String[] args) {

    /* Bloque try-catch para manejar excepciones
    * Bloque try, si se encuentra una excepción esta pasará al bloque catch para ser manejada */
        try{
            // Se hacen diferentes llamadas al método caracterEn()
            System.out.println(caracterEn("Alemania", 2));
            System.out.println(caracterEn("Romanticismo", 7));
            System.out.println(caracterEn("Tango", 1));
            System.out.println(caracterEn("Dinamarca", 11));
        }
        /* Bloque catch nos mostrará el mensaje de la excepción */
        catch (Exception iae){
            System.out.println(iae.getMessage());
        }
    }

    /* Método para mostrar el caracter como valor en el índice deseado
    * En la declaración del método se ha definido, "throws IllegalArgumentException{"
    * para indicar que si se encuentra un error debido a un argumento no válido,
    * se lanzará una excepción de ese tipo */

    private static char caracterEn(String palabra, int posicion) throws IllegalArgumentException{
        /* Si el parámetro posición es menos a 0 or mayor a la longitud de la palabra */
        if (posicion < 0 || posicion >= palabra.length())
        { /* Llamamos al método de error y Nos muestra por pantalla lo siguiente */
            throw new IllegalArgumentException("ERROR!! Valor de índice incorrecto") ;
        } /* S no, extraemos el caracter de la posición indicada */
        else return palabra.charAt(posicion);
    }
}
