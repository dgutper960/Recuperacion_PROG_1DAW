package Tema_7.Actividad_7_2;

/** Se pide realizar un programa que haga lo siguiente:

 1. Crea un fichero llamado alumnos.txt dentro de una nueva carpeta con nombre 1DAW,
    controlando que si ya existe no haga nada. La carpeta debe estar en la raíz de tu usuario.
 2. Introduce los nombres de los alumnos de la clase, una alumno por línea del fichero.
    Utiliza un buffer para realizar esta operación
 3. Copia (lee y escribe) el contenido del anterior fichero a uno nuevo con nombre prog.txt
 4. Renombra el fichero a prog_codificado.txt En este último fichero, añade al final un alumno nuevo
 5. Sustituye el segundo y tercer caracter del nombre de cada alumno por una X */

/** Antes de nada debemos importar las clases correspondientes */
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException, FileAlreadyExistsException {
        /** 1 */
        /* Creamos un objeto de la Clase File que se llama archivo y le damos como argumento una ruta del equipo */
        File archivo = new File("I:\\David\\A recu Programación\\Documentos\\1DAW\\alumnos.txt");
        /* El objeto File proporciona métodos para leer y escribir datos en el archivo, como abrir el archivo,
        obtener información sobre él (por ejemplo, el tamaño, el tipo de archivo, etc.) y cerrarlo  */

        /** 2 */
        /* Creamos un objeto de la clase FileOutputStream llamado listaAlumnos
        * el nuevo objeto toma como argumento el objeto archivo */
        FileOutputStream listaAlumnos = new FileOutputStream(archivo);
        /*  Crea un objeto BufferedOutputStream llamado bufer, que envuelve el objeto listaAlumnos.
            El nuevo objeto agrega un búfer a un flujo de salida, lo que ayuda a acelerar la escritura
            al reducir el número de llamadas al sistema de archivos */
        BufferedOutputStream bufer = new BufferedOutputStream(listaAlumnos);
        bufer.write("Pablo Mateos Palas\n".getBytes());
        bufer.write("David Gutiérrez Pérez\n".getBytes());
        /* getBytes() toma el String y lo convierte a arreglo de bytes */
        bufer.write("Juan María Mateos Ponce\n".getBytes());
        /* write toma el arreglo de bytes y lo usa para escribir en el archivo a través del bufer */
        bufer.write("Jossie Allisson Yovera Consuelo\n".getBytes());
        bufer.write("Victor Chacón Calle\n".getBytes());
        bufer.write("José Ramirez Sanchez\n".getBytes());
        bufer.write("Jorge Coronil Villalba\n".getBytes());
        bufer.write("Ricardo Gabriel Moreno Cantea\n".getBytes());
        bufer.write("Adrián Merino Gamaza\n".getBytes());
        bufer.write("Juan Manuel Herrera Ramírez\n".getBytes());
        bufer.write("Daniel Alfonso Rodríguez Santos\n".getBytes());
        bufer.write("Diego González Romero\n".getBytes());
        bufer.write("Jonathan León Canto\n".getBytes());
        bufer.write("Juan Manuel Saborido Baena\n".getBytes());
        bufer.write("Julian García Velázquez\n".getBytes());
        bufer.write("Jose Antonio Jaén Gómez\n".getBytes());
        bufer.write("Antonio Jesús Téllez Perdigones\n".getBytes());
        /* Cerramos el bufer */
        bufer.close();
        /* Cerramos el objeto listaAlumnos */
        listaAlumnos.close();

        /** 3 */
        /* Se crea un objeto FileInputStream que se abre en el archivo original que se desea copiar*/
        FileInputStream fisParaCopiar = new FileInputStream(archivo);
        /* e crea un objeto FileOutputStream que se abre en un archivo de destino  */
        FileOutputStream fosParaCopiar = new FileOutputStream("I:\\David\\A recu Programación\\Documentos\\1DAW\\prog.txt");
        /* Con esto, creamos el buffer */
        byte[] bufferArchivo = new byte[1024]; /* Array de byte del tamaño 1024 */
        int longitudBuffer; // Variable tipo int para usarla en el while como longitud del buffer
        // La variable se inicializa con el tamaño de bufferArchivo
        while ((longitudBuffer = fisParaCopiar.read(bufferArchivo)) > 0) { // Mientas longitudBuffer sea mayor a 0, el bucle continúa
            fosParaCopiar.write(bufferArchivo, 0, longitudBuffer);
        } // Leyenda -> 1
        fisParaCopiar.close(); // Cerramos el fis
        fosParaCopiar.close(); // Cerramos el fos


        /** 4 */
        Files.move(Path.of("I:\\David\\A recu Programación\\Documentos\\1DAW\\prog.txt"), Path.of("I:\\David\\A recu Programación\\Documentos\\1DAW\\prog_codificado.txt"));

        /** 5 */
        Files.write(Path.of("I:\\David\\A recu Programación\\Documentos\\1DAW\\prog_codificado.txt"), "Sócrates Sofronisco de Atenas".getBytes(), StandardOpenOption.APPEND);
    }
}


    /** Leyenda 1--> Se explican los argumentos del método write:
     *
     *  # byte[] b: Este es el contenido del bufer de bytes que contiene los datos leídos del archivo original.
     *  En este caso, b es el mismo objeto bufferArchivo que se pasa como argumento al método read().
     *
     *  # int off: Este argumento representa la posición de inicio en el flujo de salida.
     *  En este caso, el valor 0 indica que los datos se escriben desde el inicio del flujo de salida.
     *
     *  # int len: Este argumento representa la longitud de los datos a escribir en el flujo de salida.
     *  En este caso, el valor longitudBuffer indica cuántos bytes se leyeron en la iteración actual del bucle
     *  y, por lo tanto, cuántos bytes se deben escribir en el archivo de destino. */