package Tema_5.Actividad_1;

/** Crear un grupo de Personas donde no se puedan repetir personas
 * ni introducir personas nulas.
 * Además, queremos que en el grupo, cada vez que se introduzca una nueva persona,
 * se mantenga ordenado por nombre, sin tener en cuenta minúsculas ni mayúsculas,
 * de la z a la a y en caso de existir dos personas con el mismo nombre
 * que se tenga en cuenta la edad de manera ascendente.

 Imprime todas las personas del grupo para probar los resultados.
 Además, cuenta cuantas personas hay que tengan la misma edad     */

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    Persona Iker = new Persona("Iker", 20);
    Persona Manoli = new Persona("Manoli", 19);
    Persona Fernando = new Persona("Fernando", 34);
    Persona Davinia = new Persona("Davinia", 21);
    Persona MariaJesus = new Persona("María Jesús", 40);
    Persona David = new Persona("David", 38);

    /** Debemos crear la clase ComparadorInverso **/
        TreeSet<Persona> conjuntoPersonas= new TreeSet<>(new ComparadorInverso().reversed());

        /** Añadimos personas al conjunto*/
        conjuntoPersonas.add(Iker);
        conjuntoPersonas.add(David);
        conjuntoPersonas.add(MariaJesus);
        conjuntoPersonas.add(Manoli);
        conjuntoPersonas.add(Fernando);
        conjuntoPersonas.add(Davinia);


        System.out.println(conjuntoPersonas);



    }
}
