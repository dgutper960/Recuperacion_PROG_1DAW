package Tema_4.practica_4.parte6;

/** De cada empleado es importante almacenar el
 * código de empleado, DNI, nombre, primer apellido, segundo apellido,
 * año de nacimiento (numérico)
 * y si tiene concedida, o no, reducción de jornada (booleano) */

public class Empleado {

    /** Igual que con las sedes vamos a crear los campos, el contructor y las getters and setters **/
    String codEmpleado;
    String DNI;
    String nombre;
    String primApellido;
    String segApellido;
    Integer añoNacimiento;
    Boolean redJornada;
    /** Constructor */
    public Empleado(String codEmpleado, String DNI, String nombre,
                    String primApellido, String segApellido,
                    Integer añoNacimiento, Boolean redJornada) {
        this.codEmpleado = codEmpleado;
        this.DNI = DNI;
        this.nombre = nombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.añoNacimiento = añoNacimiento;
        this.redJornada = redJornada;
    } /** Cabe destacar que si aquí creamos otro constructor con un diferente número de campos como parámetros,
     luego podremos usar uno u otro según el número de parámetros de entrada */


    /** Getters y Setters **/
    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Boolean getRedJornada() {
        return redJornada;
    }

    public void setRedJornada(Boolean redJornada) {
        this.redJornada = redJornada;
    }
}
