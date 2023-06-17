package Tema_7.Practica_7;
/** Esta clase será para nuestros datos de entrada
 * debemos importar todas las clases necesarias */
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ExportarXML {
    public static void exportarXML() {
        try {
            // Instanciamos un objeto de File y damos la ruta para el archivo xml, el cual, será creado en nuestro paquete de la Práctica
            File inputFile = new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Practica_7\\Alumnos1DAW.xml");

            /* Instanciamos un objeto DocumentBuilderFactory
            para construir un objeto Document a partir de una fuente de entrada XML*/
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            /* Instanciamos TransformerFactory para establecer propiedades de salida al transformar un documento XML. */
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            /* Encapsulamos el objeto con DOMSource y damos la ruta que será también en el paquete de la práctica  */
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Practica_7\\Alumnos1DAWExp.xml"));
            transformer.transform(source, result);

            System.out.println("XML exportado exitosamente");
            System.out.println();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}