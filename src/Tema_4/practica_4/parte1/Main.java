package Tema_4.practica_4.parte1;
/** Esta es la clase donde ejecutaremos nuestro código
 *  y donde crearemos los diferentes objetos (círculos, cuadrados y triángulos)
 *  -> la primera geometría de cada tipo, deberá colorearse de azul */
public class Main {
    public static void main(String[] args) {
        /** Debemos tener en cuenta que los objetos que
         * vamos a crear (circulos, cuadrados y triángulos)
         * heredan de la Clase Geometría por lo que los constructores
         * tendrán la siguiente estructura o sintaxis:                  */

        Geometria cir1 = new Circulo(12.45d);
        Geometria cir2 = new Circulo(4.012d);

        Geometria cuad1 = new Cuadrado(34.2d);
        Geometria cuad2 = new Cuadrado(11.9524d);

        Geometria tri1 = new Triangulo(3.33d, 3.33d, 3.33d);
        Geometria tri2 = new Triangulo(23.84d, 45.979d,56.891d);


        /** Creamos un array unimensional que contenga los objetos creados */
       Geometria[] poligonos = {cir1, cir2, cuad1, cuad2, tri1, tri2};

       /** Accedemos al método que calcula todas las áreas */
        System.out.println("El área total de los polígonos corresponde a "+calcularArea(poligonos));

        /** Accedemos al método que calcula el perímetro de todos los polígonos */
        System.out.println("El perímetro total de todos los polígonos es "+calcularPerimetro(poligonos));
    }

    /** Creamos el código para el método calcularArea() */
    static double calcularArea(Geometria[] areaPoligonos) {

        double areaTotal = 0; /** Si no se inicializa la variable, el compilador Java producirá un error, es así en Java */
        // Estas variables booleanas son para poner a true con la primera figura
        boolean primerCirculo = true, primerCuadrado = true, primerTriangulo = true;
        /** Iniciamos bucle for con i a 0 y mientras sea menor que la longitud del array, el incremento es 1*/
        for (int i = 0; i < areaPoligonos.length; i++) {
            areaTotal += areaPoligonos[i].calcularArea();
            /** Se ha llamado al método calcularArea()
             *  Se ha aplicado al valor de la posición [i] en ese momento del código sumándolo a areaTotal que es 0 */
            if (primerCirculo && areaPoligonos[i] instanceof Circulo) {
                primerCirculo = false;
                ((Circulo) areaPoligonos[i]).colorear("Azul");
            }/** Esta condicional if comprueba la instancia de [i] con instanceof
             si es el primero del tipo círculo se pone la variable a false
             y se llama al método coloreable() para que su variable tome el valor "azul" */

            else if (primerCuadrado && areaPoligonos[i] instanceof Cuadrado) {
                primerCuadrado = false;
                ((Cuadrado) areaPoligonos[i]).colorear("Azul");
            }
            /** Se hace lo mismo con los cuadrados y triángulos*/
            else if (primerTriangulo && areaPoligonos[i] instanceof Triangulo) {
                primerTriangulo = false;
                ((Triangulo) areaPoligonos[i]).colorear("Azul");
            }
        }
        return areaTotal; /** Se devuelve el valor de areaTotal */
    }

    static double calcularPerimetro(Geometria[] perimPoligonos) {

        double perimTotal = 0;

        for(int i = 0; i < perimPoligonos.length; i++) {
            perimTotal += perimPoligonos[i].calcularPerimetro();
        } /** Mismo proceso que con el area pero sin comprobar si es el primero ni colorear */
        return perimTotal;
    }
}
