package Tema_8.Actividad_8_1;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Alumno extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "secuencia1en1")
    @SequenceGenerator(allocationSize = 1, name = "secuencia1en1")
    private Integer id;
    private int participacion;

    private String grupo;
    @Embedded
    private Ordenadores ordenadorAsignado;
    public Alumno() {

    }
    public Alumno(String nombre, String apellidos, int participacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.participacion = participacion;
    }

    public Alumno(String nombre, int participacion){
        this.nombre = nombre;
        this.participacion = participacion;
    }

    public Alumno(String nombre, int participacion, String grupo, Ordenadores ordenadorAsignado) {
        this.nombre = nombre;
        this.participacion = participacion;
        this.grupo = grupo;
        this.ordenadorAsignado = ordenadorAsignado;
    }

    public Alumno(String nombre, int participacion, String grupo) {
        super(nombre);
        this.participacion = participacion;
        this.grupo = grupo;
    }

    public int getParticipacion() {
        return participacion;
    }

    public void setParticipacion(int participacion) {
        this.participacion = participacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ordenadores getOrdenadorAsignado() {
        return ordenadorAsignado;
    }

    public void setOrdenadorAsignado(Ordenadores ordenadorAsignado) {
        this.ordenadorAsignado = ordenadorAsignado;
    }

    //    @Override
//    public String toString() {
//        return "Nombre: " + getNombre() + " | Participación: " + getParticipacion() + " | Grupo: " + getGrupo() + " | Ordenador: " + getOrdenadorAsignado();
//    }
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Participación: " + getParticipacion();
    }
}
