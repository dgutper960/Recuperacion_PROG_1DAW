package Tema_6.Examen_6.ejercicio_3;

public class Main {
    public static void main(String[] args) {
        /* Para este caso ES FUNDAMENTAL que el array esté ordenado */
        int[] array = {3,4,5,6,7,8,9,10,11,12};
        System.out.println("El número buscado está en el índice "+
                busquedaRecursiva(array, 6, 0, array.length - 1));

    }

    /** En los mismos parámetros de entrada ya vamos planteando el problema */
    static int busquedaRecursiva(int[] a, int numBuscado, int inicio, int fin) {
        if (inicio > fin) { /* En el caso base evitamos el bucle infinito */
            return -1;
        }

        int mitad = (inicio + fin) / 2;  // En la primera vuelta será (0+8=8)/2 = 4
        /** RECORDAMOS que los números están ordenados por lo que a[mitad] tiene sentido */
        if (a[mitad] == numBuscado) { // Si el número en la posición igual a mitad es == al buscado lo retornamos
            return mitad;
        } else if (numBuscado < a[mitad]) { // Si el numBuscado es menor es que está en la primera mitad
            return busquedaRecursiva(a, numBuscado, inicio, mitad - 1); // mitad -1 por empezar en 0
        } else { // Si es mayor es que está en la 2ª mitad
            return busquedaRecursiva(a, numBuscado, mitad + 1, fin); // mitad + 1 por haber despreciado la 1º parte
        }
    }
}
