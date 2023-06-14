package Tema_6.Examen_6.ejercicio_1;

/** Realiza un algoritmo llamado busquedaSecuencial
 que busque el número indicado como argumento en un array de enteros desordenado
 también pasado como parámetro y devuelva el índice donde se sitúa este número en el array.
 En caso de que no se encuentre deberá devolver -1. */

public class Main {
    public static void main(String[] args) {

        int[] array = {23,4,56,71,3,0,45,50,15};
        System.out.println("El numero buscado está en el indice "+busquedaSecuencial(array,45));
    }

    static int busquedaSecuencial(int[] a, int numBuscado){
        int indice = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == numBuscado){
                indice = i;
                return indice;
            }else indice = -1;
        }
        return indice;
    }

}
