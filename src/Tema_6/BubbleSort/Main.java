package Tema_6.BubbleSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /** Vamos a ordenar un Array con el método Bubble Sort */
        /* Creamos el Array desordenado */
        int[] arr = {5, 3, 7, 2, 4, 1};
        int n = arr.length;


        bubbleSort(arr);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));

        bubbleSortRecursive(arr, n);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }

    /**
     * Ese método resuelve el algoritmo con iteración
     * */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no se realizó ningún intercambio en la iteración, significa que el arreglo ya está ordenado.
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Para resolver el mismo problema con recursividad
     */
    public static void bubbleSortRecursive(int[] arr, int n) {
        if (n < 2) {
            return;
        }

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no se realizó ningún intercambio en la iteración, significa que el arreglo ya está ordenado.
            if (!swapped) {
                break;
            }
        }

        bubbleSortRecursive(arr, n - 1);
    }



}
