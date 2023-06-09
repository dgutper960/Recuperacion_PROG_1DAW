package Tema_3.practica_3;
/** Ejercicio 4: Realiza una nueva clase para almacenar direcciones como la siguiente:
 Calle Los Naranjos, 47, 3ºA. 11600 Ubrique (Cádiz)
 Establece una relación entre esta clase y la clase del ejercicio 2
 de modo que cada alumno pueda tener o no una dirección.
 ¿Cómo se llama este tipo de relación?
 Realiza lo mismo para darle una dirección a la clase de ejercicio 1. */

public class Direccion {
    // Creamos los campos con visibilidad privada
    private String calle;
    private Integer numero;
    private Integer piso;
    private String letra;
    private Integer codPos;
    private String localidad;
    private String provincia;

    // Creamos los contructores sin parametro y con parametros

    public Direccion() {
    }

    public Direccion(String calle, Integer numero, Integer piso, String letra, Integer codPos, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.codPos = codPos;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Direccion(String calle, Integer numero, Integer piso, String letra, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.localidad = localidad;
    }

    /** Ejercicio 6: Define un método para imprimir la dirección completa. Sobrecarga el método
     anterior para imprimir sólo la calle y la localidad. Sobrecarga varios constructores para
     poder crear direcciones sin provincia ni código postal. Sobreescribe el constructor por
     defecto para que siga habiendo un constructor sin parámetros. */

    public void imprimirDireccion(){
        System.out.println("Dirección Completa\n" +
                "Calle: "+getCalle()+"\n" +
                "Número: "+getNumero()+"\n" +
                "Piso: "+getPiso()+"\n" +
                "Letra: "+getLetra()+"\n" +
                "Cod Postal: "+getCodPos()+"\n" +
                "Localidad: "+getLocalidad()+"\n" +
                "Provincia: "+getProvincia());
    }

    public void direccionCompleta(String calle, String localidad){
        System.out.println("Calle: "+getCalle()+"\nLocalidad: "+getLocalidad());
    }



    // Creamos los getters y setters



    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getCodPos() {
        return codPos;
    }

    public void setCodPos(Integer codPos) {
        this.codPos = codPos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
