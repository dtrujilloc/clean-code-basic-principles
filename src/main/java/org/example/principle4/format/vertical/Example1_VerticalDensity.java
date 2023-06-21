package org.example.principle4.format.vertical;

/**
 * La densidad vertical consta de la cantidad de lineas agrupadas (sin espacios) que hay verticalmente. Esto lo que ocasiona
 * es que la lectura del codigo sea muy complicada por los programadores, por lo que es recomendable tener espacios entre conceptos
 * dentro de la clase
 */

// Ejemplo de mucha densidad
class UserA {
    private String name;
    private String lastName;
    public UserA(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


// Ejemplo de poca densidad
class UserB {
    private String name;
    private String lastName;

    public UserB(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

/**
 * Como vemos en los ejemplos anteriores, vemos que en segundo ejemplo, tenemos espacios entre los atributos y los metodos
 * lo que permite leer e interpretar el codigo mucho mas facil, ya que de inmediato se ven las limitaciones entre secciones.
 */




