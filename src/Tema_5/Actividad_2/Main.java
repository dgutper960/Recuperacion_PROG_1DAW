package Tema_5.Actividad_2;

/** Debes crear un método main que permita al usuario interactuar con la lista de tareas.
 * En particular, el programa debe permitir al usuario agregar, eliminar y completar tareas,
 * y debe permitir al usuario elegir entre almacenar la lista de tareas en un ArrayList o en un LinkedList.
 * Por tanto, deberás primero establecer la opción elegida por el usuario
 * (por ejemplo, "ArrayList" o "LinkedList") en una variable; después una secuencia de operaciones (la que desees)
 * donde se creen, eliminen, completen e impriman tareas. */

public class Main {
    public static void main(String[] args) {

        /** Constructor para la lista de tareas */
        TaskList tareas = new TaskList("LinkedList");


        //TODO Añadir tareas a la lista

        tareas.addTask("Poner lavadora");
        tareas.addTask("Fregar los platos");
        tareas.addTask("Hacer la compra");
        tareas.addTask("Tender la ropa");
        tareas.addTask("Hacer el almuerzo");
        tareas.addTask("Dormir la siesta");
        tareas.addTask("Jugar al Tinder");
        tareas.addTask("Hacer la cena");
        tareas.addTask("Contestar a los Match");

        // TODO Eliminar tareas
        tareas.removeTask("Poner lavadora");
        tareas.removeTask("Fregar los platos");
        tareas.removeTask("Hacer la compra");
        tareas.removeTask("Tender la ropa");

        // TODO Marcar tareas como completada
        tareas.completeTask("Hacer el almuerzo");

        /** Foreache que extrae en 'e' los valores del LinkedList */
        for (String e: tareas.getTasks()) {
            System.out.println(e);
            /** Se imprime el valor de 'e en cada iteración '*/
        }

    }


}
