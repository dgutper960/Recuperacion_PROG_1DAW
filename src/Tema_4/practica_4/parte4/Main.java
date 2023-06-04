package Tema_4.practica_4.parte4;

/** Implementa un programa que reciba un DNI y responda si se trata de un DNI válido.
 * El cálculo de la letra correspondiente a los dígitos se realiza mediante el algoritmo descrito en
 * https://www.interior.gob.es/opencms/ca/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/

    Utiliza expresiones regulares.  */

public class Main {
    public static void main(String[] args) {
        /** Se crea e String DNI y se inicializa*/
        String dni = "27896356J";

        /** Condicional que llama al método validarDNI() implementada más abajo*/
        if (validarDNI(dni)) { // Si la función devuelve true se imprime que es válido
            System.out.println("El DNI es válido.");
        } else { // Si no se imprime que noi es válido
            System.out.println("El DNI no es válido.");
        }
    }

    /** Método que devuelve booleano */
    public static boolean validarDNI(String dni) {
        /** Se inicializa un variable con el patron correspondiente:
         * (cadena que contiene 8 dígitos seguidos de una letra).
         * Si el DNI no coincide con el patrón, la función devuelve false */
        String patron = "\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]";
        if (!dni.matches(patron)) {
            return false;
        }
        int numero = Integer.parseInt(dni.substring(0, 8));
        /** Se extrae el número de la cadena con sunstring(0, 8) que previamente se ha pasado a int con parseInt()
         * y se almacena en la variable 'número'*/
        char letraCalculada = calcularLetraDNI(numero);
        /** Se introduce la variable de antes como parámetro de entrada de la función calcularLetraDNI() definido abajo */
        char letraDNI = dni.charAt(8);
        /** La función dni.charAt(8) extrae la letra de dni sabiendo que está en la posición 8 (el 0 es inclusivo)*/
        return letraCalculada == letraDNI; /** Finalmente, se comparan los valores de las variables como return **/
    }
    /** Este es el método para calcular la letra del DNI, ya que toma como parámetro el número solo y lo divide entre 23
     * para comprobar si el resto coincide con lo estipulado en la página web */
    public static char calcularLetraDNI(int numero) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE"; // Las letras están en el orden proporcionado en la tabla de la web
        int indice = numero % 23;
        return caracteres.charAt(indice);
    } /** Se utiliza el método charAt() de la cadena caracteres para obtener el carácter en la posición índice.
     De esta manera, la función calcularLetraDNI devuelve la letra correspondiente al DNI basándose en el número proporcionado. */
}
