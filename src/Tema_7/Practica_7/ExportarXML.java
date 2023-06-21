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
    public static void exportarXML(String nombreBD, String nombreTabla, String rutaExportarXML) {
        try {
            /** Instanciamos un objeto de File (para crear el archivo) y damos la ruta correspondiente,
            // el cual, será creado en nuestro paquete de la Práctica, el objeto tendrá el nombre de inputFile  */
            File inputFile = new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Practica_7\\Alumnos1DAW.xml");

            /** Se utiliza la configuración predeterminada de DocumentBuilderFactory para crear un DocumentBuilder y analizar un archivo XML.
             * Luego, se obtiene un objeto Document que representa la estructura del XML y se normaliza el documento.*/
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            /* Aquí se crea una instancia de la clase DocumentBuilderFactory utilizando el método estático newInstance().
             * Esta clase se utiliza para obtener una instancia de DocumentBuilder que se utiliza para analizar el archivo XML. */
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            /* Se crea un objeto DocumentBuilder utilizando el DocumentBuilderFactory creado anteriormente.
            Este objeto se utiliza para analizar el archivo XML y construir un objeto Document que representa la estructura del XML. */
            Document doc = dBuilder.parse(inputFile);
            /* Se analiza el archivo XML utilizando el método parse() en el objeto DocumentBuilder.
            El resultado de este análisis es un objeto Document que representa la estructura del XML. */
            doc.getDocumentElement().normalize();
            /* Se llama al método getDocumentElement() en el objeto Document para obtener el elemento raíz del XML.
            Luego, se llama al método normalize() en el elemento raíz para normalizar el documento. */

            /** Se crea un objeto Transformer utilizando la configuración predeterminada de TransformerFactory
             * y establece la propiedad de salida INDENT en "yes" para que el resultado de la transformación tenga una estructura indentada. */
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            /* Se crea una instancia de la clase TransformerFactory utilizando el método estático newInstance().
            Esta clase se utiliza para obtener una instancia de Transformer que se utiliza para realizar la transformación del documento XML. */
            Transformer transformer = transformerFactory.newTransformer();
            /* Se crea un objeto Transformer utilizando el TransformerFactory creado anteriormente.
            Este objeto se utiliza para realizar la transformación del documento XML. */
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            /* Se establece la propiedad de salida INDENT en "yes" utilizando el método setOutputProperty() en el objeto Transformer.
            Esto indica que el resultado de la transformación debe tener una estructura indentada. */

            /** Se utiliza un objeto DOMSource para encapsular el objeto Document y un objeto StreamResult para especificar el archivo de salida.
             * Luego, se realiza la transformación del documento XML utilizando el objeto Transformer. */
            DOMSource source = new DOMSource(doc);
            /* Se crea un objeto DOMSource utilizando el objeto Document (doc) creado anteriormente.
            Este objeto encapsula el documento XML y se utiliza como fuente para la transformación. */
            StreamResult result = new StreamResult(new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Practica_7\\Alumnos1DAWExp.xml"));
            /* Se crea un objeto StreamResult pasando como argumento un objeto File
            que representa el archivo de salida donde se guardará el resultado de la transformación.
            La ruta del archivo de salida se especifica en la cadena de caracteres proporcionada. */
            transformer.transform(source, result);
            /* Se llama al método transform() en el objeto Transformer para realizar la transformación del documento XML
            utilizando el objeto DOMSource como fuente y el objeto StreamResult como destino. */

            System.out.println("XML exportado exitosamente");
            System.out.println();

            /** Se inicia un bloque catch para capturar cualquier excepción que ocurra dentro del bloque try. */
        } catch (Exception e) { // A cualquier excepción de tipo Exception se asigna a la variable e
            /* Se utiliza el método printStackTrace() en el objeto e para imprimir la traza de la excepción en la consola.
            Esto mostrará la secuencia de llamadas de métodos que condujo a la excepción */
            e.printStackTrace();
        } // cerra el bloque catch
    } // cierre del método
} // cierre de la clase