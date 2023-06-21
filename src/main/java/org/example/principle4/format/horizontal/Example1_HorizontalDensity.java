package org.example.principle4.format.horizontal;

/**
 * La densidad horizontal del codigo corresponde a que tan junto esta el codigo horizontalmente, es decir, a que tantos o
 * pocos espacios se utilizan para separar las operaciones horizontales.
 */
public class Example1_HorizontalDensity {

    // Ejemplo de mucha densidad horizontal
    public Integer addNumbersA(Integer num1,Integer num2,Integer num3) {
        if(num1==null||num2==null||num3==null){
            return 0;
        }

        return num1+num2+num3;
    }


    // Ejemplo de poca densidad horizontal
    public Integer addNumbersB(Integer num1, Integer num2, Integer num3) {
        if(num1 == null || num2 == null || num3 == null) {
            return 0;
        }

        return num1 + num2 + num3;
    }

    /**
     * En el metodoA pordemos ver como toto esta muy junto (argumentos, operadores logicos, operadores matematicos), lo cual
     * hace que sea mas dificil a la lectura y comprension. Por otro lado, en el metodoB vemos como se empezaron a utilizar
     * espacios despues de las comas en los argumentos, espacios entre los operadores de comparacion y operadores logicos, y
     * espacios en los operadores matematicos. Esto permite que se vea mejor el codigo y por ende mas facil de entender
     */
}
