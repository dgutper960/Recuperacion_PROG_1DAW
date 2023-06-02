package Tema_3.Ejercicio_3_2;
/** Creamos esta Clase llamada Persona, que será de visibilidad Pública
 * le vamos a dar una serie de atributos: nombre, primApellido, segApellido y edad
 * -> Añadir los siguientes métodos
 + mostrarNombreCompleto
 + mostrarIniciales   */

public class Persona {
    public String esMusico; /** para poder acceder al método desde la clase Main */

    private String nombre;

    private String primApellido;
    private String segApellido;
    private int edad;

    Persona () {
        nombre = "Anónimo";
    }

    /** Creamos los getters y los setters para los diferentes atributos
     * --> Los Getters sirven para leer los valores
     * --> Los Setters sirven para cambiar los valores */

    Persona (String nombre, String primApellido) {
        this.nombre = nombre;
        this.primApellido = primApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimApellido() {
        return primApellido;
    }

    public void setPrimApellido(String primApellido) {
        this.primApellido = primApellido;
    }

    public String getSegApellido() {
        return segApellido;
    }

    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarNombreCompleto(){
        this.nombre = nombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        System.out.println("El nombre completo es "+nombre+" "+primApellido+" "+segApellido);
    }

    public void esMusico(){
        this.nombre = nombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        String musico;
        if ((nombre == "Antonio") && (primApellido == "González") && (segApellido == "Flores")) {
            musico = "Es el único músico de entre sus herma@s";
        }else {
            musico = "Puede que sea músico, pero no es el que cuenta la leyenda";
        }
        System.out.println(musico);
    }
}
