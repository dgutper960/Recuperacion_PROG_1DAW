package Tema_6.Actividad_6_4;

/** Creamos esta clase que hereda de EsquemaVoraz */


import java.util.Arrays;

public class ProblemaMochilaFaccionaria extends EsquemaVoraz{
    /* Valores de entrada */
    private Double pesoMaximo;
    private int numObjetos;
    private Double [] peso;
    private Double [] valor;

    /* pesoActual es una variable para el control del peso */
    private Double pesoActual;

    /* Constructor con parámetros  */
    public ProblemaMochilaFaccionaria(Double pesoMaximo, int numObjetos, Double[] peso, Double[] valor) {
        this.pesoMaximo = pesoMaximo;
        this.numObjetos = numObjetos;
        this.peso = peso;
        this.valor = valor;
    }

    /* Sobrecarga de los diferentes métodos en EsquemaVoraz */
    @Override
    protected void inicializa() {
        solucion=new Object[numObjetos];
        Arrays.fill(solucion,0);
        pesoActual=0d;

    }

    @Override
    protected boolean fin() {
        return pesoMaximo.equals(pesoActual);
    }

    @Override
    protected void seleccionaYEliminaCandidato() {
        Double mayor=valor[0]/peso[0];
        etapa=0;
        for (int i = 0; i < numObjetos; i++) {
            if(mayor < Double.valueOf(valor[i])/peso[i]){
                mayor=Double.valueOf(valor[i])/peso[i];
                etapa=i;
            }
        }
        valor[etapa]=0d;
    }

    @Override
    protected boolean esPrometedor() {
        return true;
    }

    @Override
    protected void anotaEnSolucion() {
        // Si el candidato entra entero en la mochila se mete entero
        if (pesoActual + peso[etapa] <= pesoMaximo) {
            candidato = 1d;
        } else { // si sólo entra una parte se mete esa parte
            candidato = Double.valueOf((pesoMaximo - pesoActual)) / peso[etapa];
        }
        solucion[etapa] = candidato;
        pesoActual = Double.valueOf(pesoActual) + candidato * Double.valueOf(peso[etapa]);
    }
}