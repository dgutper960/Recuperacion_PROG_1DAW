package Tema_7.Actividad_7_4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/** Esta es la clase main donde vamos definir el código para Importar nuestro xml */

public class ImportarXML {
    public static void main(String[] args) {
        // Bloque try para el manejo de errores
        try {
            // Instancia de File, indica la ruta del archivo
            File file = new File("C:/contactosImp.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            // Normalizamos el documento
            doc.getDocumentElement().normalize();

            // Con NodeList obtenemos los nodos indicando el nodo raíz
            NodeList nodeList = doc.getElementsByTagName("Contacto");

            /* Recorremos el documento con un for usando el método específico para NodeList,
            nodeList.getLength() para obtener el tamaño */
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoContacto = (Element) node;

                    /* Obtenemos los valores de nombre, direccion y telefono indicando el nombre del respectivo tag
                    * y guardándolo como valor de su respectiva variable */
                    String nombre = elementoContacto.getElementsByTagName("Nombre").item(0).getTextContent();
                    String direccion = elementoContacto.getElementsByTagName("Direccion").item(0).getTextContent();
                    String telefono = elementoContacto.getElementsByTagName("Telefono").item(0).getTextContent();

                    // Imprimimos los valores (i+1) porque empiezan desde 0
                    System.out.println("Contacto " + (i + 1));
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Teléfono: " + telefono);
                    System.out.println();
                }
            }
            // En caso de error
        } catch (Exception e) {
            // Se usa este método para imprimir la traza de la excepción en la salida de error estándar
            e.printStackTrace();
        }
    }
}