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
    /* Creamos el método para escribir los datos en nuestro xml */
    public static void exportarXML(){
        /* Abrimos un bloque try */
        try {
            /* Creamos objeto File y damos el dierctorio */
            File inputFile = new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAW.xml");

            /*Se crea una instancia de DocumentBuilderFactory para obtener un DocumentBuilder,
             que se utiliza para analizar y construir un objeto Document a partir del archivo XML de entrada*/
            DocumentBuilderFactory bdFactory = DocumentBuilderFactory.newInstance();
            /* Se analiza el archivo XML utilizando el DocumentBuilder,
            y se normaliza el documento para asegurarse de que esté en un estado coherente. */
            DocumentBuilder dBuilder = bdFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            /* Se crea una instancia de TransformerFactory para obtener un Transformer,
            que se utiliza para realizar la transformación del documento XML. */
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            /* Se establece la propiedad de salida del Transformer para que el resultado tenga sangría y sea más legible. */
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            /* Se crea un objeto DOMSource utilizando el documento XML analizado. */
            DOMSource source = new DOMSource(doc);
            /* Se crea un objeto StreamResult para especificar el archivo de salida XML. En este caso,
            se proporciona una ruta absoluta al archivo "Alumnos1DAWExp.xml". */
            StreamResult result = new StreamResult(new File("I:\\David\\A recu Programación\\Documentos\\Documentos Pract_7\\Alumnos1DAWExp.xml"));
            /* Se invoca el método transform() del Transformer para realizar la transformación del documento y generar el archivo de salida XML. */
            transformer.transform(source, result);
            /* Se muestra un mensaje en la consola para indicar que la exportación del XML se ha realizado exitosamente */

            System.out.println("XML exportado exitosamente\n");

            /* Si ocurre alguna excepción durante el proceso de exportación, se imprime la traza de la excepción utilizando el método printStackTrace(). */
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
