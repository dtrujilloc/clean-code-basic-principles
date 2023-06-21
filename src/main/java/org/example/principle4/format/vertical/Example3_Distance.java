package org.example.principle4.format.vertical;

/**
 * La distancia tambien hace referencia a la dencidad, pero lo que se tiene en cuenta aqui, es que no se debe abusar de los
 * espacios entre lineas ya que muchos espacios tambien puede agregar deficultad a la hora de la lectura y comprension
 */
public class Example3_Distance {

    // Recursos para de los ejemplos
    class UserDto {
        private String userName;
        private String password;

        public UserDto(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public UserDto buildUserDto(String userName, String password) {
        return new UserDto(userName, password);
    }

    public boolean isValid(String password) {
        return password.length() > 0 && password.length() <= 10;
    }


    // Ejemplo de mucha distancia
    public boolean createUserA(String userName, String password) {
        boolean isCreated;

        UserDto userDto = buildUserDto(userName, password);

        if (isValid(password)){

            // TODO: crear usuario en BD.

            isCreated = true;

        }
        else {

            // TODO: flujo de error

            isCreated = false;

        }

        return isCreated;
    }


    // Ejemplo de poca distancia
    public boolean createUserB(String userName, String password) {
        boolean isCreated;
        UserDto userDto = buildUserDto(userName, password);

        if (isValid(password)){
            // TODO: crear usuario en BD.
            isCreated = true;
        }
        else {
            // TODO: flujo de error
            isCreated = false;
        }

        return isCreated;
    }

    /**
     * En el ejemplo A, se puede ver que el metodo tiene muchos espacios, lo cual hace dificil la lectura y la comprension,
     * por otro lado, en el ejemplo B vemos como los espacios se utilizan para separa los conceptos o secciones, por ejemplo,
     * al principio del metodo B estan las inicializaciones de variables, en la segunda seccion estan las validaciones, y en
     * la tecera seccion esta el retorno.
     */
}
