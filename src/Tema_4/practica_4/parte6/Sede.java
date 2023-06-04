package Tema_4.practica_4.parte6;

/** Las sedes que están identificadas por el nombre de la ciudad en la que residen
 * (hasta el momento Madrid, Barcelona, Valencia y Oviedo).
 * En cada sede hay varios departamentos, los que hay en todas las sedes son:
 * Ventas, RR. HH. y Producción */

public class Sede {

    /** Creamos los campos que corresponden a las Sedes **/
    private String Ciudad;
    private String departamento1;
    private String departamento2;
    private String departamento3;

    /** Creamos un constructor Sede para que las sedes creadas
     * deban tener obligatoriamente los campos que se han definido **/
    Sede(String Ciudad, String departamento1, String departamento2, String departamento3){
        this.Ciudad = Ciudad;
        this.departamento1 = departamento1;
        this.departamento2 = departamento2;
        this.departamento3 = departamento3;
        /** Ponemos los respectivos this para referirnos a los campos de la Clase Sede **/

    }

    /** Ahora sabiendo que los campos tienen visibilidad a nivel de Clase,
     * generamos los respectivos Getters y Setters **/
    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDepartamento1() {
        return departamento1;
    }

    public void setDepartamento1(String departamento1) {
        this.departamento1 = departamento1;
    }

    public String getDepartamento2() {
        return departamento2;
    }

    public void setDepartamento2(String departamento2) {
        this.departamento2 = departamento2;
    }

    public String getDepartamento3() {
        return departamento3;
    }

    public void setDepartamento3(String departamento3) {
        this.departamento3 = departamento3;
    }
}
