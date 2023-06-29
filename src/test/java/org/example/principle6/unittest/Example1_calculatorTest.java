package org.example.principle6.unittest;

import org.example.common.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Las clases test suelen tener le mismo nombre de la clase que sequiere testear + la palabra test
 */
public class Example1_calculatorTest {

    // siempre es necesario crear una instancia de la clase que se desea probar
    private Example1_calculator example1_calculator;

    /**
     * Este metodo sirve para la inicializacion de variables ya que por medio de la etiqueta estamos diciendo que esto
     * se ejecuta antes de ejecuta cada uno de los test
     */
    @BeforeEach
    private void setup() {
        example1_calculator = new Example1_calculator();
    }

    /**
     * Para la construccion de los test se sigue un patron de desarrollo el cual es AAA. lo que propone este patron es que
     * el test debe dividirse en tres secciones.
     *      1- Arrange  (Inicializacion) -> inicializacion de todas los varoles que necesitesmo
     *      2- Act      (Actuar)         -> realizar la llamada al metodo a probar
     *      3- Assert   (Comprobar)      -> comprobar los resultados
     *
     * Tambien es muy importate que en los test se pruebe un solo flujo del metodo por test, sin combinar flujos en los test,
     * es decir si nuestro metodo tiene mas de un flujo se deberan hacer como minimo las misma cantidad de test, se pueden hacer tantos test como sean
     * necesarios para probar todas las posibilidades del test.
     */

    @Test
    public void multiplyTest() {
        // Arrange
        Double num1 = 2.0;
        Double num2 = 3.0;
        Double resultExpected = 6.0;

        // Act
        Double result = example1_calculator.multiply(num1, num2);

        // Assert
        Assertions.assertEquals(resultExpected, result);
    }

    /**
     * Como vemos en el metodo de division, existen dos flujos, uno que realiza la division cuando el segundo numero no
     * es cero, y otro flujo que lanza la exepcion cuando el segundo numero es cero, es por tal razon que se deben hacer
     * como minimo dos test que prueben cada  uno de los flujos.
     */
    @Test
    public void DivideSuccessTest() {
        // Arrange
        Double num1 = 6.0;
        Double num2 = 3.0;
        Double resultExpected = 2.0;

        // Act
        Double result = example1_calculator.divide(num1, num2);

        // Assert
        Assertions.assertEquals(resultExpected, result);
    }

    @Test()
    public void divideByZeroTest() {
        // Arrange
        Double num1 = 6.0;
        Double num2 = 0.0;
        String messageExceptionExpected = "The second number is 0. You can't divide by zero.";

        // Act
        DivisionByZeroException result = Assertions.assertThrows(DivisionByZeroException.class,
                () -> example1_calculator.divide(num1, num2));

        // Assert
        Assertions.assertEquals(messageExceptionExpected, result.getMessage());
    }

    /**
     * Como conclucion es muy importante tener los test unitarios que prueben cada una de nuestras funcionalidaes, ya que si
     * el dia de mañana se refactoriza alguna de los codigos de las funciones los test nos ayudaran a probar el codigo refactorizado.
     * Por ejemplo, supongamos que se hace una refactorizacion en el metodo de multiplicar, y el codigo queda mal, al ejecutar los test
     * nos daremos cuenta que el codigo quedo mal en la refactorizacion por que sin importar como se haga el codigo sabemos que la multiplicacion
     * de 2 * 3 = 6. que es lo que esta probando el test de multiplicacion. Entonces tendriamos un diagnostico pronto y rapido sobre la
     * funcionalidad.
     */
}
