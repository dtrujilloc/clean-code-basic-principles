package org.example.principle4.format.vertical;

/**
 * El orden vertical hace referencia a que no es lo mismo tener cualquier orden a que los metodos que estan relacionados
 * esten juntos
 */

//Ejemplo de clase sin orden
class ServiceA {

    public void methodA() {

    }

    public void methodB() {
        methodA();
        methodC();
    }

    public void methodC() {

    }

    public void methodD() {

    }
}


// Ejempolo de clase con orden
class ServiceB {

    public void methodB() {
        methodA();
        methodC();
    }

    public void methodA() {

    }

    public void methodC() {

    }

    public void methodD() {

    }
}

/**
 * Como vimos en el ejemplo de ServiceA, no se tiene un orden en los metodos, ya que los metodos que estan relacionados deben
 * ir juntos de tal forma que los metodos que son utilizados dentro de otro metodo, esten debajo. Tal cual como se ve en el
 * ejemplo de ServiceB, que los metodo B, A y C estan agrupados o juntos ya que los metodos A y C son utilizados dentro del
 * metodo B.
 */