package Tema_7.Practica_7;

/** Esta será la Clase Main de nuestro proyecto, donde ejecutaremos nuestro código
 * Lo iremos explicando por pasos */

import java.util.Scanner;

import static Tema_7.Practica_7.SeleccionarAlumnos.seleccionarAlumnos;
import static Tema_7.Practica_7.ReiniciarIntervenciones.reiniciarIntervenciones;
import static Tema_7.Practica_7.ExportarXML.exportarXML;
import static Tema_7.Practica_7.ImportarXML.importarXML;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú");
            System.out.println("1. Importar fichero XML");
            System.out.println("2. Exportar fichero XML");
            System.out.println("3. Seleccionar miembro de la clase");
            System.out.println("4. Reiniciar intervenciones");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Introduce una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    importarXML(nombreBD, nombreTabla, rutaImportarXML);
                    break;
                case 2:
                    exportarXML(nombreBD, nombreTabla, rutaExportarXML);
                    break;
                case 3:
                    seleccionarAlumnos();
                    break;
                case 4:
                    reiniciarIntervenciones();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println();
            }
        } while (opcion != 5);
    }
}