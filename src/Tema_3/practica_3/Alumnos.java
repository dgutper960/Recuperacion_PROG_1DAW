package Tema_3.practica_3;

import Tema_3.practica_3.persona.Persona;

/** Ejercicio 2: Define una clase para modelar a los alumnos de un instituto. De ellos se debe
 almacenar:
 -> nombre, apellidos, edad, si es repetidor o no, nota media y correo electrónico.
 También se espera que de un alumno se pueda obtener una impresión de su nombre con
 los apellidos y la edad. Además, dado que se usará dentro de un modelo más amplio (aulas,
 profesores, etc...), se debe permitir acceder a todos los campos para consulta y
 modificación, pero no de forma directa, sino encapsulando esta información. Por último,
 añade un constructor sin parámetros y otro con los parámetros del nombre, apellidos y
 edad. **/
public class Alumnos extends Persona {
    // Declaramos campos requeridos con visibilidad privada (nivel clase)
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Boolean repetidor;
    private Float notaMedia;
    private String email;

    private String direccion;


    /** se espera que de un alumno se pueda obtener una impresión de su nombre con
     los apellidos y la edad */
    void imprimirAumno(){
        System.out.println("Datos del alumno/a \n" +
                "Nombre: "+getNombre()+"\n"+
                "Apellidos: "+getApellidos()+"\n" +
                "Edad: "+getEdad());
    }

    Alumnos() {
    } // Constructor sin parámetro

    Alumnos(String nombre, String apellidos, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    } // Constructor con parámetros



    // Generamos getters y setters para los campos de esta clase
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getRepetidor() {
        return repetidor;
    }

    public void setRepetidor(Boolean repetidor) {
        this.repetidor = repetidor;
    }

    public Float getNotaMedia() {
        return notaMedia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNotaMedia(Float notaMedia) {
        this.notaMedia = notaMedia;
    }
}
