package org.example.principle2.functions;

/**
 * Las funciones deben recibir pocos argumentos, maximo 3 argumentos.
 */
public class Example3_FewArguments {
    // Ejemplos que NO cumple
    public void createUser(String userName, String password, String firstName, String lastName, String address) {};

    /**
     * Notar que para crear un usuario se le tienen que pasar todos los argumentos por separado, esto hace que tengamos una funcion
     * con demasiado argumentos
     */

    // Ejemplo que SI cumple
    public class UserDto {
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private String address;
    }

    public void createUser(UserDto userDto) {};

    /**
     * Notar que en el ejemplo que si cumple se crea una clase adicional para condensar todos esos atributos en un objeto y en la funcion
     * solo pasar este objeto como unico argumento.
     */
}
