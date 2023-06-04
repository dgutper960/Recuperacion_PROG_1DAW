package Tema_4.practica_4.parte4;

/** Ejercicio 4

 Implementa un programa que reciba un DNI y responda si se trata de un DNI válido.
 El cálculo de la letra correspondiente a los dígitos se realiza mediante el algoritmo descrito en
 https://www.interior.gob.es/opencms/ca/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/

 Utiliza expresiones regulares. */

public class Main {
    public static void main(String[] args) {
        String dni = "27896536F"; /** Creamos una variable de tipo String que contendrá el DNI  */
        validarDNI(dni); // Llamada al método validarDNI()
    } // Esta llave cierra el main

    /** Este método va a validar el DNI mediante un if que en su condición va a llamar a otros métodos
     * los cuales se definen más abajo **/
    private static void validarDNI(String dni) {
        if (dni.length() == 9 && Character.isLetter(dni.charAt(8)) == true && formatoCorrecto(dni) == true && letraCorrecta(dni) == true) {
            System.out.println("El DNI es válido"); /** Si se cumplen todas las condiciones de arriba, el DNI será válido */
        }
        else System.out.println("El DNI no es válido"); /** Si no, será inválido */
    }

    /** Se Comprobará que los 8 primeros caracteres del DNI no sean letras*/
    private static boolean formatoCorrecto(String dni) { /** Método privado con retorno booleano */
        /** Se recorre el String comprobando que los 8 primeros valores no son letras mediante Character.isLetter() */
        for (int i = 0; i < dni.length() - 1; i++) {
            if (Character.isLetter(dni.charAt(i))){
                return false; /** Si encuentra un letra devuelve false */
            }
        }
        return true; /** Si no hay letras se devuelve true **/
    }

    /** Para este método necesitamos saber que para hallar la letra en un DNI válido,
     * se divide el número entre 23 y el resto se sustituye por una letra que se determina mediante una tabla en la web*/
    private static boolean letraCorrecta(String dni){ // Ponemos el DNI como parámetro de entrada
        /** Para obtener la parte numérica del DNI, vamos a extraer los primeros 8 caracteres del String con el método substring()
         * pero previamente necesitamos convertir el String a Int con el método Integer.parseInt() */
        int soloIntDNI = Integer.parseInt(dni.substring(0,8));
        /** Creamos un array tipo Character que contenga por orden todas las letras que se definen en la tabla de la web */
        Character[] letrasValidas = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        /** Inicializamos una variable con el valor del resto de soloIntDNI entre 23  */
        int resto = soloIntDNI % 23;
        /** La variable "letraCorrecta" de tipo Character que será igual a la letra en la posición del array del resto */
        Character letraCorrecta = letrasValidas[resto];
        /** If compara la letra en la última posición del DNI introducido es la misma que la de la variable "letraCorrecta" */
        if(dni.charAt(8) == letraCorrecta) {
            return true; /** Si la condición se cumple se retorna true*/
        }
        else return false; /** Si la condición no se cumple, se retorna false */
    }
}
