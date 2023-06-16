package org.example.principle3.comments.badcomments;

import java.util.Date;

/**
 * Los comentarios obvios son considerados malos comentarios ya que no aportan nada al codigo
 */
public class Example1_ObviousComments {

    /**
     * 1. Cuando agregamos comentarios a los atributos, es una mala practica, ya que como vimos anteriomente los nombres
     * deben ser lo suficientemente descriptivos como para poder otorgar un contexto claro. Veamos algunos ejemplos:
     */
    private String date; //The date as string

    //------------------------------------------------------------------------------------------------------------------

    /**
     * 2. cuando agregamos comentarios en secciones de codigo que no son criticas, puede significar que no aplicado los
     * suficientes principios de clean code como para evitar tal comentario.
     *
     * Por ejemplo supongamos que tenemos un metodo de login que recibe el usuario y el password el cual tiene que ser validado
     */
    public void loginA(String username, String password) {

        // Check if password is secure
        if (password != null && password.length() > 9 && !password.contains(username)) {

        }
    }

    /**
     * Notar como en el ejemplo anterior existe un comentario que especifica el proposito del condicional, lo cual, podria
     * evitarse si se hace lo sigiente.
     */
    public void loginB(String username, String password) {

        if (isSecurePassword(username, password)) {

        }
    }

    public boolean isSecurePassword(String username, String password) {
        return password != null && password.length() > 9 && !password.contains(username);
    }

    /**
     * Notar que con el simple hecho de crear una funcion que se encargue de validar si el password es seguro nos evitamos
     * comentar nuestro codigo y tambien respetamos otros principisio como funciones pequeñas, responsabilidad unica, niveles
     * de abstraccion separados.
     */
}
