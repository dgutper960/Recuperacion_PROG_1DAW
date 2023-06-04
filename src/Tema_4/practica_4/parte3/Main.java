package Tema_4.practica_4.parte3;
/** Ejercicio 3
 Construye un programa que genere 100 números aleatorios mediante el uso de la función Math.random
 y que posteriormente ofrezca al usuario la posibilidad de:
 • Conocer el mayor de los números.
 • Conocer el menor de los números.
 • Obtener la suma de todos los números.
 • Obtener la media de los números.
 • Sustituir el valor de un elemento por otro número dado. */
//TODO PARA ESTE EJERCICIO HAY QUE IMPORTAR LAS CLASES Arrays y Random del paquete java.utils
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /** Declaramos un array de tipo int inicializado mediante la llamada al método arrayNumAleatorios()
         * En el parametro de entrada de la llamada hemos puesto 100  */
        int[] arrayNumAleatorios = arrayNumAleatorios(100);
        System.out.println(Arrays.toString(arrayNumAleatorios));

        System.out.println("El mayor de los números del array es: " + (numMayor(arrayNumAleatorios)));
        System.out.println("El menos de los números del array es: " + (numMenor(arrayNumAleatorios)));
        System.out.println("La suma de los números del array es: " + sumarNumeros(arrayNumAleatorios));
        System.out.println("La media de los números del array es: " + mediaNumeros(arrayNumAleatorios));
        sutituirValor(arrayNumAleatorios, 13, 2810);
    }


    /** Creamos un método privado para rellenar el array de numeros aleatorios entre 0 y 999 (inclusive)  */
    private static int[] arrayNumAleatorios (int longitud){ // Toma como valor de entrada el valor que hemos puesto en la llamada
        Random random = new Random(); /** Constructor para el array de longitud especificada */
        int[] arrayAleatorio = new int[longitud];
    /** Este bucle for en cada iteración inicializa al valor aleatorio 0-1000 con random.nexInt(1000)*/
        for(int i = 0; i < 100; i++){ // Estado inicial 0; mientras i menor a 100; incremento +1
            arrayAleatorio[i] = random.nextInt(1000);// La posición [i] se inicializa mediante el método random.next.Int()
        }
        return arrayAleatorio; // El retorno del método
    }

    /** Conocer el mayor de los números.  */
    private static int numMayor(int[] arrayAleatorio){ // Parámetro de entrada el return del método arrayNumAleatorios()
        int mayor = 0; // Declaramos la variable que usaremos en el return
        /** bucle for con número de iteraciones 0 longitud del array **/
        for (int i = 0; i < arrayAleatorio.length; i++){
            if (arrayAleatorio[i] > mayor ){
                /** Si el contenido en la posición [i] es mayor a la variable mayor, está se inicializa a ese valor */
                mayor = arrayAleatorio[i];
            }
        }
        /** En este momento del código la variable mayor estará inicializada al número más grande del array */
        return mayor;
    }


    /** Conocer el mayor de los números. */
    private static int numMenor(int[] arrayAleatorio){
        int menor = 1000;
        for (int i = 0; i < arrayAleatorio.length; i++){
            if (arrayAleatorio[i] < menor ){
                menor = arrayAleatorio[i];
            }
        }
        return menor;
    } /** El procedimiento es igual que en numMayor() pero cambiando la condicion del if a < y el valor de la variable a 1000 (999) */


    /** Obtener la suma de todos los números */
    private static int sumarNumeros (int[] arrayAleatorio){
        int suma = 0;
        for(int i = 0; i < 100; i++){
            suma += arrayAleatorio[i];
        }
        return  suma;
    } /** Procedimiento muy similar, la diferencia es que no hay condicional if
     y en vez de machacar el valor anterior de la variable de retorno, el valor de [i] se suma a lo que haya **/

    /** Obtener la media de los números  */
    private static int mediaNumeros (int[] arrayAleatorio){
        int suma = 0;
        for(int i = 0; i < 100; i++){
            suma += arrayAleatorio[i];
        }
        int media = (suma / 100);
        return  media;
    } /** Al procedimiento anterior se le añade una variable 'media' que será la de retorno
     y que se inicializa con el valor de la suma dividido entre 100 */

    /** Sustituir el valor de un elemento por otro número dado  */
    private static void sutituirValor(int [] arrayAleatorio, int pos, int numNuevo){
        System.out.print("El valor en la posición " + pos + " antes del cambio es " + arrayAleatorio[pos] + " | ");
        arrayAleatorio[pos] = numNuevo;
        System.out.println(" El valor en la posición " + pos + " después del cambio es " + arrayAleatorio[pos]);
    } /** Los valores de los parámetros de entrada, son inicializados en la llamada  */
}


