package org.example.principle6.unittest;


import org.example.common.exceptions.DivisionByZeroException;

/**
 * Los test unitarios son tan importantes como el codigo en si, ya que permite probar que las funcionalides se desarrollen
 * segun lo esperado, y permiten que la refactorizacion de codigo se haga de una forma segura.
 *
 * A continuacion vemos una clase que contiene unos metodos que realiza operaciones matematicas la cual se tiene que probar
 * por medio de test unitarios.
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

    /**
     * Es comun que los test relacionados a cada clase esten ubicados en la carpeta de Test, en el mismo nombre de paquete
     * y con el mismo nombre de clase mas la palabra "Test". Esto con el proposito de identificar claramente la relacion de
     * los test con la calse que esta deseando probar.
     *
     * Para continaur con la explicacion ver la clase de Example1_calculatorTest que se encuenta en la carpeta test
     */
}
