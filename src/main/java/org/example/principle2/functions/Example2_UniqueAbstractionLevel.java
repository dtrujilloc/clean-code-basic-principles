package org.example.principle2.functions;

/**
 * Solo se debe manejar un nivel de abstraccion dentro de la funcion
 */
public class Example2_UniqueAbstractionLevel {
    /**
     * Nota: se les puso una A al final solo para diferenciar las clases del ejemplo que no cumple, con el ejemplo que si cumple
     * el principio. (A-> NO cumple, B -> SI cumple).
     */

    // Ejemplo que NO cumple
    public class PersonA {
        public void drive(CarA car) {
            car.openDoor();
            car.setDriver(this);
            car.getBatteryA().connect();
            car.getEngineA().start();
        }
    }

    public class CarA {
        private BatteryA batteryA;
        private EngineA engineA;
        public void openDoor() {};
        public void setDriver(PersonA driver) {};

        public BatteryA getBatteryA() {
            return batteryA;
        }

        public EngineA getEngineA() {
            return engineA;
        }
    }

    public class BatteryA {
        public void connect() {};
    }

    public class EngineA {
        public void start() {};
    }

    /**
     * Notar que la clase de Person, para manejar un carro tiene que abrir la puerta, seleccionarse como conductor y tiene que conectar
     * una bateria y decirle al motor que encienda, lo cual no cumple con un mismo nivel de abstraccion, ya que el conductor no tiene nada
     * que ver con la bateria y el motor. La persona solo tiene que preocuparse por realizar tareas que le correspondan a el. Lo del motor y
     * la bateria seria mas relacionado al carro.
     */


    // Ejemplo que SI cumple
    public class PersonB {
        public void drive(CarB car) {
            car.openDoor();
            car.setDriver(this);
            car.start();
        }
    }

    public class CarB {
        private BatteryB batteryB;
        private EngineB engineB;

        public void openDoor() {};
        public void setDriver(PersonB driver) {};

        public BatteryB getBatteryB() {
            return batteryB;
        }

        public EngineB getEngineB() {
            return engineB;
        }

        public void start() {
            batteryB.connect();
            engineB.start();
        }
    }

    public class BatteryB {
        public void connect() {};
    }

    public class EngineB {
        public void start() {};
    }

    /**
     * Notar que en este ejemplo que SI cumple, se añadio una funcionalidad al carro la cual es encender, que tiene dentro
     * de ella las tareas de conectar la bateria y conectar el motor para que encienda. Lo cual es correcto ya que la persona
     * o conductor le dira al carro que encienda, que es una tarea del contexto del conductor, y por debajo o en el contexto
     * del carro se realizara las otras tareas.
     *
     * Otro ejemplo tambien es el ejemplo anterior donde al separar las funciones por responsabilidades o tareas, tambien se respeta
     * el contexto, es decir, un contexto para las validaciones, un contexto para las sumatorias y un contexto principal que se encarga
     * de llamar las funciones.
     */
}
