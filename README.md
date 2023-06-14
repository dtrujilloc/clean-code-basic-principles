# Principio 2 - Metodos o Funciones

Los metodos o funciones son piezas fundamentesles en nuestro codigo, las cuales deben cumplir con ciertas caracterisiticas para poder se consideradas como funciones de calidad o buenas funciones.

1. Funciones pequeñas: Las funciones deben ser lo suficientemente pequeñas como para tener un unica responsabilidad o proposito.
2. Unico nivel de abstraccion: es importante tener claro cuales son los niveles de abstraccion que manejamos en cada funcion, y respetar la separacion de ellos.
3. Pocos argumentos: las funciones deben recibir pocos argumentos (maximo 3 o 4). si son mas lo ideal es agruparlos en objetos para ser pasados todos al mismo tiempo.
4. Siempre retornar o lanzar excepciones en lugar de codigos de error: Cuando se presenta un error en nuestro codigo, lo ideal es lanzar excepciones propias que permiten suspender el flujo y por ende ser manejas en try - catch. Al lanzar codigos de error no se nos permite suspender el flujo de inmediato y nos obliga a nosotros como programadores tratar estos errores.
