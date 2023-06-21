package org.example.principle4.format.horizontal;

/**
 * La identacion es muy importante ya que permite ver los diferentes niveles de logica de nuestro codigo. permitiendo ser
 * mas comprensible
 */
public class Example2_Indentation {

    // Ejemplo de mala identacion
    public Integer addNumbersA(Integer num1,Integer num2,Integer num3) {
    if(num1==null||num2==null||num3==null){
    return 0;
    }
    return num1+num2+num3;
    }


    // Ejemplo de buena identacion
    public Integer addNumbersB(Integer num1, Integer num2, Integer num3) {
        if(num1 == null || num2 == null || num3 == null) {
            return 0;
        }

        return num1 + num2 + num3;
    }

    /**
     * En el metodoA se puede apreciar la poca o nula identacion existente, haciendo que el metodo sea muy dificil comprenderlo.
     * Por otro lado en el metodoB, se ve la identacion clara, entendiendo los diferentes niveles de logica que existen y
     * comprendiendo el codigo.
     */
}
