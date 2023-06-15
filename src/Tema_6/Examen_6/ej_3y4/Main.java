package Tema_6.Examen_6.ej_3y4;

/** Implementa un algoritmo que busque un número en un array.
 * Deberá realizarse utilizando la estrategia de divide y vencerás por recursión
 * Se partirá de un array ordenadopor ejemplo: {1, 3, 5, 7, 8, 9} */

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
