package Tema_5.Practica_5;
/**Si ya tienes la cola, una pila te costará menos implementarla. Piensa ahora que un lugar de
 la cola del cine, tenemos una torre de ladrillos donde cada nuevo ladrillo que añades a la
 torre, tiene que ponerse (apilarse) encima del anterior y cada vez que queremos quitar un
 ladrillo hay que quitar el último que pusimos.
 Una pila es un tipo abstracto de datos que maneja la información según el método LIFO,
 acrónimo de Last In First Out (último en entrar, primero en salir).
 Procederemos de manera análoga a como hipismo con la cola.
 Primero elige mediante qué tipo de dato almacenarás la información.
 Ahora ten en cuenta que los métodos a implementar son los siguientes:
 - apilar: introduce un elemento en la pila
 - desapilar: saca un elemento de la pila
 - cima: obtiene el elemento que forma parte de la pila (sin eliminarlo de ella)
 - limpiar: vacía todos los elementos de la pila
 - esVacia: indica si la pila tiene o no elementos
 - longitud: devuelve el tamaño de la pila
 */
import java.util.LinkedList;
import java.util.List;

public class Pila {
    /** Constructor para la pila*/
    private List pila = new LinkedList<>();

    /** apilar: introduce un elemento en la pila */
    public void apilar(Object element){
        pila.add(element);
    }


    /** desapilar: saca un elemento de la pila */
    public void desapilar(){
        pila.remove(pila.size() - 1);
    }

    /** cima: obtiene el elemento que forma parte de la pila
     * (sin eliminarlo de ella) */
    public void cima(){
        System.out.println(pila.get(pila.size() - 1));
    }


    /** limpiar: vacía todos los elementos de la pila */
    public void limpiar(){
        pila.clear();
    }


    /** esVacia: indica si la pila tiene o no elementos */
    public boolean esVacia(){
        return pila.isEmpty();
    }


    /** longitud: devuelve el tamaño de la pila */
    public void longitud(){
        System.out.println(pila.size());
    }

    /** Permite la representación del objeto mediante una cadena */
    @Override
    public String toString() {
        return pila.toString();
    }
}
