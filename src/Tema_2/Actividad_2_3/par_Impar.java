package Tema_2.Actividad_2_3;
/** Dado un número (p.ej. num=13), mostrar por la consola un mensaje que indique
 * si este número es par o impar según el caso. */
public class par_Impar {
    public static void main(String[] args) { // Método main
        Integer num = 13; // Declaramos variable de tipo envoltorio Integer y la inicializamos a valor '13'
        /** Vamos a usar una condicional if-else  */
        if( num % 2 == 0) { // Si el resto de num es 0, se imprime "El número es par"
            System.out.println("El número es par");
        } else { // Si no, se imprime el número es impar
            System.out.println("EL numero es impar");
        }
    }
}
