package Tema_7.Defensa_UD7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Importar {

    // Definimos el método
    public static void importar(){
        // Abrimos bloque try
        try{
            // Instanciamos el File
            File inputFile = new File("I:\\David\\A recu Programación\\Recuperacion_PROG_1DAW\\src\\Tema_7\\Defensa_UD7\\XML.xml");

            // Instanciamos DocumentBuldierFactory y normalizamos
            DocumentBuilderFactory XMLFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder XMLBuldier = XMLFactory.newDocumentBuilder();
            Document doc = XMLBuldier.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Instanciamos un NodeList para seleccionar el elemento deseado
            NodeList nList = doc.getElementsByTagName("alumno");
            // Iteramos sobre todos los elemetnos "alumno" para extraer sus elementos hijo
            for (int temp = 0; temp < nList.getLength(); temp++){
                // Se exprae el valor del elemento
                Element alumno = (Element) nList.item(temp);
                // Se inicializa las variables con el contenido del elemento
                String nombre = alumno.getTextContent();
                int intervenciones = Integer.parseInt(alumno.getAttribute("intervenciones"));

                // Print para procesar los datos importados
                System.out.println(nombre+"Intervenciones: "+intervenciones);
            } // cerramos bloque try y abrimos el catch
        } catch (Exception e){
            e.printStackTrace();  // Seleccionamos la acción para una excepción de tipo Exception
        }

    }




}
