package Tema_7.Actividad_7_4;

/** Creamos una nueva clase persona con su constructor, getters y setters */

public class Persona {
    String nombre;
    String telefono;
    String direccion;

    public Persona(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}