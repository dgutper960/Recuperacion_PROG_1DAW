package Tema_5.Practica_5;

/** Creamos una clase Persona que implementa la interfaz Comparable
 * con el objetivo de usar el método sobrecargado compareTo, en base, al atributo nombre */

public class Persona implements Comparable{

    /** Creamos los atributos de la clase Persona
     * con la mayor restricción de visibilidad posible */
private String nombre;
private String apellidos;
private int edad;

    /** Campos con visibilidad privada generamos pues Getters y Setters **/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /** Generamos los constructores, uno para nombre */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    /** y otro para nombre y edad */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /** Generamos también un método toString()
     * para representar la instancia de la clase como una cadena
     * seleccionaremos únicamente el nombre **/
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    /** Esta es la sobrecarga del método compareTo
 * (obligatoria al implementar la interfaz Comparable)*/
    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona) other; /** Pasamos la variable "otro" que es de tipo "Object" a tipo "Persona" */
        return this.nombre.compareTo(otherPersona.nombre);
        /** Luego compara los nombres de los objetos usando el método compareTo() */
    }

}
