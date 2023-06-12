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

        hanoi(3, 'A', 'C', 'B');

    }

    //TODO Ejercicio 3

   /* Creamos un método para resolver la torre de Hanoi
   * necesitamos argumentos para el núm de discos, origen, destino y auxiliar*/
    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 0) {  // Si num de discos es cero salimos del programa
            System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
            return;
        }
        /* Se resuelve el problema de forma recursiva, ya que se llama al método
        * en dos momentos diferentes */
        hanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, destino, origen);
    }

    /** En este método tenemos:
     * if ----------------> 0(n)
     * print -------------> 0(n)
     * return ------------> 0(n)
     * llamada recursiva -> 0(1^n)
     * print -------------> 0(n)
     * llamada recursiva -> 0(1^n)
     *
     * por lo que tenemos un total de 0(n)*3 + 0(1^n)*2
     * Lo que teniendo en cuenta que los órdenes lineales son despreciables frente a los factoriales,
     * vamos a tener un orden de complejidad exponencial de O(2^n)
     * subiendo la complejidad en demasía a medida que suben los datos de entrada */

}