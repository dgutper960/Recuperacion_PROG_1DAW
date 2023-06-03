package Tema_3.practica_3;
/** Ejercicio 5: Define una clase con un método main. Crea un alumno que viva en una casa,
 utilizando las 3 clases que tenemos hasta el momento. */
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Paseo del Prado");
        direccion1.setNumero(59);
        direccion1.setPiso(1);
        direccion1.setLetra("S");
        direccion1.setCodPos(11600);
        direccion1.setLocalidad("Ubriqueland");
        direccion1.setProvincia("Cádiz");

        Direccion direccion2 = new Direccion();
        direccion1.setCalle("Feria");
        direccion1.setNumero(28);
        direccion1.setPiso(null);
        direccion1.setLetra(null);
        direccion1.setCodPos(41012);
        direccion1.setLocalidad("Sevilla");
        direccion1.setProvincia("Sevilla");

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Davilillo");
        alumno1.setApellidos("Trumpet Milles");
        alumno1.setEdad(38);
        alumno1.setRepetidor(false);
        alumno1.setNotaMedia(7.9F);
        alumno1.setEmail("trumpetmiles@hopemail.es");
        alumno1.setDireccion(alumno1.getDireccion());


        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Juana Mari");
        alumno2.setApellidos("Nuñez Fernandez");
        alumno2.setEdad(27);
        alumno2.setRepetidor(false);
        alumno2.setNotaMedia(8.8F);
        alumno2.setEmail("lamarijuana@hotmail.com");
        alumno2.setDireccion(alumno2.getDireccion());

        //TODO ES NECESARIO ACLARAR EL EJERCICIO 6 CON EL PROFESOR
    }

}
