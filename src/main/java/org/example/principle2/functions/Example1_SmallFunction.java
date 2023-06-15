package org.example.principle2.functions;

/**
 * Los metodos/funciones deben ser lo mas pequeñas posibles, tanto, como para que solo tengan una responsabilidad o proposito.
 */
public class Example1_SmallFunction {

    /**
     * Supongamos que tenemos que crear una funcion que reciba un arreglo de numeros, donde se debe validar que todos los numeros
     * sean de un solo digito y positivos (0-9), y si cumple con la condicion, se debe devolver la suma de todos los numeros, y si no se
     * cumple con la condicion se debe devolver un numero negativo.
     */

    // Ejemplo que NO sigue el principio
    public Integer validatePositiveNumbersAndGetSummation(Integer[] array) {
        boolean valid = true;

        for (Integer numTemp : array) {
            if (numTemp <= 0 || numTemp >= 9) {
                valid = false;
                break;
            }
        }

        Integer sum = 0;
        if (valid) {
            for (Integer numTemp : array) {
                sum += numTemp;
            }
        }
        else {
            sum = -1;
        }

        return sum;
    }

    /**
     * Vemos que tenemos una sola funcion que tiene toda la logica, y se ve que se hacen multiples operaciones en la misma
     * funcion. Y lo ideal es que solo hagamos una cosa por metodo o funcion.
     */


    // Ejemplo que SI sigue el principio
    public Integer getArraySummation(Integer[] array) {
        Integer sum;

        if (validateArray(array))
        {
            sum = calculateSummation(array);
        }
        else {
            sum = -1;
        }
        return sum;
    }

    public boolean validateArray(Integer[] array) {
        boolean validArray = true;

        for (Integer numTemp : array) {
            if (!isPositiveNumber(numTemp) || !isOneDigitNumber(numTemp))
            {
                validArray = false;
                break;
            }
        }

        return validArray;
    }

    public boolean isPositiveNumber(Integer num) {
        return num >= 0;
    }

    public boolean isOneDigitNumber(Integer num) {
        return num >= 0 && num <= 9;
    }

    public Integer calculateSummation(Integer[] array) {
        Integer sum = 0;

        for (Integer numTemp : array) {
            sum += numTemp;
        }

        return sum;
    }

    /**
     * Vemos como se separan los metodos/funciones hasta el punto en que se haga una sola cosa, Por ejemplo el metodo de
     * validacion hubiera podido ser uno, pero recordemos que la validacon de un array, en pocas palabras es validar cada uno
     * de los numeros que hay dentro de el, por esta razon se decide crear funciones independientes para la validacion de los
     * numeros por serparado y despues se utilizan dentro de una funcion mas grande para validar el array.
     *
     * El objetivo final es tener multiples funciones que hagan una sola cosa, para poder ser reutilizadas en otras funciones
     * mucho mas grandes que requieran dicha operacon puntual.
     */
}
