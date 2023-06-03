package Tema_4.practica_4.parte1;
/** Esta clase hereda de Geometria e implementa de Coloreable,
 * ello implica que debemos implementar obligatoriamente los métodos que estén
 * definidos en cada una de esas dos clases (Geometría y Coloreable) */

public class Circulo extends Geometria implements Coloreable{

    // Se declara la variable del UML
    private double radio; // Cuando hemos inicializado Circulo, se ha tomado esta variable
    // Se declara una variable para el color
    String color;

    /** Constructor para inicializar un objeto de la clase Círculo */
    public  Circulo(double radio){
        this.radio = radio;  /** Para referirnos a la variable de la clase y no a la local */
    }


    @Override
    public void colorear(String color) {

    }
    /** Para calcular el area de un circulo -> (A = π r²) */
    @Override
    double calcularArea() {
        area = Math.PI * (radio * radio);
        return area;
    }

    /** Para calcular el perímetro de un círculo -> P = π x d */
    @Override
    double calcularPerimetro() {
        perimetro = Math.PI * (radio * 2); // el diámetro es el radio x2
        return perimetro;
    }
}
