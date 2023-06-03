package Tema_4.practica_4;

/** Esta clase es Abstracta, lo que significa que no se puede instanciar por sí sola,
 * en otras palabras, se usa como una especie de plantilla */

abstract class Geometria {  // Valor de privacidad sin especificar

    double area;

    double perimetro;
/** Como esta clase es Abstracta los métodos iran sin cuerpo y los campos sin inicializar */
    abstract double calcularArea();

    abstract double calcularPerimetro();
}
