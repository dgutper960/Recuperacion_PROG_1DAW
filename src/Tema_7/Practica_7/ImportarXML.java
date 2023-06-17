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
            File inputFile = new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Practica_7\\Alumnos1DAW.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("alumno");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element alumno = (Element) nList.item(temp);
                String nombre = alumno.getTextContent();
                int intervenciones = Integer.parseInt(alumno.getAttribute("intervenciones"));

                // Procesar datos importados
                System.out.println(nombre + "Intervenciones: " + intervenciones);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}