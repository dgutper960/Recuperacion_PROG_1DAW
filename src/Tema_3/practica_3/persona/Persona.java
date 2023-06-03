package Tema_3.practica_3.persona;
/** Creamos la clase persona de la que heredará Alumno, los campos son privados
 * se accederá a ellos mediante getters y setters */
public class Persona {
    private String nombre;
    private String primApellido;
    private String segApellido;
    private Integer edad;

    public Persona() {
    } // Constructor sin parámetros, ponemos los valores por defecto a null

    public  Persona(String nombre, String primApellido, String segApellido, Integer edad){
        this.nombre = nombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.edad = edad;
    } // Constructor con parámetros, inicializa las variables con los valores pasados como parámetros (this)

    // Creamos los métodos públicos getters y setters


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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
