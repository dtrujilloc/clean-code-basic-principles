package org.example.principle1.significantnames;

import java.util.Map;

/**
 * El segundo ejemplo corresponde a tener nombres acorde al proposito de creacion y no utilizar palabras que puedan
 * desinformar o distorcionar el contexto.
 */
public class Example2_DoNotMisinform {
    /**
     * Supongamos que tenemos que crear una variable de tipo Map el cual guarda un entero que representa el id
     * de un empleado y una cadena que corresponde al nombre del empleado.
     */

    // Ejemplo que SI sigue el principio
    private Map<Integer, String> employeeList;

    // Ejemplo que SI sigue el principio
    private Map<Integer, String> employees;
    private Map<Integer, String> employeeMap;
    private Map<Integer, String> employeeInfo;

    /**
     * Notar que el echo de colocar la palabra "List" estamos desinformando, y esto puede causar confucion para
     * otros desarrolladores al pensar que estan trabajando con una lista pero en realidad es un mapa
     */

    //----------------------------------------------------------------------------------------------------------

    /**
     * Supongamos que tenemos que crear una clase que me permita agrupar la informacion de un producto para guardar
     * en la BD y otra clase que me permita devolver la informacion al usuario de un producto
     */

    // Ejemplo que NO cumple el principio
    public class ProductData { }

    public class ProductInfo { }


    // Ejemplo que SI cumple el principio
    public class ProductEntity { }

    public class ProductDto { }

    /**
     * Notar que en el ejemplo que no cumple el principio, no es claro cual clase corresponde a cada caso, es decir, Info
     * y Data pueden ser lo mismo, y despues cuando el codigo cresca sera muy dificil saber el proposito de cada uno. Por otro
     * lado en la ejemplo siguiente, se utiliza Entity como contexto, ya que regularmente las entidades estan relacionadas con
     * la BD, y Dto con la informacio que devuelve o recibe de un cliente
     */
}
