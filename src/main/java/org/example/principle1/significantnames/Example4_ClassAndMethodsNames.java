package org.example.principle1.significantnames;

import java.time.LocalDate;
import java.util.Date;

/**
 * Cuando nombramos clases y metodos se debe tener en cuenta que existe unas normas para hacerlo
 */
public class Example4_ClassAndMethodsNames {
    /**
     * 1. Para nombrar clases deben utilizarse un nombre o cojunto de nombres pero sin utilizar verbos
     * 2. Los nombres de los metodos deberian ser verbos, indicando una accion
     */

    public class DateParser { // nombre de clase

        public LocalDate parseDate(String dateString) { // Nombre de metodo
            return LocalDate.parse(dateString);
        }
    }

    /**
     * Notar que la clase especifica un nombre donde no se utiliza ningun verbo, pero en el metodo si se especifica
     * uno nombre con un verbo, indicando una accion.
     */
}
