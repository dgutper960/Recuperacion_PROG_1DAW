package Tema_5.Actividad_2;

/** En este ejercicio, se te pide implementar una aplicación que maneje una lista de tareas pendientes.
 * La aplicación debe permitir agregar nuevas tareas a la lista, marcar tareas como completadas y eliminar tareas de la lista.
 * Además, la aplicación debe permitir al usuario elegir entre dos tipos de estructuras de datos para almacenar la lista de tareas:
 * ArrayList y LinkedList.
 Para implementar la aplicación, debes crear una clase llamada "TaskList" que tenga los siguientes métodos:
 addTask(String task): Agrega una nueva tarea a la lista.
 removeTask(String task): Elimina la tarea especificada de la lista.
 completeTask(String task): Marca la tarea especificada como completada.
 getTasks(): Devuelve un arreglo con todas las tareas de la lista. **/

import java.util.*;
/** Se debe importar el paquete java.util y todas sus clases */
public class TaskList {

/**  lista privada de tareas, que se inicializa como un ArrayList o un LinkedList
 * dependiendo del constructor que se utilice al instanciar la clase TaskList. */
    private List<String> listaTareas;

    /**  Este constructor acepta una lista de tareas como paramero de entrada */
    public TaskList(List<String> listaTareas) {
        listaTareas=new ArrayList<>();
    }

    /** Método que permite elegir entre los tipos de estructuras ArrayList o LinkedList
     * según el string que se use en el constructor de la clase main */
    public TaskList(String tipoLista) {
        if (tipoLista.equalsIgnoreCase("ArrayList")){
            listaTareas=new ArrayList<String>();
        }else{
            listaTareas=new LinkedList<>();
        }
    }

    /** Método para añadir tareas a la lista */
    public void addTask(String task){
        listaTareas.add(task);
        System.out.println("Tarea añadida: "+task);
    }


    /** Método para eliminar tareas de la lista */
    public  void removeTask(String task){
        listaTareas.remove(task);
        System.out.println("Tarea eliminada: "+task);
    }

    /** Marca la tarea especificada como completada **/
    public  void completeTask(String task){
        /** Se inicializa la variable 'completado'*/
        String completado="Tarea completada: ["+ task +"]";
        listaTareas.set(listaTareas.indexOf(task), completado);
        /** El método listaTareas.indexOf(task) modifica la lista listaTareas en la posición del índice correspondiente
         * de la tarea proporcionada. En lugar de eliminar la tarea, se reemplaza con la cadena completado */
        System.out.println(completado);
        /** Se imprime el valor de la variable 'completado' */
    }


    /** Para devolver arreglo con la lista de tareas */
    public  String[] getTasks(){
        /** Creamos un array String[] llamado arrayTareas tomando en el constructor el tamaño de 'listatareas' */
        String [] arrayTareas=new String[listaTareas.size()];
        /** El método toArray() toma como argumento el array en el que se almacenarán los elementos de la lista */
        arrayTareas=listaTareas.toArray(arrayTareas);
        return arrayTareas;  /** Se retorna el valor del array creado  */
    }
}
