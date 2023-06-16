package Tema_7.Actividad_7_3;

public class Persona extends Tema_3.Ejercicio_3_2.Persona {

    Persona padre;
    Direccion direccion;


    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Persona(){

    }


    public Persona(Persona padre) {
        this.padre = padre;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "padre=" + padre +
                ", direccion=" + direccion +
                '}';
    }
}
