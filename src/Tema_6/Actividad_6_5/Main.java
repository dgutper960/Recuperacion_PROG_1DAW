package Tema_6.Actividad_6_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Debemos tener SIEMPRE presente que una búsqueda binaria requiere de que los elementos estén ordenados*/
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        // Vamos a buscar el elemento diana
        int diana = 1;

        // Llamamos al método he inicializamos una variable int con su valor
        int SantoGrial= DyV(a,diana);

        // Imprimiremos donde se encuentra ese elemento (la posición)
        System.out.println("El elemento "+diana+" se encuentra en la posición "+SantoGrial);

    }

    private static int DyV(int[] array, int argumento){
        int pos = array.length/2; // Este entero será el resultado de dividir el array por la mitad
        if(argumento == array[pos]){ // Si el parámetro es igual al elemento en la posición pos del array, se devuelve pos como resultado
            return pos;
        } else if (argumento > array[pos]){ /*Si argumento es mayor que el elemento en la posición pos, se realiza una llamada recursiva
                                      pasando una copia del array desde la posición pos + 1 hasta el final del array*/
            return pos + 1 + DyV(Arrays.copyOfRange(array,pos+1, array.length),argumento); // pos+1 -> los indices empiezan en 0
        } else /* Si el argumento es menor que el elemento en la posición pos, se realiza una llamada recursiva
               esta vez copiamos la otra mitad del array (desde el principio hasta pos)*/
            return DyV(Arrays.copyOfRange(array,0,pos),argumento);
    } /* Observamos que en este método se usan los returns de else if y else como argumento de la llamada recursiva
          esto se hará hasta que se cumpla la condición del caso base if */
}
