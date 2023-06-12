package org.example.principle1.significantnames;

/**
 * En ocaciones es muy importante agregar o adicionar contexto para dar mayor detalle del proposito
 */
public class Example5_AdditionalContext {

    /**
     * Supongamos que tenemos una clase de empleado donde se tienen los datos basicos del empleado y ademas
     * se debe tener la informacion de la de envio o domicilio teniendo en cuenta que puede ser diferente
     * a la del empleado. Entonces lo mas correcto es que para la inforamcion de domiclio se agregue una palabra
     * que le agregue contexto, esta palabra puede ser "delivery".
     */
    public class Employee {
        private String firstName;
        private String lastName;

        private String deliveryFirstName;
        private String deliveryLastName;
    }
}
