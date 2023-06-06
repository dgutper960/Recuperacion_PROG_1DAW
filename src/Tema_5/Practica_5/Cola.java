package Tema_5.Practica_5;
/** Los métodos que tiene que implementar el TAD Cola son los siguientes:
 - encolar: introduce un elemento en la cola
 - desencolar: saca un elemento de la cola
 - frente: devuelve el primer elemento de la cola
   (el que lleva más tiempo en la cola), sin eliminarlo de ella.
 - resto: devuelve todos los elementos menos el de la frente
 - limpiar: vacía todos los elementos de la cola
 - esVacia: indica si la cola tiene o no elementos
 - longitud: devuelve el tamaño de la cola  */

import java.util.LinkedList;
import java.util.List;
/** La importación necesaria al usar el constructor List y LinkedList<>() */

public class Cola {
    /** Para que los elementos se guarden según el orden de inserción,
     * deberemos crear una LinkedList */
    private List cola = new LinkedList<>();

    /** Método para encolar (introducir elementos) **/
    public void encolar(Object elemento){ // Tomamos Objet de java Land

        cola.add(elemento); // uso de add para introducir elemento
    }

    /** desencolar: saca un elemento de la cola */
    public void desencolar(){

        cola.remove(3); // Nos pide un indice u objeto como parámetro de entrada
    } // Indice 3 corresponde a Ramona

    /** frente: devuelve el primer elemento de la cola */
    public void frente(){

        System.out.println(cola.get(0));
    }/** Se toma el objeto con valor de índice 0 y se imprime */

    /** resto: devuelve todos los elementos menos el de la frente */
    public void resto (){
        /** for ->  int i = 1 y mientras i menor a número de elementos en la cola */
        for(int i = 1; i < cola.size(); i++){ /** i = 1 nunca toma el elemento con indice 0  */
            System.out.print(cola.get(i) + " ");
            /** En cada iteración se imprime el elemento cuyo valor de índice coincida con i**/
        }
    }

    /** limpiar: vacía todos los elementos de la cola */
    public void limpiar(){
        cola.clear();
    }

    /**
     * esVacia: indica si la cola tiene o no elementos
     *
     * @return
     */
    public boolean esVacia(){
        return cola.isEmpty();
    }

    public void longitud(){

        System.out.println(cola.size());/** size() para saber el número de elementos */
    }/** Mismo método que el usado en el for**/


    /** Permite la representación del objeto mediante una cadena */
    @Override
    public String toString() {
        return cola.toString();
    }

}

