package Tema_4.practica_4.parte2;

/**Ejercicio 2

 Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto
 que se le pasa por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas. */

public class ContarPalabras {
    public static void main(String[] args) {
        String texto1 = "¿Que pasa chaval? Cuando termite to esto nos vamos a tener que meter un homenaje de los buenos";
        String texto2 = "eh?";

        System.out.println("En este texto hay : " + contarPalabrasDif(texto1)+" palabras diferentes");
    }

    /** Tomamos como parámetro de entrada el texto1 */
    private static int contarPalabrasDif(String texto1) {
    /* Primero vamos a eliminar las mayúsculas del texto con toLowerCase() */
        texto1 = texto1.toLowerCase();
        /* Con split() dividimos las palabras al detectar los espacios
         * y las vamos almacenando en el array textoEntero de tipo String */
        String[] textoEntero = texto1.split(" ");
        /* Se crea otro array String con la misma longitud que el anterior llamado palabrasDif*/
        String[] palabrasDif = new String[textoEntero.length]; // Este array esta vacío, solo tenemos la longitud

        int contDistintas = 0; /* Será nuestro return; sumaremos 1 cuando se hallen palabras distintas */
        /* Bucle foreach para recorrer todas las palabras */
        for (String palabra : textoEntero) {
            if (!arrayContieneCadena(palabrasDif, contDistintas, palabra)) {
                palabrasDif[contDistintas] = palabra;
                contDistintas++;
            }
            /* Se usa el método arrayContieneCadena() cada vez que encuentra una cadena repetida
             * se suma 1 al contador. Se utiliza '!' para negar el resultado de la expresión booleana.
             * Se está negando el valor devuelto por el método arrayContieneCadena,
             * que devuelve true si la cadena ya existe en el array y false si no existe.*/
        }
        return contDistintas;
    }

    /** En cada iteración se llama a este metodo: */
    private static boolean arrayContieneCadena(String[] array, int longitudActualArray, String cadena) {
        boolean encontrada = false;
        for (int i = 0; i < longitudActualArray; i++) {
            if (array[i].equals(cadena)) {
                encontrada = true;
                break;
            }
        }
        return encontrada;
    } /** El método utiliza un bucle for
     Si encuentra la cadena en el array, la variable 'encntrada' -> true y sale del bucle con break.
     Si no encuentra la cadena, la variable encontrada permanece en false.
     Finalmente, el método devuelve el valor de encontrada. */
}
