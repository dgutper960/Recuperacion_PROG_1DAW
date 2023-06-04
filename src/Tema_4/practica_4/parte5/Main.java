package Tema_4.practica_4.parte5;
 /** Ejercicio 5
  Escribe el código de un programa que dado el contenido de un texto y una determinada palabra,
  realice búsquedas de la palabra dentro de él. La secuencia de ejecución será:
  crear un texto, crear una palabra, invocar al método con estos parámetros,
  buscar número de ocurrencias de la palabra en texto, obtener la salida del método
  y mostrar por pantalla el número de apariciones de la palabra. */
public class Main {
     public static void main(String[] args) {
         // variable texto para el String
         String texto = "El brillo de la luna es el brillo que refleja el brillo de la orilla, que brillo aquel que brilla el que brilla cual brillo de tus ojos que en mi alma tanto brillo inspira. ";
         // Variable palabra que contaremos las veces que se repite
         String palabra = "brillo";
         // Variable que será inicializada con el resultado del método buscarPalabra()
         int numOcurrencias = buscarPalabra(texto, palabra);

         System.out.println("La palabra '" + palabra + "' aparece " + numOcurrencias + " veces en el texto.");
     }

     /**  Creamos el metodo buscarPalabras() con texto y palabra como parametros de entrada **/
     public static int buscarPalabra(String texto, String palabra) {

         int numRepeticiones = 0;
        /** Declaramos el array Sring[] palabras haciendo que la función split(" ")
         * separe las palabras cada vez que encuentre un espacio  */
         String[] palabras = texto.split(" ");
         /** Recorremos el String[] palabras y lo comparamos cada posición con la variable palabras con equals
          * OJO que si lo hiciéramos con == compararía las posiciones de memoria
          * cuando el resultado coincida, aumentamos +1 el contador numRepeticiones */
         for (String i : palabras) { /** */
             if (i.equals(palabra)) {
                 numRepeticiones++; /** El resultado final será nuestro return */
             }
         }
         return numRepeticiones;

     }
}
