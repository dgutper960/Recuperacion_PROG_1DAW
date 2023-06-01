package Tema_2.EjerciciosVarios;

public class Ejercicios {
    public static void main(String[] args) {
        ejercicio_1(42, 57,89);
        ejercicio_2(5.32f);
        ejercicio_3(5);

    }

    static void ejercicio_1(int a, int b, int c){
        /** Ejercicio 1.
         Realiza el algoritmo que calcule la media de 3 números enteros */
        int suma = a + b + c;
        int media = suma / 3;
        System.out.println("La media es "+media+"\nMuchas gracias!!");
    }

    static void ejercicio_2(float lado){
        /** Calcula el área de un cuadrado de lado dado por una variable.
         Ej. lado = 3 → area = 9 */
        float area = lado * lado;
    }

    static void ejercicio_3(int num){
        /** Calcula la media de todos los números pares hasta el un número n dado.
         Ej: n = 5 → media = 6 (ya que los 5 primeros pares serían: 2, 4, 6, 8, 10) */
        int cont = 0;


    }
}
