package Tema_4.practica_4;
/** Esta es la clase donde ejecutaremos nuestro código
 *  donde crearemos los diferentes objetos (círculos, cuadrados y triángulos)
 *  la primera geometría de cada tipo, deberá colorearse de azul */
public class Main {
    public static void main(String[] args) {
        /** Debemos tener en cuenta que los objetos que
         * vamosa crear (circulos, cuadrados y triángulos)
         * heredan de la Clase Geometría por lo que los constructores
         * tendrán la siguiente estructura o sintaxis:                  */

        Geometria circulo1 = new Circulo(12.45d);
        Geometria circulo2 = new Circulo(4.012d);

        Geometria cuadrado1 = new Cuadrado(34.2d);
        Geometria cuadrado2 = new Cuadrado(11.9524d);

        Geometria triangulo1 = new Triangulo(3.33d, 3.33d, 3.33d);
        Geometria triangulo2 = new Triangulo(23.84d, 45.979d,56.891d);
    }
}
