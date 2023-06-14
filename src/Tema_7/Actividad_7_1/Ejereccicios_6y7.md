### Clases para manejar flujos de bytes

#### FileOutputStream:
- Clase que permite escribir datos binarios en un archivo. 
- Esta clase forma parte del paquete java.io.
- Es útil para trabajar con archivos binarios, como cualquier otro tipo de archivo que no sea de texto (imágenes, audio, etc).
  - Ejemplo para usar FileOutputStream:
```` java
    byte[] data = ...
    FileOutputStream out = new FileOutputStream("the-file-name");
    out.write(data);
    out.close();
````

#### BufferedOutputStream:
- Forma parte del paquete java.io
- Es una subclase de OutputStream.es 
- Su objeto es simplificar la escritura de texto en un flujo binario y mejorar el rendimiento del programa 
al utilizar un buffer interno para almacenar los datos antes de escribirlos en el flujo de salida.
- Utiliza un array interno de bytes llamado buffer para almacenar los datos.
- Durante la escrituraCuando se llama al método flush() de BufferedOutputStream, 
se vaciará el buffer y se escribirán los bytes directamente en el flujo de salida subyacente.
- Esto evita copiar datos innecesariamente en casos donde se utilizan múltiples instancias.
  - Ejemplo de cómo utilizar BufferedOutputStream para escribir datos en un archivo:

```` java 
  import java.io.BufferedOutputStream;
  import java.io.FileOutputStream;
  import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hola, mundo!";
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] bytes = data.getBytes();
            bos.write(bytes);
            bos.flush();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````

### Clases para manejar flujos de caracteres:

#### FileWriter
- Se utiliza para escribir datos en forma de caracteres en archivos. 
- Pertenece al paquete java.io y se encuentra dentro del paquete java.io.FileWriter.
- A continuación, se presentan diferentes enfoques para escribir en un archivo:
* FileWriter: La clase FileWriter permite escribir datos en formato de caracteres en archivos
```` java
    FileWriter writer = new FileWriter(file);
    writer.write("Hello, World!");
    writer.close();
```` 

  * BufferedWriter: Puedes utilizar BufferedWriter en combinación con FileWriter para escribir texto en un archivo de manera más eficiente.
```` java 
    FileWriter writer = new FileWriter(fileName);
    BufferedWriter bufferedWriter = new BufferedWriter(writer);
    bufferedWriter.write("Hello, World!");
    bufferedWriter.close();
    writer.close();
````
* PrintWriter: PrintWriter es otra opción para escribir texto en un archivo.
```` java 
    FileWriter fileWriter = new FileWriter(fileName);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.print("Some String");
    printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
    printWriter.close();
````

#### FileReader:
- Se utiliza para leer una secuencia de caracteres de archivos. 
- Esta clase hereda de InputStreamReader y crea un FileInputStream internamente.
- Para utilizar FileReader, primero debe importarla del paquete java.io
````java 
    import java.io.FileReader;
````
- Luego, puede crear una instancia de FileReader utilizando uno de sus constructores
````java 
    FileReader fileReader = new FileReader(path);
````


#### BufferedReader:
- Útil cuando se desea leer texto desde cualquier tipo de fuente de entrada.
- implementa el patrón Decorator, lo que significa que espera un objeto Reader en su constructor.
- Permite extender flexiblemente una instancia de una implementación de Reader.
- En lugar de usar directamente un FileReader, se puede utilizar un BufferedReader para 
mejorar la eficiencia y proporcionar funciones auxiliares para leer archivos.
* A continuación, se muestra un ejemplo de cómo utilizar BufferedReader para leer datos de un archivo:

````java 
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    
    public class BufferedReaderExample {
        public static void main(String[] args) {
            try {
                FileReader fr = new FileReader("input.txt");
                BufferedReader br = new BufferedReader(fr);
                String line;
    
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

````

#### PipeWriter:

- Es una clase que permite escribir en un flujo de caracteres (pipe) 
- Está diseñada para trabajar con la clase PipedReaderes.
- Es una subclase de Writer y proporciona métodos para escribir caracteres en un flujo de caracteres
- Primero debe conectarse a un objeto PipedReader utilizando el método connect(PipedReader destination)
- A continuación, puede utilizar los métodos ````write(char[] cbuf, int off, int len)```` y ````write(int c)```` para escribir caracteres en el flujo.
  - Ejemplo de cómo utilizar PipedWriter y PipedReader para enviar y recibir datos de texto en un flujo de caracteres:

````java
import java.io.*;

public class PipeExample {
    public static void main(String[] args) throws IOException {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);

        new Thread(new PipedWriterRunnable(pw), "Sender").start();
        new Thread(new PipedReaderRunnable(pr), "Receiver").start();
    }

    static class PipedWriterRunnable implements Runnable {
        PipedWriter pw;

        public PipedWriterRunnable(PipedWriter pw) {
            this.pw = pw;
        }

        public void run() {
            try {
                pw.write("Hola, mundo!");
                pw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static class PipedReaderRunnable implements Runnable {
        PipedReader pr;

        public PipedReaderRunnable(PipedReader pr) {
            this.pr = pr;
        }

        public void run() {
            try {
                String receivedData = new String(pr.read());
                System.out.println("Recibido: " + receivedData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

````


