package Tema_5.Practica_5;

/** En esta clase vamos a instanciar los objetos persona
 * y aplicar los diferentes métodos creados en la Clase Cola */

public class Main {
    public static void main(String[] args) {

        /** Recordamos que el la Clase Cola se creó una LinkedList */
        /** Instanciamos una nueva cola (la cola del cine) */
        Cola colaCine = new Cola();

        /** Una cola sin personas ni es cola ni es ná, instanciamos las Personas */
        Persona roberta = new Persona("Roberta"); // En este caso solo nos interesa el nombre
        Persona francisca = new Persona("Francisca");
        Persona manuela = new Persona("Manuela");
        Persona ramona = new Persona("Ramona");
        Persona juana = new Persona("Juana");
        Persona isabella = new Persona("Isabella");

        /** Añadimos las personas a la cola mediante el correspondiente método encolar()
         * que se ha implementado en la clase Cola */
        System.out.print("Añadiendo personas a la cola: ");
        colaCine.encolar(roberta);
        colaCine.encolar(francisca);
        colaCine.encolar(manuela);
        colaCine.encolar(ramona);
        colaCine.encolar(juana);
        colaCine.encolar(isabella);
        System.out.println(colaCine);
        /** Imprimimos la cola para ver el resultado */

        /** Desencolar una persona */
        System.out.print("Quitamos la persona Ramona: ");
        colaCine.desencolar(); // el parámetro de entrada está en el método de la clase Cine
        System.out.println(colaCine);

        /** Llamamos al método para primer elemento de la cola */
        System.out.print("La primera persona de la cola es ");
        colaCine.frente();

        /** Llamamos al método para ver el resto de la cola */
        System.out.print("El resto de la cola a partir del primero es: ");
        colaCine.resto();

        /** Para vaciar la cola */
         System.out.print("\nLa cola será vaciada, han llegado los antidisturbios!! ");
        colaCine.limpiar();
        //System.out.println(colaCine);

        /** Hacemos la comprobación para ver si en la cola quedan disidentes */
        System.out.print("Comprobamos si la cola está vacía: ");
        System.out.println(colaCine.esVacia());

        /** Si acabamos de llegar al Cine y queremos saber la longitud de la cola */
        System.out.print("La longitud de la cola (en Personas) es de : ");
        colaCine.longitud();

        //TODO; A PARTIR DE ESTE PUNTO SE RESPONDE AL ENUNCIADO --> PILA

        /** Instanciamos el objeto de la Clase Pila (lo que es crear la nueva pila) */
        Pila pilaPersonas = new Pila();

        /** Añadimos personas a la pila */
        System.out.println("Añadiendo personas a la pila: ");
        pilaPersonas.apilar(francisca);
        pilaPersonas.apilar(manuela);
        pilaPersonas.apilar(ramona);
        pilaPersonas.apilar(juana);
        pilaPersonas.apilar(isabella);
        System.out.println(pilaPersonas);

        /** Quitamos el elemento superior de la Pila */
        System.out.print("Quitando el elemento superior (el último en entrar) ");
        pilaPersonas.desapilar();
        System.out.println(pilaPersonas);

        /** Vemos cuál es el elemento que se encuentra el último en la pila */
        pilaPersonas.cima();

        /** Limpiamos la pila */
        System.out.print("Llegaron otra vez los antidistrubios!! ");
        pilaPersonas.limpiar();
        System.out.println(pilaPersonas);

        /** Comprobamos si está vacía */
        System.out.print("Comprobación de disidentes en la zona: ");
        System.out.println(pilaPersonas.esVacia());

        /** Para saber la longitud de la pila (en número de personas) */
        pilaPersonas.longitud();
    }
}

