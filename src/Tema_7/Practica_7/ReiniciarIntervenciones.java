package Tema_7.Practica_7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ReiniciarIntervenciones {
    public static void reiniciarIntervenciones() {
        try {

            File inputFile = new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAW.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("alumno");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element alumno = (Element) nList.item(temp);
                alumno.setAttribute("intervenciones", "0");
            }
            System.out.println("Intervenciones de todos los alumnos reiniciadas");
            System.out.println();

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAW.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}