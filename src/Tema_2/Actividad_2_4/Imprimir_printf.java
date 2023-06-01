package Tema_2.Actividad_2_4;
/** Imprimir por consola utilizando printf lo siguiente:
 Hola
 Hola <tu nombre>
 Hola, me llamo <tu nombre> y tengo <tu edad> años
 Nombre: <tu nombre>
 Edad: <tu edad>
 "Primero\Segundo\Tercero"
 3/2 = 1.5
 Donde <tu nombre> <tu edad> y los valores numéricos serían parámetros. */

public class Imprimir_printf {
    public static void main(String[] args) {
        String nombre = "David";
        int edad = 38;

        // Hola
        System.out.printf("Hola%n");

        // Hola <tu nombre>
        System.out.printf("Hola %s%n", nombre);

        // Hola, me llamo <tu nombre> y tengo <tu edad> años
        System.out.printf("Hola, me llamo %s y tengo %d años%n", nombre, edad);

        // Nombre: <tu nombre>
        // Edad: <tu edad>
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d%n", edad);

        // "Primero\Segundo\Tercero"
        System.out.printf("\"Primero\\Segundo\\Tercero\"%n");

        // 3/2 = 1.5
        System.out.printf("3/2 = %.1f", 3.0/2.0);

        /**
         *     %n --> para imprimir un salto de línea.
         *     %s --> para imprimir una cadena de texto.
         *     %d --> para imprimir un número entero.
         *     %f --> para imprimir un número decimal.
         *     \" --> para imprimir el caracter ".
         *     \\ --> para imprimir el caracter \.
         *
         * En el último ejemplo, se utiliza %.1f para imprimir un número decimal con un decimal de precisión.
         * Esto se puede cambiar para imprimir más o menos decimales según se necesite.*/

    }
}
