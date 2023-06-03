package Tema_4.practica_4.parte1;
/** Esta clase hereda de Geometria e implementa de Coloreable,
 * ello implica que debemos implementar obligatoriamente los métodos que estén
 * definidos en cada una de esas dos clases (Geometría y Coloreable) */
public class Cuadrado extends Geometria implements Coloreable {

    private double lado;
    // Añadimos variable para el color
    String color;

    /** Constructor para inicializar un objeto de cuadrado */
    public Cuadrado(double lado){
        this.lado = lado; // this para usar la variable lado de la Clase Cuadrado
    }

    @Override
    public void colorear(String color) {

    }

    /** Para calcular el área de un cuadrado lado * lado --*/
    @Override
    double calcularArea() {
        area = lado * lado;
        return area;
    }

    /** Para obtener el perímetro del cuadrado lado + lado + lado + lado ---*/
    @Override
    double calcularPerimetro() {
        perimetro = lado * 4;
        return perimetro;
    }
}
