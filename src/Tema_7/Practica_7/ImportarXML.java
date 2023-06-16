package Tema_7.Practica_7;

/** Esta será nuestra clase para importar desde nuestro documento Alumnos.xml */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ImportarXML {
    public static void importarXML() {
        /* Abrimos nuestro bloque try */
        try {
            /* Se crea una instancia de la clase File para representar el archivo de entrada XML que se va a importar. */
            File inputFile = new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAW.xml");
            /* Se crea una instancia de DocumentBuilderFactory para obtener un DocumentBuilder, que se utiliza para
            analizar y construir un objeto Document a partir del archivo XML de entrada */
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            /* Se analiza el archivo XML utilizando el DocumentBuilder,
            y se normaliza el documento para asegurarse de que esté en un estado coherente. */
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            /* Se obtiene una lista de nodos del tipo "alumno"
            utilizando el método getElementsByTagName() del objeto Document.
            Cada nodo de la lista representa un elemento "alumno" en el archivo XML. */
            NodeList nList = doc.getElementsByTagName("alumno");
            /* Se itera sobre la lista de nodos y se procesa cada nodo individualmente.
            Dentro del bucle, se convierte el nodo en un objeto Element, se obtiene el contenido de texto del nodo
            utilizando el método getTextContent(), y se obtiene el valor del atributo "intervenciones"
            del nodo utilizando el método getAttribute().
            El contenido de texto representa el nombre del alumno
            y el valor del atributo representa el número de intervenciones. */
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element alumno = (Element) nList.item(temp);
                String nombre = alumno.getTextContent();
                int intervenciones = Integer.parseInt(alumno.getAttribute("intervenciones"));

                /*  Procesamiento de los datos importados. En este caso,
                se muestra en la consola el nombre del alumno y el número de intervenciones */
                System.out.println(nombre + "Intervenciones: " + intervenciones);
            }
            // Si ocurre alguna excepción durante el proceso de importación
        } catch (Exception e) {
            // e imprime la traza de la excepción utilizando el método printStackTrace()
            e.printStackTrace();
        }
    }
}
