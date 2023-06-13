package org.example.principle1.significantnames;

/**
 * Cuando no referimos a nombres pronunciables corresponde a nombres que se puedan entender a simple lectura que
 * significan, sin abreviar o acortar palabras que no sean claras.
 */
public class Example3_PronounceableNames {

    /**
     * Supongamos que tenemos que crear una clase de empleados
     */

    // Ejemplo que NO cumple con el principio
    public class Emp {
        private String nm;
        private String lnm;
    }

    // Ejemplo que SI cumple con el principio
    public class Employee {
        private String name;
        private String lastName;
    }

    /**
     * Notar que en ejemplo que no cumple, los nombres son acortados por lo cual no permite conocer claramente
     * el proposito de la clase y los atributos.
     */

    //------------------------------------------------------------------------------------------------------

    /**
     * Supongamos que necesitamos crear un campo/atributo para guardar el nombre menos usado del empleado.
     */

    // Ejemplo que No cumple con el proposito
    private String lstUsedName;

    // Ejemplo que sI cumple con el principio
    private String leastUsedName;

    /**
     * Notar que aunque en el primer ejemplo se trato de dar un mejor contexto, no es claro saber si la abreviacion
     * "lst" corresponde a "least" o "last", lo cual cada opcion cambia el contexto complemente. Por eso es mejor utilizar
     * un nombre explicito a si sea un poco largo, a utilizar un nombre corto que no aclare bien el contexto.
     */
}
