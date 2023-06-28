package org.example.principle5.errormanagement;

import java.util.List;

/**
 * No se debe retornar o devolver null en los metodos, ya que esto obliga a los programadores a hacer validaciones de
 * null en muchos puntos del codigo, cosa que no deberia suceder a menos que ese sea un respuesta esperada. Pero no
 * es conveniente devolver null.
 */
public class Example3_DoNotReturnNull {

    /**
     * Supongamos necesitamos imprimir los elementos de una lista, y esta lista se obtiene segun el parametro (topic) que se
     * le indique, y si no es un topico valido retorna un null en la lista.
     */

    // Ejemplo devolviendo un null
    public void printListA() {
        List<String> list = getListA("personas");

        if (list != null) {
            for (String stringTemp : list) {
                System.out.println(stringTemp);
            }
        }
    }

    public List<String> getListA(String topic) {
        switch (topic)
        {
            case "persons":
                return List.of("daniel", "esteban", "angela");
            case "animals":
                return List.of("dog", "cat", "mouse");
            case "things":
                return List.of("pencil", "eraser", "cellphone");
            default:
                return null;
        }
    }

    /**
     * Como vemos en el ejemplo anterior, el hecho de que el metodo getListA retorne un null cuando el topic (argumento) no
     * esta entre las opciones, nos obliga a validar  que la lista no sea null, ya que si es null va a generar una excepcion.
     *
     * Entonces, el hecho de devolver un null, nos obliga a estar validando ese null cada vez que utilicemos el metodo para evitar
     * una excepcion.
     */


    // Ejemplo sin devolver null
    public void printListB() {
        List<String> list = getListA("personas");

        for (String stringTemp : list) {
            System.out.println(stringTemp);
        }
    }

    public List<String> getListB(String topic) {
        switch (topic)
        {
            case "persons":
                return List.of("daniel", "esteban", "angela");
            case "animals":
                return List.of("dog", "cat", "mouse");
            case "things":
                return List.of("pencil", "eraser", "cellphone");
            default:
                return List.of();
        }
    }

    /**
     * Como vemos en el ejemplo anterior, en vez de devolver un null cuando el topic no es una opcion correcta, devolvemos
     * una lista vacia, esto permite que podamos quitar la validacion de null en el metodo principal ya que no se lanzara
     * una excepcion por valores null, otra opcion es lanzar una excepcion en vez de null.
     *
     * Cabe aclarar que es igual cuando pasamos null por los argumentos, ya que si pasamos un null, eso nos obliga a estar
     * validando valores null por todos lados. La idea es no devolver ni pasar null.
     */
}
