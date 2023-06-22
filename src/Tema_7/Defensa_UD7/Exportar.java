package Tema_7.Defensa_UD7;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Exportar {

    public static void exportarXML(){
        // Abrimos bloque try
        try{
            // Instanciamos un File y le damos la ruta de acceso
            File inputFile = new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Defensa_UD7\\XML.xml");

            // Damos los pasos para obtener un objeto Document que representa la estructura del XML y normalizarlo
            DocumentBuilderFactory XMLFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder XMLBuldier = XMLFactory.newDocumentBuilder();
            Document doc = XMLBuldier.parse(inputFile);
            doc.getDocumentElement().normalize();


            // Se crea el objeto Transformer y se establece la propiedad de salida en yes para una estructura indentada
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            // Encapsulamos el objeto Document y especificamos un directorio de salida
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Defensa_UD7\\ExportarXML.xml"));
            transformer.transform(source, result);

            System.out.println("XML exportado\n");
            // cerramos bloque try y abrimos bloque catch para capturar la exeception
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
