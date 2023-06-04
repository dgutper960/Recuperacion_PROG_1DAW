package Tema_5.Actividad_1;

import java.util.Comparator;

/** La clase Comparador se utiliza para comparar objetos de la clase Persona en función de su nombre y edad */
public class Comparador implements Comparator<Persona> {

    /** Método sobrecargado de la Clase Comparator p1 y p2 como parámetro de entrada */
    @Override
    public int compare(Persona p1, Persona p2) {
        /** Se extrae el nombre con get ignorando las mayusculas y se compara con el get.Nombre de p2*/
        if (p1.getNombre().compareToIgnoreCase(p2.getNombre()) == 0){
            if (p1.getEdad() == p2.getEdad()){ /** Se comparan las edades de p1 y p2 */
                return 0; /** En cuyo caso se devuelve 0 */
            }
            if (p1.getEdad() > p2.getEdad()){
                return 1; /** Si p1 es mayor que p2 se retorna 1 **/
            }
            return -1;  /** Si p1 es menor a p2 se retorna -1 para indicarlo */
        }
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        /** Si los nombres de p1 y p2 no son iguales, se devuelve el resultado de la comparación */
    }
}
