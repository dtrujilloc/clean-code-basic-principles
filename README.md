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


# Principio 3 - Comentarios

Los comentarios son importantes para ayudar a describir el codigo o agregar contexto. Pero tambien es importante no abusar de ellos ya que un codigo que respete los principios anteriores es un codigo que facilmente puede describirse por si solo. Entonces, segun el comentario y el contexto, pueden ser comentarioS buenos o malos. A continuacion algunos ejemplos:

- Comentarios malos:
   1. Comentarios obvios: Cuando se utililzan comentarios para describir una seccion del codigo que no es necesario, ya que el codigo se describe claramente por si solo.
   2. Codigo Comentado: cuando se tienen bloques de codigo comentado porque se piensa que se puede utilizar mas adelante. Esto es erroneo, ya que inicialmente se esta ensuciando el codigo y ademas si se llega a necesitar esa seccion de codigo se puede buscar gracias al software de versionamiento que se este utilizando.
- Comentarios buenos:
   1. Informacion importante: Es fundamental reconocer esas lineas de codigo que se consideran importantes para un comentario ya que llenar de comentarios por todo lado ensucia mucho el codigo. Un ejemplo claro de estas lineas importantes son las expresiones regulares.
   2. Comentarios TODO: Este tipo de comentarios permiten describir los puntos donde hace falta hacer algun desarrollo o modificacion.

Los JavaDoc son otro tipo de comentarios que desde mi opinion no es posible categorizarlos ya que depende del uso puede ser malos o buenos comentarios. Esto debido a que cuando se documenta una aplicacion con JavaDoc, se tiene una documentacion clara tanto de las clases, metodos, argumentos, retornos, excepciones y demas que contiene la API. Esto puede ser de mucha ayuda cuando estamos utilizando de otros, ya que no esta nada mal que tengamos una documentacion que describa todo esto. Ahora, de nada nos sirve realizar una documentacion, y cuando se modifique/refactorice/cambie las funciones no se haga lo mismo con la documentacion pertinente, esto hace que los comentarios queden desactualizados y por ende no aporten la informacion correcta, en este punto se vuelve un comentario malo.

Es importante tener la costumbre de documentar lo realmente necesario e importante y sobre todo tener la responsabilidad de mantenelo actualizado los comentarios junto con el codigo.

NOTA: EN TODO ESTE REPOSITORIO SE HIZO USO DE LOS COMENTARIOS PARA DESCRIBIR EL FLUJO DE CADA UNO DE LOS EJEMPLOS, LO CUAL NO ES UNA PRACTICA RECOMENDADA EN EL AMBITO LABORAL, YA QUE COMO SE HA REPETIDO VARIAS VECES EN LOS EJEMPLOS, UN CODIGO CON BUENAS PRACTICAS ES CAPAZ DE DESCRIBIRSE POR SI SOLO EN SU MAYORIA.

CABE RESALTAR QUE SE HIZO CON PROPOSITOS DESCRIPTIVOS Y DE MEJOR COMPRENSION PARA PODER LOGRAR EL OBJETIVO DE MOSTRAR Y DESCRIBIR CADA UNO DE LOS EJEMPLOS DE CODIGO LIMPIO QUE SE VAN TRATANDO EN CADA UNA DE LAS CLASES.