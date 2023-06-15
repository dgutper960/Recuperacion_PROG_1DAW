package Tema_6.Examen_6.ej_3y4;
//TODO ENUCIADO 3
/** Implementa un algoritmo que busque un número en un array.
 * Deberá realizarse utilizando la estrategia de divide y vencerás por recursión
 * Se partirá de un array ordenadopor ejemplo: {1, 3, 5, 7, 8, 9} */

//TODO ENUNCIADO 4
    /**Se trata de crear una excepción personalizada para controlar los casos en los que los algoritmos
     * de búsqueda anteriormente implementados, no encuentren el elemento buscado.
     Para ello, además de crear la clase de la excepción, de nombre ElementNotFoundException,
     deberás modificar el código en cualquiera de las búsquedas
     (búsqueda secuencial o binaria)
     para que en el caso de no encontrar el elemento buscado, se lance la citada excepción con el mensaje
     “Elemento no encontrado”.
     Para terminar, habrá que propagar esta excepción desde el método de búsqueda y capturarla en el método main
     que invoque la búsqueda. De modo que cuando el elemento se encuentre muestre: “Elemento encontrado en la posición: X”,
     donde X es la posición del elemento en el array.
     Mientras que si no se encuentra, se mostrará sólamente el mensaje de la excepción.*/

public class Main {
    public static void main(String[] args) throws ElementNotFoundException {
        /* Creamos el Array ordenado */
        int[] aOrdenado = {3, 4, 5, 6, 7, 8, 9};

        /** Para hacer la parte 4 del ejercicio
         * debemos crear una clase Excepcion llamada ElementNotFoundException
         * que herede de Excepcion */

        /* Vamos a llamar al método busRecursiva() dentro del bloque try */
        busRecursiva(aOrdenado, 2, 0, aOrdenado.length - 1);

    }

    /* Creamos el método (estático) recursivo para buscar el número */
    static int busRecursiva(int[] array, int numBuscado, int inicio, int fin) throws ElementNotFoundException {
        /* Creamos el caso base */
        if (inicio > fin) { // En este caso no se habrá encontrado el número
            //return -1; Donde va el return ponemos que se lance la Excepcion Personalizada
            try {
                throw new ElementNotFoundException("Elemento no encontrado");
            } catch (ElementNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        /* Creamos la condición para que el bucle termine */
        int mitad = (inicio + fin) / 2;
        if (array[mitad] == numBuscado) {
            return mitad; /* Entramos en el caso recursivo*/
        } else if (numBuscado < array[mitad]) {
            return busRecursiva(array, numBuscado, inicio, mitad - 1);
        } else
            return busRecursiva(array, numBuscado, mitad + 1, fin);
    }
}
