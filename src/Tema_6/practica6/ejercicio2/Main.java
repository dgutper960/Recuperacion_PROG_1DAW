package Tema_6.practica6.ejercicio2;

/** El juego de las torres de Hanoi es un rompecabezas que esencialmente consiste en mover
 un conjunto de discos, de tamaño decreciente y apilados en orden, de una torre a otra,
 utilizando una tercera torre como ayuda, siguiendo las siguientes reglas:
 - Solo se puede mover un disco a la vez.
 - Un disco solo se puede mover si está en la parte superior de una torre.
 - Un disco solo se puede mover a una torre vacía o a la parte superior de otra torre, si
 y solo si su tamaño es menor que el disco en la parte superior de esa torre.
 El objetivo del juego es mover todos los discos a la tercera torre en el mismo orden en que
 estaban en la primera torre. */

public class Main {
    public static void main(String[] args) {
        /* Creamos una variable que contendrá el número de discos */
        int numDiscos = 3;
        moverDiscos(3,0,2);

        hanoi(3, 'A', 'C', 'B');

    }

   /* Método para resolver el problema 'Torre de Hanoi'
   * como argumentos tenemos numDiscos, torreOrigen y torreDestino
   * Se debe utilizar un enfoque recursivo para mover los discos de una torre a otra*/
   public static void moverDiscos(int numDiscos, int torreOrigen, int torreDestino) {
       // si numDiscos = 1 se imprime el mensage
       if (numDiscos == 1) {
           System.out.println("Mover disco 1 desde " + torreOrigen + " a " + torreDestino);
       } else { // Si no la función se llama a sí misma (-1), y actualiza la torreDestino a 2 (auxiliar)
           moverDiscos(numDiscos - 1, torreOrigen, 2);
           // Se imprime el mensaje de que se está moviendo el disco del origen al auxiliar
           System.out.println("Mover disco " + (numDiscos - 1) + " desde " + torreOrigen + " a " + torreDestino);
           // Se llama a la función con la torre de destino actualizada a la torre auxiliar
           moverDiscos(1, torreDestino, torreDestino);
           // Se imprime el correspondiente mensaje
           System.out.println("Mover disco 1 desde " + torreOrigen + " a " + torreDestino);
       }

       //TODO Ejercicio 3

//    public static void resolverHanoi(int n, String primeraTorre, String segundaTorre, String terceraTorre) {
//        if (n == 1) {                                                                                             O(n)
//            System.out.println("Mover el disco 1 de la " + primeraTorre + " a la " + segundaTorre);               O(n)
//            return;                                                                                               O(n)
//        }
//        resolverHanoi(n - 1, primeraTorre, terceraTorre, segundaTorre);                                           O(1^n)
//        System.out.println("Mover el disco " + n + " de la " + primeraTorre + " a la " + segundaTorre);           O(n)
//        resolverHanoi(n - 1, terceraTorre, segundaTorre, primeraTorre);                                           O(1^n)
//    }

//      3 O(n) + 2 O(1^n) =  O(n) + O(2^n) = O(2^n)
//      Por lo tanto la complejidad de esta algoritmo en notación Big O es de O(2^n)

   }

   /* Creamos un método para resolver la torre de Hanoi
   * necesitamos argumentos para el num de discos, origen, destino y auxiliar*/
    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 0) {  // Si num de discos es cero salimos del programa
            System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
            return;
        }

        hanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, destino, origen);
    }


}