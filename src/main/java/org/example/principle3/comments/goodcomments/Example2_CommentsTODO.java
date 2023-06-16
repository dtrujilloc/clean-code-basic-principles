package org.example.principle3.comments.goodcomments;

/**
 * Los comentarios "TO-DO" me permiten especificar que algo falta por hacer.
 */
public class Example2_CommentsTODO {

    /**
     * 1. Supongamos que nesitamos desarrollar una funcion que va a validar el usario y password de un usuario. pero aun
     * no sabemos que BD se va a utilizar o en que plataforma se va a ir a validar dicha informacion. Lo que se hace es
     * desarrollar el metodo que sabemos que va a realizar dicha funcion y la logica la especificamos con un comentario "TO-DO"
     * para indicar que falta por realizar esa parte.
     */
    public boolean validateUserNameAndPassword(String userName, String password) {
        // TODO: Falta realizar la validacion del userName y password cuando se desarrolle la funcion de validacion
        return true;
    }
}
