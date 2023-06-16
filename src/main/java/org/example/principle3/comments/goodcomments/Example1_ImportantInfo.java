package org.example.principle3.comments.goodcomments;

import java.util.regex.Pattern;

/**
 * Es valido adicionar lineas de comentarios siempre y cuando este comentario aporte mucha inforamcion al contexto.
 */
public class Example1_ImportantInfo {

    /**
     * 1. Un ejemplo claro es cuando tenemos alguna expresion regular. Para nadie es un secreto que las expresiones regulares
     * pueden llegar a ser bastante dificiles de enterderlas. Este seria un excelente lugar donde agregar un
     * comentario con algun ejemplo de caso de exito de la expresion para dar mayor claridad sobre la expresion.
     */
    private boolean isValidFormatDate(String date) {
        // Ejemplo de formato que coincida con la expresion -> 17-01-2023 18:03:45
        boolean isValid = Pattern.matches("(\\d{2})-(\\d{2})-(\\d{4}) (\\d{2}):(\\d{2}):(\\d{2})",date);

        return isValid;
    }

}
