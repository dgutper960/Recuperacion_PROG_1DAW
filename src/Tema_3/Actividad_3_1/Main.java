package Tema_3.Actividad_3_1;

public class Main {
    final static Integer A=234;
    final static Integer B=12;
    public static void main(String[] args){
        /** Este es el constructor donde creamos una instancia de CalculadoraBasica llamada Calc1 */
        CalculadoraBasica Calc1 = new CalculadoraBasica();
        Calc1.suma(A,B);
        Calc1.resta(A,B);
        Calc1.multi(A,B);
        Calc1.div(A,B);
        /** Definimos un enumerado Operacion que contiene las posibles operaciones que se pueden realizar en la calculadora */
        enum Operacion {SUMA, RESTA, DIVISION, MULTIPLICACION}
        Operacion Calculo= Operacion.MULTIPLICACION; // Declaramos la variable para el Switch, nombre del enum seguido del nombre que se le da a la variable del Switch
        // Estructura de control Switch; Entre parentesis el "Caso" previamente inicializado --> Operacion Calculo= Operacion.MULTIPLICACION;
        switch (Calculo){ /** Como hemos declarado que la variable para el Switch es MULTOPLICACION, el programa se va al case corrrespondiente */
            case SUMA:
                System.out.println("La suma de " + A + " y "+B+" es " +Calc1.suma(A,B));
                break;
            case RESTA:
                System.out.println("La resta de " + A + " y "+B+" es " +Calc1.resta(A,B));
                break;
            case MULTIPLICACION:
                System.out.println("La multiplicacion de " + A + " y "+B+" es " +Calc1.multi(A,B));
                break;
            case DIVISION :
                System.out.println("La division de " + A + " y "+B+" es " +Calc1.div(A,B));
                break;
            default: System.out.println("Operacion no soportada");
        }
    }
}
