package Tema_6.practica6.ejercicio1;
/** Crea un método en cuyo código lances una excepción de tipo checked que consideres
 oportuna. Luego propágala indicando a quienes usan el método que puede lanzar esa
 excepción. Finalmente, llama a este método desde otro distinto y captura la excepción
 mostrando un mensaje personalizado contenido en la excepción.
 Aparte de la excepción anterior, haz que tu código del primer método pueda lanzar otra
 excepción más, en este caso una propia que tú te hayas creado y también captúrala junto a
 la otra. */

import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        /* Vamos a controlar el stock de un artículo */

        try {/** Llamada al método controlStock que usa la ExcepcionDavilillo */
            controlStock(1, 3, 100);
        } catch (ExcepcionDavilillo exDav){
            /* La ExcepcionDavilillo muestra el mensaje personalizado */
            System.out.println(" Se ha producido una exexpion personalizada: "+ exDav.getMessage());
        } catch (Exception x){
            System.out.println("Se ha producido una execpcion "+ x.getMessage());
        }
    }


    /* Definimos el método para comprobar si el stock está entre los límites definidos */
    public static int controlStock(int stock, int stockMin, int stockMax) throws Exception {
        if (stock < stockMin || stock > stockMax) {
            /* Si la condición se cumple llamamos a la ExcepcionDavilillo */
            throw new ExcepcionDavilillo("Atención!! Rotura de Stock");

        }return stockMin / stockMax;
    }
}

