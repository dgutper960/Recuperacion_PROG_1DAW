package Tema_6.Actividad_6_4;

/** Creamos esta clase que hereda de EsquemaVoraz */


import java.util.Arrays;
/** Esta clase hereda de EsquemaVoraz */
public class ProblemaMochilaFaccionaria extends EsquemaVoraz{
    /* Valores de entrada */
    private Double pesoMaximo;
    private int numObjetos;
    private Double [] peso;
    private Double [] valor;

    /* pesoActual es una variable para el control del peso */
    private Double pesoActual;

    /* Constructor con parámetros para la clase main */
    public ProblemaMochilaFaccionaria(Double pesoMaximo, int numObjetos, Double[] peso, Double[] valor) {
        this.pesoMaximo = pesoMaximo;
        this.numObjetos = numObjetos;
        this.peso = peso;
        this.valor = valor;
    }

    /* Sobrecarga de los diferentes métodos de la clase EsquemaVoraz */
    @Override
    protected void inicializa() {
        // Inicializa el arreglo solución con el tamaño de numObjetos
        solucion = new Object[numObjetos];
        // Usa Array.fill() del paquete utils para rellenar el array con el valor dado (0 para todos los elementos)
        Arrays.fill(solucion,0);
        // Inicializa la variable pesoActual
        pesoActual=0d;
        /* Esta variable se utilizará para llevar un registro del peso acumulado
        de los candidatos a lo largo del algoritmo*/

    }

    @Override
    protected boolean fin() {
        return pesoMaximo.equals(pesoActual);
        /* Este método compara pesoMaximo con pesoActual y retorna un booleano*/
    }

    /* El método selecciona y elimina candidatos que no sean prometedores en función de un criterio dado */
    @Override
    protected void seleccionaYEliminaCandidato() {
        // Declaramos mayor con la división entre valor y peso
        Double mayor=valor[0]/peso[0];
        // Declaramos etapa a 0 almacenará el valor índice del candidato a eliminar
        etapa=0;
        // for toma i = 0 y menor estricto a numObjetos, con incremento 1
        for (int i = 0; i < numObjetos; i++) {
            // Si los valores (valor[i]/peso[i]) son mayores a mayor
            if(mayor < Double.valueOf(valor[i])/peso[i]){
                mayor=Double.valueOf(valor[i])/peso[i];
                // y se inicializa etapa al valor de ese índice
                etapa=i;
            }
        }
        valor[etapa]=0d;
        // Una vez se han recorrido todos los índices se vuelve a inicializar a 0
    }

    @Override
    protected boolean esPrometedor() {
        return true;
    } // Esto lo que hace es decir que todos los candidatos son prometedores
     // En una situación real esta función debería ser implementada


    /* Este método se encarga de anotar
    el resultado de un candidato en la solución y actualizar el peso acumulado */
    @Override
    protected void anotaEnSolucion() {
        /* Si el peso actual más el peso del candidato actual 'peso[etapa]'
        es menor o igual al peso máximo permitido 'pesoMaximo' */
        if (pesoActual + peso[etapa] <= pesoMaximo) {
            candidato = 1d;
        } else {/*  calcula la parte del candidato que puede ser anotada en la solución
        dividiendo la diferencia entre el peso máximo y el peso actual por el peso del candidato actual.  */
            candidato = Double.valueOf((pesoMaximo - pesoActual)) / peso[etapa];
        } // Se asigna a solución, el valor calculado
        solucion[etapa] = candidato;
        // Se actualiza pesoActual sumando el peso del candidato actual al peso acumulado actual.
        pesoActual = Double.valueOf(pesoActual) + candidato * Double.valueOf(peso[etapa]);
    }
}