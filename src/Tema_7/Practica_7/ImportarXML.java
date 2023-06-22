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
        try {
            // Creamos el objeto inputFile de tipo File dando la ruta como argumento
            File inputFile = new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Practica_7\\Alumnos1DAW.xml");
            // Instanciamos objeto de DocumentBuilderFactory
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            // Seleccionamos el elemento alumno (hijo de la raíz Alumnos)
            NodeList nList = doc.getElementsByTagName("alumno");
            // Iteración sobre esta lista y se extrae la información del nombre y el atributo "intervenciones"
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element alumno = (Element) nList.item(temp);
                // Inicializamos las respecivas variables
                String nombre = alumno.getTextContent();
                int intervenciones = Integer.parseInt(alumno.getAttribute("intervenciones"));

                // En este print se procesan los datos importados
                System.out.println(nombre + "Intervenciones: " + intervenciones);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}