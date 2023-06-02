package Tema_3.Ejercicio_3_1_Composicion_Herencia;
/** Vamos a programar una calculadora que realice las 4 operaciones más básicas: suma, resta, multiplicación y división.
 Cada operación será un método distinto.
 -> Crea una clase llamada Main con un método main y dos campos que sean dos constantes para los operandos:
    A y B. Dales un valor cualquiera.
 -> Crea una clase CalculadoraBasica y dentro de ella un método para cada operación
 -> Prueba cada uno de los métodos invocándolos desde el main.
 Después vamos a hacer una constante donde se seleccione la operación a realizar.
 Por ejemplo, si digo que la operación es suma, que realice la suma sólamente. */
public class CalculadoraBasica {
    int suma;
    int resta;
    int multi;
    int div;

    static int suma(int a, int b){
        return a+b;
    }

    static int resta(int a, int b){

        return a-b;
    }

    static int multi(int a , int b){

        return a*b;
    }

    static int div(int a, int b){

        return a/b;
    }
}










