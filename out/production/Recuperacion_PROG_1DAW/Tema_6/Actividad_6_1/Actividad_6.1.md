## A6.1. Excepciones


### 1. ¿Cuál es el nombre en Java de la clase que define las excepciones, y de la que debe heredar cualquier clase que queramos usar para representar una excepción?

    - Excepcion


### 2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al invocar un método de un objeto cuyo valor es “null”?

    - NullPointerException



### 3. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al obtener un comportamiento anómalo en la entrada / salida de información?

    - IOException


### 4. Observa el siguiente fragmento de código:

String [] array_string = new String [25];
System.out.println (array_string [3].length());

¿Qué excepción se produciría en el mismo?

    - Producirá la excepción NullPointerException. Ya que el índice 3 va a tener un valor null.


### 5. Observa el siguiente fragmento de código:

String aux = “hola”;
int aux2 = Integer.parseInt (aux);

¿Qué sucedería al ejecutar el mismo?

    - Que no podemos pasar a Integer una cadena de texto como hola, para pasar un String a Integer, la cadena de texto debe estar compuesta por un valor numérico. Ej.- “2” o ”43” y no “tres” o “treinta y uno”.


### 6. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:

Recibe como parámetros una cadena (String) y un entero (int);
Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length(): int” de la clase “String”) devuelve el carácter en la posición correspondiente (puedes hacer uso del método “charAt(int)” de la clase “String”).
En caso contrario, construye y lanza una excepción de tipo “Exception”. 