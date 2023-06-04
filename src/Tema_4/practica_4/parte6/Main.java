package Tema_4.practica_4.parte6;

public class Main {
    public static void main(String[] args) {

        /** Instanciamos los objetos Sede para Madrid, Barcelona, Valencia y Oviedo */

        Sede SedeMadrid = new Sede("Madrid", "Ventas", "RR. HH", "Producción");
        Sede SedeBracelona = new Sede("Barcelona", "Ventas", "RR. HH", "Producción");
        Sede SedeValencia = new Sede("Valencia", "Ventas", "RR. HH", "Producción");
        Sede SedeOviedo = new Sede("Oviedo", "Ventas", "RR. HH", "Producción");


        /** Instanciamos los objetos para los empleados*/
        Empleado dagupe84 = new Empleado("9693236F9J85", "29655694J",
                "David", "Gutiérrez", "Pérez", 1984, false);

        Empleado vipefo80 = new Empleado("2569631K5P19", "31869542N",
                "Victoria", "Pereira", "Flores", 1980, true);

    }
}
