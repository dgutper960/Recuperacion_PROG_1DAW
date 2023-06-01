package Tema_2.PruebaExamen_1;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Integer a = 4;
        metodo1( a, 709, 14);

    }

    static void metodo1(Integer a, Integer b,Integer c) {

        /** Ejercicio 1
     Muestra por la consola el mayor de los tres números dados por 3 variables. */
        // Declaramos los números
    Integer mayor; // Declaramos variable para almacenar el mayor
    /** Para este ejercicio podemos usar el método max de la clase Math
     *  inicializaremos la variable mayor con lo que nos devuelva el método max */
    mayor = Math.max(Math.max(a, b), c); // Observamos la sintaxis
    /** 1º Extraemos el mayor entre a y b
     *  2º Comparamos lo que extrae la primera consulta con la variable c */

    /** Sin usar la clase Math podríamos usar una estructura condicional */

    if (a > b) {
        if (a > c) {
            mayor = a;
        } else {
            mayor = c;
        }
    } else {
        if (b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
    }

                System.out.println("El mayor de los tres números es: " + mayor);
    }
}
