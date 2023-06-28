package org.example.principle5.errormanagement;

/**
 * Cuando sea necesario lanzar excepciones, es importante lanzar excepciones que sean Uncheck, es decir, excepciones que extiendan
 * de RuntimeException, esto permite que la excepcion sea tratada cuando el desarrollo lo requiera y que el codigo sea vea mas
 * lipio
 */

import org.example.common.exceptions.InvalidNameException;
import org.example.common.exceptions.YoungerException;
import org.example.common.runtimeexceptions.InvalidNameRuntimeException;
import org.example.common.runtimeexceptions.YoungerRuntimeException;

/**
 * Supongamos el mismo ejemplo anterior que tenemos que devolver un saludo con el nombre del usuario pasado como parametro, solo si el nombre tiene mas de 5 letras
 * y si la edad es mayor de 18 años.
 */

// Ejemplo con Excepciones Checked
class ExampleC {

    public void printNameSafely(String name, Integer age) {
        try {
            printNameC(name, age);
        } catch (YoungerException ex) {
            System.out.println("Error, en la validacion de edad");
        } catch (InvalidNameException ex) {
            System.out.println("Error en la validacion de nombre");
        }
    }

    public void printNameC(String name, Integer age) throws YoungerException, InvalidNameException {
        isAdultC(age);
        isValidNameC(name);
        System.out.println(String.format("Hola %s, es un gusto saludarte", name));
    }

    public boolean isAdultC(Integer age) throws YoungerException {
        if (age < 18) {
            throw new YoungerException("Error, es menos de edad");
        }

        return true;
    }

    public boolean isValidNameC(String name) throws InvalidNameException {
        if(name.length() < 5)
        {
            throw new InvalidNameException("Error, el nombre es invalido. Tiene menos de 5 caracteres");
        }

        return true;
    }

    /**
     * Observar que cuando lanzamos excepciones checked (excepciones que extienden de Exception) es obligacion indicar
     * en el metodo que sera lanzada una excepcion si no es tratada en el mismo metodo, esto se puede ver a lado del nombre
     * del metodo con la palabra reservada "throws". Podemos ver que esto ensucia el codigo ya que en todos los metodos en que
     * no se trata la excepcion es obligatorio indicar que sera lanzada.
     */
}

// Ejemplo con Excepciones Unchecked
class ExampleD {

    public void printNameSafely(String name, Integer age){
        try {
            printNameD(name, age);
        } catch (YoungerRuntimeException ex) {
            System.out.println("Error, en la validacion de edad");
        } catch (InvalidNameRuntimeException ex) {
            System.out.println("Error en la validacion de nombre");
        }
    }

    public void printNameD(String name, Integer age) {
        isAdultD(age);
        isValidNameD(name);
        System.out.println(String.format("Hola %s, es un gusto saludarte", name));
    }

    public boolean isAdultD(Integer age) {
        if (age < 18) {
            throw new YoungerRuntimeException("Error, es menos de edad");
        }

        return true;
    }

    public boolean isValidNameD(String name) {
        if(name.length() < 5)
        {
            throw new InvalidNameRuntimeException("Error, el nombre es invalido. Tiene menos de 5 caracteres");
        }

        return true;
    }

    /**
     * Notar que con las excepciones Unchecked (Excepciones que extienden de RuntimeException) no es necesario indicar en los
     * metodos que se va a lanzar una excepcion, es decision del programador el momento y lugar donde sera tratada las excepciones.
     */
}
