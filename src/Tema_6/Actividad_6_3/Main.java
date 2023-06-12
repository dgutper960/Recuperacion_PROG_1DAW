package Tema_6.Actividad_6_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /**
         * Ejercicio 1
         * Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande.
         * */
        // Creamos un array de números
        int[] numeros = {49,91,3,27,89,11};

        // Creamos un conjunto de números del tipo HashSet
        Set<Integer> numConjunto = new HashSet<>();
        numConjunto.add(27);
        numConjunto.add(91);
        numConjunto.add(6);
        numConjunto.add(51);
        numConjunto.add(15);
        numConjunto.add(60);
        numConjunto.add(7);

        // Llamamos al método definido con el conjunto como argumento
        numMayor(numConjunto);
        numeroMayor(numeros);

    }

    // Creamos el método para obtener el número más grande del conjunto */
        private static void numMayor(Set<Integer> num){
        Integer mayor = 0;
        for (Integer e : num) {
            if(e > mayor){
                mayor = e;
            }
        }
        System.out.println("El número más grande es "+mayor);
    }

    /* Creamos el método para obtener el núm mayor del array
    * Lo hacemos con un for normal para ver mejor los pasos */
    private static void numeroMayor(int[] num){
        int mayor = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > mayor){
                mayor = num[i];
            }
        }
        System.out.println("El número más grande es " + mayor);
    }

    /** Ejercicio 2
     A continuación, analiza la complejidad del algoritmo anterior utilizando la notación big-O. */

    /* El método itera sobre todos los elementos del conjunto utilizando un bucle for o foreach (en este caso da igual).
    En cada iteración, se realiza una comparación para determinar si el elemento en el índice es mayor al valor de la variable 'mayor'.
    Si es así, se actualiza el valor de la variable.

    Se entiende que la complejidad en notación big-O es de tipo Lineal 'O(n)', ya que solo tiene un bucle y una constante  */

    /** Ejercicio 3
     ¿Crees que influye la cantidad de números del conjunto en el tiempo que tardará tu
     algoritmo en resolver el problema? ¿Podrías indicar cuál es el caso más favorable y el peor
     caso?  */

    /*  El número de iteraciones es igual al número de elementos en el conjunto o array,
    lo que significa que el tiempo de ejecución del método es proporcional al tamaño del array o conjunto.

     En este caso vamos a necesitar la misma cantidad de iteraciones en cualquier caso, ya que siempre vamos a
     tener que recorrer el conjunto en su totalidad.
     Caso distinto sería que buscásemos un número dado en el conjunto, en ese caso si podríamos hablar de en el mejor
     y peor de los casos, ya que, el número podría aparecer en cualquier momento y el programa terminar en ese momento */

}