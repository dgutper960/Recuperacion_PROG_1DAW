package Tema_2.PruebaExamen_1;

/** Calcula el primer y último número primo entre dos números dados (inclusives).
 Ej: a = 20, b = 30 → primerPrimo = 23, ultimoPrimo = 29
 Ej: a = 17, b = 29 → primerPrimo = 17, ultimoPrimo = 29 */

public class Ejercicio_2 {
    public static void main(String[] args) {
        /** Inicializamos a=20 y b=30 */
                int a = 20, b = 30;
        /** Declaramos variables para 1er y último primo */
                int primerPrimo = 0, ultimoPrimo = 0;

                /** Creamos un bucle for */
                for (int i = a; i <= b; i++) {  // Se inicializa i al valor de a y mientras sea < b, incremento +1
                    boolean esPrimo = true; // cada vez que se termine el bucle, la variable vuelve a true, porque así lo necesito
                    for (int j = 2; j <= Math.sqrt(i); j++) {  // se inicializa j a 2 y mientras sea menor a la raiz cuadrada de i
                        if (i % j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    /** cuando termine el 2º bucle se comprueba */
                    if (esPrimo) {
                        if (primerPrimo == 0) {
                            primerPrimo = i;
                        }
                        ultimoPrimo = i;
                    }
                }

                System.out.println("El primer número primo es: " + primerPrimo);
                System.out.println("El último número primo es: " + ultimoPrimo);

    }
}


 //  --> El primer primo a partir de un num dado n

// --> El ultimo primo hasta el num dado n

// ---> Todos los num primos entre n y  m

// -> Luego unificar ambos