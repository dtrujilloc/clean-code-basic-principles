package org.example.principle2.functions;


/**
 * Es importante siempre lanzar excepciones siempre que se presente un error y no devolver codigos de error. Esto es por que
 * con las excepcones ya estas mapeando un error que puede ser tratado por try-catch
 */

public class Example4_AlwaysThrowExceptions {

    /**
     * Supongamos que tenemos que devolver un saludo con el nombre del usuario pasado como parametro, solo si el nombre tiene mas de 5 letras
     * y si la edad es mayor de 18 años
     */

    // Ejemplo que NO cumple
    public void printNameA(String name, Integer age){

        if(isAdultA(age).equalsIgnoreCase("YES"))
        {
            if (isValidNameA(name).equalsIgnoreCase("VALID"))
            {
                System.out.println(String.format("Hola %s, es un gusto saludarte", name));
            }
            else
            {
                System.out.println("Error, no se puede realizar el saludo porque no es un nombre valido");
            }
        }
        else
        {
            System.out.println("Error, no se puede realizar el saludo porque no es mayor de edad");
        }
    }

    public String isAdultA(Integer age) {
        String valid;

        if (age >= 18) {
            valid = "YES";
        }
        else {
            valid = "NO";
        }

        return valid;
    }

    public String isValidNameA(String name) {
        String valid;

        if(name.length() >= 5)
        {
            valid = "VALID";
        }
        else {
            valid = "INVALID";
        }

        return valid;
    }

    /**
     * Notar como en la funcion principal se vuelve muy grande ya que las funciones de validacion solo devuelven codigos de error,
     * esto hace que tenga que se tratadas de una forma que vuelve el codigo mas sucio.
     */

    // Ejemplo que SI cumple
    public void printNameSafely(String name, Integer age){
        try {
            printNameB(name, age);
        } catch (YoungerException ex) {
            System.out.println("Error, en la validacion de edad");
        } catch (InvalidNameException ex) {
            System.out.println("Error en la validacion de nombre");
        }
    }

    public void printNameB(String name, Integer age) {
        isAdultB(age);
        isValidNameB(name);
        System.out.println(String.format("Hola %s, es un gusto saludarte", name));
    }

    public boolean isAdultB(Integer age) {
        if (age < 18) {
            throw new YoungerException("Error, es menos de edad");
        }

        return true;
    }

    public boolean isValidNameB(String name) {
        if(name.length() < 5)
        {
            throw new InvalidNameException("Error, el nombre es invalido. Tiene menos de 5 caracteres");
        }

        return true;
    }

    public class YoungerException extends RuntimeException {
        public YoungerException(String message) {
            super(message);
        }
    }

    public class InvalidNameException extends RuntimeException {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    /**
     * Notar como en este ejemplo, la funcion principal es mucho mas limpia ya que las excepciones son lanzadas desde las propias
     * funciones de validacion (junto con sus propias excepciones). Ademas, cabe resaltar que se deja una funcion que se encarga
     * del proceso de llamar las funciones y otra funcion que se encarga de tratar las excepcion, esto para respetar el nivel de
     * abstraccion de las funciones.
     */

}
