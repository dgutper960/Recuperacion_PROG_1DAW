package Tema_4.practica_4;
/** Esta clase hereda de Geometria e implementa de Coloreable,
 * ello implica que debemos implementar obligatoriamente los métodos que estén
 * definidos en cada una de esas dos clases (Geometría y Coloreable) */

public class Circulo extends Geometria implements Coloreable{

    private double radio;

    @Override
    public void colorear(String color) {

    }

    @Override
    double calcularArea() {
        return 0;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }
}
