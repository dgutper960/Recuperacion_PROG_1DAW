package Tema_3.practica_3;
/** Ejercicio 1: Define una clase de nombre Casa que cumpla con las siguientes restricciones:
 - Debe tener visibilidad pública */
public class Casa {
    // Todos los campos deberán ser visibles exclusivamente dentro de la misma clase.
    /** Contiene un campo de tipo numérico para almacenar su precio */
    private int precio;
    /** Otro campo de tipo carácter para indicar con una letra la calificación energética **/
    private char califEnergetica;
    /** Otro campo de tipo cadena de texto para lo referencia catastral. */
    private String refCatastral;
    /** Una constante que indique el valor del IVA y otro para el IVA reducido. */
    private static float IVA = 0.21f;
    private  static float IVAred = 0.16f;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getCalifEnergetica() {
        return califEnergetica;
    }

    public void setCalifEnergetica(char califEnergetica) {
        this.califEnergetica = califEnergetica;
    }

    public String getRefCatastral() {
        return refCatastral;
    }

    public void setRefCatastral(String refCatastral) {
        this.refCatastral = refCatastral;
    }

    public static float getIVA() {
        return IVA;
    }

    public static void setIVA(float IVA) {
        Casa.IVA = IVA;
    }

    public static float getIVAred() {
        return IVAred;
    }

    public static void setIVAred() {
        Casa.IVAred = IVAred;
    }

    /** método que calcule el precio con IVA. */
    protected float precioIVA(){
       float precio_iva = precio * IVA;
       return precio_iva;
    }
    /** método que calcule el precio con IVA reducido. */
    protected float precioIVAred() {
        float precio_ivaRed = precio * IVAred;
        return precio_ivaRed;
    }
    /** método que imprima la referencia catastral y el precio sin IVA, con IVA y con IVA reducido */
    protected void imprimirPrecios() {
        System.out.println();
        System.out.println();
        System.out.println(precioIVA());
        System.out.println(precioIVAred());
    }
}
