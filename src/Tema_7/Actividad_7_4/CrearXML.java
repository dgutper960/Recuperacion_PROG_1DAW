package Tema_7.Actividad_7_4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

/** En esta clase main vamos a definir el código que necesitamos para crear nuestro xml
 * con la información de nuestras personas */

public class CrearXML {
    public static void main(String[] args) {

        /* Creamos una lista de contactos y añadimos personas a nuestra lista */
        ArrayList<Persona> listaContactos = new ArrayList<>();
        listaContactos.add(new Persona("Ariadna", "699635541", "Calle Tatooine"));
        listaContactos.add(new Persona("Dark Luck", "696969696", "Death Star S/N"));
        listaContactos.add(new Persona("Pablo Escobas", "666000666", "Mansión Bogotá 234"));
        /* Abrimos un bloque try, ya que vamos a manejar excepciones más adelante */
        try {
            // Creamos una instancia de DocumentBulderFactory
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Con esto, creamos un nuevo documento
            Document doc = docBuilder.newDocument();
            // El elemonto raiz de nuestro documento, se llamará "Contactos"
            Element ElementoRaiz = doc.createElement("Contactos");
            doc.appendChild(ElementoRaiz);

            /* Usamos un foreach para añadir contactos  */
            for (Persona persona : listaContactos) {
                // Indicamos el nombre del nuevo tag que será Contacto
                Element contacto = doc.createElement("Contacto");
                // Indicamos que será un hijo de Contactos el cual es elemento raíz -> 'ElementoRaiz.appendChild(contacto)'
                ElementoRaiz.appendChild(contacto);

                /* Repetimos la operación, pero esta vez con Nombre, Direcion y Telefono
                * Todos ellos hijos de contacto -> 'contacto.appendChild(_tag_correspondiente_)'*/
                Element nombre = doc.createElement("Nombre");
                nombre.appendChild(doc.createTextNode(persona.getNombre()));
                contacto.appendChild(nombre);

                Element direccion = doc.createElement("Direccion");
                direccion.appendChild(doc.createTextNode(persona.getDireccion()));
                contacto.appendChild(direccion);

                Element telefono = doc.createElement("Telefono");
                telefono.appendChild(doc.createTextNode(persona.getTelefono()));
                contacto.appendChild(telefono);
            }  // Aquí cierra el bloque foreach

            // Para crear el archivo xml, instanciamos TransformerFactory.newInstance()
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // Se crea un objeto DOMSource a partir del documento doc
            DOMSource source = new DOMSource(doc);
            // Damos la ruta para el archivo que se va a crear
            StreamResult result = new StreamResult(new File("C:/contactos.xml"));
            transformer.transform(source, result);
            // Esto es simplemente para dar un feedback al usuario
            System.out.println("El archivo XML ha sido creado con éxito");
        // En caso de que se produzca una excepción, se imprime la traza de la excepción utilizando el método printStackTrace().
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}