package Tema_4.practica_4.parte1;
/** Esta clase hereda de Geometria e implementa de Coloreable,
 * ello implica que debemos implementar obligatoriamente los métodos que estén
 * definidos en cada una de esas dos clases (Geometría y Coloreable) */
public class Triangulo extends Geometria implements Coloreable {
    private double base;
    private double altura;
    private double lados = 3;

    /** Inicializamos el objeto Triangulo, no nos olvidamos de los parámetros de entrada ;) ..bueno, un poco sí... xD **/
    public Triangulo(double base, double altura, double lados){
        this.base = base;
        this.altura = altura;
        this.lados = lados;
    }

    @Override
    public void colorear(String color) {

    }

    /** Calcular el perímetro de un triángulo es -> base * altura entre 2 **/
    @Override
    double calcularArea() {
        area = (base * altura) / 2;
        return area;
    }
    /** Perímetro = suma de los 3 lados  */
    @Override
    double calcularPerimetro() {
        perimetro = lados + base;
        return perimetro;
    }
}
