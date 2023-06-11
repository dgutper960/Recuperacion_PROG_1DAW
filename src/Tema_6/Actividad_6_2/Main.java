package Tema_6.Actividad_6_2;

/** Actividad_6.2 RECURSIVIDAD */

public class Main {
        public static void main(String[] args) {
            // Ej- 1
            System.out.println("Ejercicion1:\nCuenta atrás desde un número dado: ");
            numerosAtras(7);
            System.out.println("______________________________________________________");

            // Ej- 2
            System.out.println("Ejercicio 2:\nSuma de los números hasta n: ");
            System.out.println(sumaNumeros(8));
            System.out.println("______________________________________________________");

            // Ej- 3
            System.out.println("Ejercicio 3:\nSecuencia de Fibonnaci hasta el núm dado: ");
            System.out.println(sucesionFibonnaci(77));
            System.out.println("______________________________________________________");

            // Ej- 4
            System.out.println("Ejercicio 4:\nMáximo común divisor entre dos núm dados: ");
            System.out.println(maximoComunDivisor(12, 610));
            System.out.println("______________________________________________________");

        }

        /** Ejercicio 1.
         Crea una función que imprima los números naturales en orden inverso comenzando por el número n.  */
        private static void numerosAtras(int num){
            /* Si el número es mayor a 0 se imprime el numero */
            if (num > 0) {
                System.out.print(num + " ");
                /* Luego el método se llama a si mismo, pero como argumento se toma el num -1*/
                numerosAtras(num-1);
            } // Como vemos, esto se hace hasta que el número es 0
        }

        /** Ejercicio 2.
         Calcula la suma de los primeros n números naturales utilizando recursividad. */
        private static int sumaNumeros(int i) {
            if (i == 1) {
                return 1;
            } // Si el argumento es 1 o 0, se retorna ese número
            else if (i == 0){ // Si quitamos la condicional se produce una secuencia infinita
                return 0;
            } // si el argumento era otro número, se llama a la función y se suma pero restándole 1 al argumento inicial
            return i + sumaNumeros(i - 1);
        }

        /** Ejercicio 3.
         Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci. */
        private static int sucesionFibonnaci(int num){
            if ( num < 2){ // Si el argumeto es menor a 2 se retorna directamente
                return  num;// Los dos primeros ním de Fibonnaci son 0 y 1 (la suma de los dos anteriores)
            } // Sabiendo que la formula de Fibonnaci es F(n) = F(n-1) + F(n-2) hacemos lo siguiente:
            return sucesionFibonnaci(num - 2) + sucesionFibonnaci(num - 1);
        } // La función se llama a sí misma de modo que se ejecuta la fórmula

        /** Ejercicio 4.
         Crea un método que calcule el máximo común divisor (MCD) de dos números enteros
         (utilizando la división euclídea). */
        public static int maximoComunDivisor(int a, int b) {
            /* El MCD es el mayor número entero que divide a y b sin dejar un residuo */
            if (b == 0) return a; // Cualquier núm dividido entre 0 es % = 0
            return maximoComunDivisor(b, a % b);
        } /*  el MCD(a, b) es lo mismo que el MCD(a, a % b) */

}
