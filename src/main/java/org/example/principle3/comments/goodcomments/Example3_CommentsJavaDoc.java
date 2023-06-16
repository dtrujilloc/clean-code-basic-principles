package org.example.principle3.comments.goodcomments;

/**
 * Los comentarios de Java Doc son importatenes para describir aun mas las caracteridisticas de cad funcion, y aun mas cuando
 * estamos desarrollando una API que va a ser publica.
 */
public class Example3_CommentsJavaDoc {

    /**
     * Metodo que permite realizar el login de la aplicacion
     * @param userName String que representa el nombre de usuario para el login
     * @param password String que represneta la contraseña para el login
     * @return un true en caso de exito y false en caso de fallo.
     * @throws Exception Excepcion que puede ser lanzada cuando el nombre de usuario no se encuentra registrado en la BD
     */
    public boolean login(String userName, String password) throws Exception {
        return true;
    }


    /**
     * Como vemos anteriormente, tenemos una funcion que permite realizar el login, y ademas tenemos un comentario que permite
     * especifricar y detallar aun mas cada uno de los componentes de esta funcion.
     *
     * Es importante tener en cuenta que estos comentarios tienen que ser modificados cuando la funcion o metodo se actualice ya que si no
     * se hace se tendria un comentario fuera de contexto a la funcion. Es muy importante refactorizar las funciones con sus comentarios.
     */
}
