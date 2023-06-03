package Tema_3.practica_3;
/** Ejercicio 1: Define una clase de nombre Casa que cumpla con las siguientes restricciones:
 - Debe tener visibilidad pública
 - Contiene un campo de tipo numérico para almacenar su precio
 - Otro campo de tipo carácter para indicar con una letra la calificación energética.
 - Otro campo de tipo cadena de texto para lo referencia catastral.
 - Todos los campos deberán ser visibles exclusivamente dentro de la misma clase.
 - Una constante que indique el valor del IVA y otro para el IVA reducido. Por defecto
 serán 21 y 16 respectivamente.
 - Otro método que calcule el precio con IVA.
 - Otro método que calcule el precio con IVA reducido.
 - Un método que imprima la referencia catastral y el precio sin IVA, con IVA y con IVA
 reducido. Cada uno en una línea. El método debe ser accesible solo desde el mismo
 paquete.*/
public class Casa {  // Clase Casa con visibilidad, pública
    // Campos requeridos, de tipo envoltorio y con visibilidad privada:
    private Integer precio;
    private Character calEnergetica;
    private String refCatastral;
    private final Float IVA = 0.21F;  // Al ser constante (final) debe estar inicalizado. Se ha elegido Float para facilitar el cálculo
    private final Float IVAred = 0.16F;

    // Generamos los Getteres and Setters para los campos que hemos creado

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Character getCalEnergetica() {
        return calEnergetica;
    }

    public void setCalEnergetica(Character calEnergetica) {
        this.calEnergetica = calEnergetica;
    }

    public String getRefCatastral() {
        return refCatastral;
    }

    public void setRefCatastral(String refCatastral) {
        this.refCatastral = refCatastral;
    }

    public Float getIVA() {
        return IVA;
    }

    public Float getIVAred() {
        return IVAred;
    }

    // Creamos los métodos requeridos visibilidad por defecto (protected) a nivel de paquete

    /** Cálculo con IVA, devuelve un Float
     toma como parámetro de entrada la variable precio */
    Float calculoIVA(Integer precio){
       Float resultIVA = precio*getIVA(); // El valor de IVA no lo tomamos directamente sino con el Get
       return resultIVA;
    }

    /** Cálculo con IVA reducido, devuelve un Float
     toma como parámetro de entrada la variable precio */
    Float calculoIVAred(Integer precio){
        Float resultIVAred = precio*getIVAred(); // Igual que antes tomamos el valor con el Get
        return resultIVAred;
    }

    /** Método para imprimir vos valores indicados */
    void imprimir(){
        System.out.println(getRefCatastral()); // Aquí tiramos del Get para que el método tome el valor de entrada
        System.out.println(getPrecio()); // Aquí tiramos del Get para que el método tome el valor de entrada
        System.out.println(calculoIVA(getPrecio())); // Aquí tiramos del Get para que el método tome el valor de entrada
        System.out.println(calculoIVAred(getPrecio())); // Aquí tiramos del Get para que el método tome el valor de entrada
    }




}
