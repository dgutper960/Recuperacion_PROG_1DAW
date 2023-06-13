package Tema_6.Actividad_6_4;

/** Debemos crear esta clase abstracta con el esquema del algoritmo voraz
 * el método voraz, será usado a modo de plantilla */

public abstract class EsquemaVoraz {
    // Atributos internos del algoritmo
    Object[] solucion; // Array de objetos que almacenará la solución final
    Double candidato; // Representa el candidato actual a ser evaluado
    int etapa; // Indica la etapa actual del algoritmo.

    /* El algoritmo voraz irá llamando al los diferentes métodos
    hasta la resolución del problema */
    public void voraz () {
        inicializa(); // Inicializa el estado del algoritmo
        while (!fin()) {  // Bucle while se ejecuta hasta que se cumpla la condición de fin() (observar negación '!')
            seleccionaYEliminaCandidato(); // En cada iteración se llama al método
            if (esPrometedor()) { // Luego entra la condicional con otro método como entrada
                anotaEnSolucion(); // Si se cumple la condición, se llama al método
            }
        }
    }

    /** Todos los métodos vistos en el algoritmo voraz, son métodos abstractos:
     * --> no tienen cuerpo, por lo que se les dará en la sobrecarga  */
    protected abstract void anotaEnSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();

}