package Tema_2.Actividad_2_5;
/** Programar en java el código para calcular si un año dado a través de una variable/constante es un año bisiesto o no,
 * mostrando este resultado en la consola.
 Un año es bisiesto en el calendario Gregoriano,
 si es
 divisible entre 4 AND no divisible entre 100, OR si es divisible entre 400. */
public class Anyo_Bisiesto {
    public static void main(String[] args) {
        /** Vamos a declarar la variable anyo de tipo Integer inicializada a 2023 */
        Integer anyo = 2012;
        /** Crearemos una estructura condicional para saber si el número coincide con los cálculos indicados*/
        if((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0)){  // AND --> && ; OR --> ||
            System.out.println("El año introducido es bisiesto");
        } else{
            System.out.println("El año introducido no es bisiesto");
        }

    }
}
