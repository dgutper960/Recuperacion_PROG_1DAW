package Tema_7.Practica_7;

/** Creamos esta clase que contendrá el método para seleccionar el alumno */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SeleccionarAlumnos {
    /* Este método se utiliza para seleccionar un alumno de un archivo XML y realizar operaciones basadas en la selección */
    public static void seleccionarAlumnos() {
        try {
            /* Se crea una instancia de la clase File para representar el archivo XML de entrada que contiene la lista de alumnos. */
            File inputFile = new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAW.xml");

            /* Se crea una instancia de DocumentBuilderFactory para obtener un DocumentBuilder, que se utiliza para analizar y construir un objeto Document a partir del archivo XML de entrada */
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            /* Se analiza el archivo XML utilizando el DocumentBuilder, y se normaliza el documento */
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            /* Se obtiene una lista de nodos del tipo "alumno" utilizando el método getElementsByTagName() del objeto Document. Cada nodo de la lista representa un elemento "alumno" en el archivo XML */
            NodeList alumnoList = doc.getElementsByTagName("alumno");

            /* Se crea una lista de elementos Element para almacenar los alumnos candidatos con el menor número de intervenciones. También se inicializa una variable menorIntervenciones con un valor máximo */
            List<Element> candidatos = new ArrayList<>();
            int menorIntervenciones = Integer.MAX_VALUE;
            /* Se itera sobre la lista de nodos utilizando un bucle for,
            y se obtiene el elemento Element correspondiente a cada nodo.
            Se obtiene el número de intervenciones del alumno utilizando el método getAttribute()
            y se convierte a un entero utilizando Integer.parseInt() */
            for (int i = 0; i < alumnoList.getLength(); i++) {
                Element alumnoElement = (Element) alumnoList.item(i);
                int intervenciones = Integer.parseInt(alumnoElement.getAttribute("intervenciones"));
                /* Si el número de intervenciones es menor que menorIntervenciones,
                se actualiza menorIntervenciones con el nuevo valor
                y se limpia la lista de candidatos para agregar el nuevo alumno como único candidato.
                Si el número de intervenciones es igual a menorIntervenciones,
                se agrega el alumno a la lista de candidatos. */
                if (intervenciones < menorIntervenciones) {
                    menorIntervenciones = intervenciones;
                    candidatos.clear();
                    candidatos.add(alumnoElement);
                } else if (intervenciones == menorIntervenciones) {
                    candidatos.add(alumnoElement);
                }
            }
            /* Si no hay candidatos disponibles (la lista de candidatos está vacía), se muestra un mensaje en la consola
             indicando que no hay alumnos disponibles y se retorna del método */
            if (candidatos.isEmpty()) {
                System.out.println("No hay alumnos disponibles");
                return;
            }

            // Se crea una instancia de Random para generar un número aleatorio
            Random random = new Random();
            // Se selecciona un alumno aleatorio de la lista de candidatos utilizando el método get()
            Element alumnoSeleccionado = candidatos.get(random.nextInt(candidatos.size()));
            // Se obtiene el nombre del alumno utilizando getElementsByTagName() y getTextContent()
            String nombreAlumno = alumnoSeleccionado.getElementsByTagName("nombre").item(0).getTextContent();
            // Mostramos por consola el nombre del alumno seleccionado
            System.out.println("Alumno seleccionado: " + nombreAlumno);
            System.out.print("¿Añadir una intervención? (+/0): ");
            // Creamos una instancia de scanner
            Scanner scanner = new Scanner(System.in);
            // Se inicializa respuesta con la línea de texto que el usuario introduzca por consola
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("+")) {

                int intervenciones = Integer.parseInt(alumnoSeleccionado.getAttribute("intervenciones"));
                alumnoSeleccionado.setAttribute("intervenciones", String.valueOf(intervenciones + 1));

                // Guarda el documento XML actualizado
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");

                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAW.xml"));
                transformer.transform(source, result);

                System.out.println("Intervención añadida exitosamente");
                System.out.println();
            } else if (respuesta.equalsIgnoreCase("salir")) {
                System.out.println("No ha sido añadida ninguna intervención");
                System.out.println();
            } else {
                System.out.println("No ha sido añadida ninguna intervención, vuelvo a seleccionar un alumno");
                System.out.println();
                seleccionarAlumnos();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}