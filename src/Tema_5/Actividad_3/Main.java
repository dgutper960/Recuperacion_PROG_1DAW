package Tema_5.Actividad_3;

/** Dado un array de números enteros, escriba un programa en Java que use un objeto Map
 * para contar el número de veces que cada número aparece en el array.
 * El programa debe imprimir los resultados en orden ascendente según el valor del número. */


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /** Creamos el array con números repartidos */
        Integer[] numeros = {2, 6, 2, 4, 5, 9, 6, 2, 1, 5, 2, 7, 7, 5, 4};

        /**  Llamada al método que toma como parámetro el array creado */
        numerosRepedidosAsc(numeros);

    }
    /** la interfaz Map en Javautiliza un árbol equilibrado para almacenar los elementos de manera ordenada
     * Esto significa que los elementos en el mapa se almacenan en orden ascendente de sus claves. **/


    /** Crearemos el método numerosRepetidosAsc **/
    private static void numerosRepedidosAsc(Integer[] numeros){
        /** Creamos un Map de claves Integer y Valores Integer, se llama mapaContador y es de tipo TreeMap */
        Map<Integer, Integer> mapaContador = new TreeMap<Integer, Integer>();

        /** For para recorrer el array*/
        for (int i = 0; i < numeros.length; i++)
        {
            /** Inicializamos variable key con el valor del índice en cada iteración */
            int key = numeros[i];
            /** Comprobamos que la clave se encuentre en el mapa */
            if (mapaContador.containsKey(key))
            {
                /** Creamos un contador */
                int contador = mapaContador.get(key);
                /** Incrementamos el valor de contador con cada iteración */
                contador++;
                /** Se guarda en valor de la clave con el valor de la variable key en ese momento
                 * se guarda el valor del valor con el valor de la variable contador en ese momento */
                mapaContador.put(key, contador);
            }   /** Si la clave no se encuentra en el mapa, inicializamos el valor de esa clave a 1 */
            else
            {
                mapaContador.put(key, 1);
            }
        }
        /** Usamos un iterator para mostrar el número de veces que cada número está  */
        Iterator<Integer> itElementos = mapaContador.keySet().iterator();
        /** Mientras haya más elementos en el mapa */
        while(itElementos.hasNext()){
            /** Se declara key al valor del elemento **/
            Integer key = itElementos.next();
            /** Se imprime por consola el resultado */
            System.out.print("El número " + key + " está " + mapaContador.get(key) + " vez/ces \n");
        }
    }
}