package org.example.principle6.unittest;

import org.example.common.DivisionByZeroException;

/**
 * Los test unitarios son tan importantes como el codigo en si, ya que permite probar que las funcionalides se desarrollen
 * segun lo esperado, y permiten que la refactorizacion de codigo se haga de una forma segura.
 *
 * A continuacion vemos una clase que contiene unos metodos que realiza operaciones matematicas la cual se tiene que probar
 * por medio de test unitarios. Estos test unitarios estan en la carpeta de test
 */
public class Example1_calculator {

    public Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double divide(Double num1, Double num2) {
        if (num2 == 0)
            throw new DivisionByZeroException("The second number is 0. You can't divide by zero.");

        return num1 / num2;
    }
}
