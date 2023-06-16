package Tema_3.Ejercicio_3_2;
/** Creamos una Clase Main para instanciar tantas nuevas personas de la Clase Persona como sea necesario*/

public class Main {
    public static void main(String[] args) {
        /** Vamos a instanciar diferentes personas de diferentes formas y con sus respectivos atributos */

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();


        persona1.setNombre("David");
        persona1.setPrimApellido("Gutiérrez");
        persona1.setSegApellido("Pérez");
        persona1.setEdad(38);
        System.out.println("La persona1 se llama "+ persona1.getNombre()+
                "\nSus aperllidos son "+persona1.getPrimApellido()+ persona1.getSegApellido()+
                "\ny tiene "+persona1.getEdad()+ " muchas gracias!! ciao, ciao!");

        System.out.println("Persona2");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());

        Persona persona3 = new Persona("Antonio", "González");
        persona3.setSegApellido("Flores");
        System.out.println("La persona3 es conocida como "+persona3.getNombre()+" "+persona3.getSegApellido()+
        "\ny cuenta la leyenda que era el único músico de entre sus herman@s");

        /** En este caso accederemos a un método creado enn la Clase Persona*/
        Persona persona4 = new Persona();
        persona4.setEdad(15);
        System.out.println("De esta persona solo sabemos que tiene "+persona4.getEdad()+" años");
        System.out.println("Nos preguntamos si será el músico legendario "+persona4.esMusico);

        persona1.mostrarNombreCompleto();

    }
}
