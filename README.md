# Principio 1 - Nombres Significativos

Es importante saber nombrar nuestras clases, atributos, metodos/funciones, etc. Ya que los nombres permitiran saber el contexto y proposito de cada uno de los componenetes que estemos utilizando.

En esta rama podemos entontrar los diferentes aspectos a tener en cuenta para realizar un correcto nombramiento de los componentes y diferentes ejemplos segun cada caso.

Se podran ver ejemplos sobre:

1. Nombres con intencion: Los nombres deben colocarse segun el proposito del componente. Es muy importante que con solo leer el nombre se sepa de inmediato cual es el contexto.
2. No desinformar: Es importante que cuando pongamos un nombre no agreguemos informacion que no sea consecuente con el contexto o proposito. Es decir no agregar informacion que pueda distorcionar el contexto.
3. Nombres pronunciables: En ocaciones se acortan los nombres de los componentes, y esto hace que no se pueda distinguir con claridad el proposito del nombre. Es mejor utilizar un nombre largo pero que sea muy claro, a utilizar un nombre corto que distorcione el contexto.
4. Nombres de clases y metodos/funciones: Para el nombramiento de clases y metodos se debe tener en cuenta diferentes aspectos:
   - Para las clases se pueden utilizar nombres pero que no sean verbos.
   - Para los metodos se utilizan verbos, es decir acciones.
5. Contexto Adicional: Es importante adicionar contexto, cuando sea necesario, esto permitira agregar mayor detalle y poder reconcer mas facilmente el proposito.


# Principio 2 - Metodos o Funciones

Los metodos o funciones son piezas fundamentesles en nuestro codigo, las cuales deben cumplir con ciertas caracterisiticas para poder se consideradas como funciones de calidad o buenas funciones.

1. Funciones pequeñas: Las funciones deben ser lo suficientemente pequeñas como para tener un unica responsabilidad o proposito.
2. Unico nivel de abstraccion: es importante tener claro cuales son los niveles de abstraccion que manejamos en cada funcion, y respetar la separacion de ellos.
3. Pocos argumentos: las funciones deben recibir pocos argumentos (maximo 3 o 4). si son mas lo ideal es agruparlos en objetos para ser pasados todos al mismo tiempo.
4. Siempre retornar o lanzar excepciones en lugar de codigos de error: Cuando se presenta un error en nuestro codigo, lo ideal es lanzar excepciones propias que permiten suspender el flujo y por ende ser manejas en try - catch. Al lanzar codigos de error no se nos permite suspender el flujo de inmediato y nos obliga a nosotros como programadores tratar estos errores.
