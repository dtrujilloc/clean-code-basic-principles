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


# Principio 4 - Formato

El formato a la hora de codificar es un tema muy importante a tener en cuenta ya que permite escribir codigo mucho mas entendible y mantenible en el tiempo, aun mas cuando se trabaja en un equipo de desarrollo donde se debe estar revisando, cambiando y modificando constantemente el codigo porpio y de algun compañero. Entonces, es necesario tener en cuenta varios factores para mantener un formato acorde.

1. Formato Horizontal: Este formato es el que se tiene en cuenta en cada linea de codigo. (horizontalmente)
   - Densidad: La densidad hace referencia a que tan junto se encuentra el codigo. Entre mas junto, mas denso y por ende mucho mas dificil de comprender. es por esto que es importante agregar espacios para mantener un codigo mucho mas legible y entendible. Estos espacio pueden utilizarse entre los operadores de comparacion, operadores logicos, operadores matematicos, entre argumentos.
   Es importante tener en cuenta que cuando la lineas de codigo son muy largas, es conveniente poner un salto de linea para evitar hacer scroll cuando se este leyendo el codigo.
   - Identacion: La identacion permite reconocer los diferentes niveles de logica y bloques de logica que se tienen en el codigo.
2. Formato Vertical: Este formato es el que se tienen en cuenta a nivel de clases o metodos. (verticalmente)
   - Densidad: al igual que la densidad horizontal, la desidad veritical hace referencia a que tan junto esta el codigo verticalmente. Es importante agregar espacios entre los metodos para poder diferencias el inicio y fin de cada uno y dar claridad en la lectura del codigo.
   - Distancia: va muy ligado a la densidad, ya que hace refencia a no abusar de la cantidad de espacios a utilizar, ya que agregar muchos espacio tambien dificulta la lectura. Es recomendable agregar espacio para seprar conceptos, por ejemplo en los metodos es importante separar la seccion o concepto de inicializacion de variables con la seccion de logica y seccion de retorno.
   - Orden: Cuando tenemos multiples metodos que se anidan, es importante tener juntos los metodos que se relacion. Esto con el proposito de cuando se este leyedo  o modificando los metodos se tenga acceso mucho mas rapido a los metodos que estan relacionados.

# Principio 5 - Gestion De Errores

La gestion de errores es otro principio al cual se le debe dar la importancia que se merece ya que es el metodo por el cual se puede hacer un manejo adecuado de los errores, lo cual nos permitira tener codigo de mejor calidad.
1. Siempre retornar o lanzar excepciones: Tambien fue visto en el principio de funciones, y basicamente consiste en siempre retornar excepciones cuando ocurra un error y no devolver codigo de error, ya que devolver excepciones es la forma idonea de interrumpir el flujo e indicar que ocurrio un error. Ademas de que permitira tener un codigo mucho mas entendible.
2. Lanzar Excepciones Unchecked: Existen dos tipos de excepciones propias, las que extienden de la clase Exception (consideradas Checked Exceptions) y las que extienden de RuntimeException (consideradas Unchecked Exception). Las Checked exception son excepciones que necesitan ser encapsuladas o tratadas para poder compilar el codigo o de lo contrario generaran un error, las excepciones unckecked no necesitas ser tratadas para la compilacion del codigo. Es por esto que es mejor utilizar excepciones unchecked, ademas de que permiten tener un codigo mas limpio y sin tanto codigo basura.
3. No Retornar null: Cuando se esten contruyendo funciones, nunca se debe retornar null ya que este valor podria generar excepciones como nullPointerException si no se trata correctamente el valor null, ademas que si se tiene un funcion null se tiene que estar haciendo validaciones por todo el codigo para evitar tales errores. Esto tambien aplica con pasar parametros null.

# Principio 6 - Test Unitarios

Los test unitarios tienen gran importancia en el desarrollo de software ya que:
1. Permiten testear nuestro codigo en cuanto a probar y corroborar la funcionalidad.
2. Permite realizar un proceso de refactorizacion de codigo seguro, ya que las prueas unitarias prueban el resultado de una funcionalidad, entonces si se refactoriza "el como" se hace dicha funcioalidad, al final del proceso de refactorizacion debe ser el mismo resultado y por ende pasar mi prueba unitaria.
3. Permiten mostrar el porcentaje de cobertura de codigo, es decir la cantidad de codigo que esta probado por las pruebas unitarias. Este porcentaje es un valor que cada uno puede estipular dentro de los equipos, pero es recomendable tener un procentaje de cobertura mayor o igual al 80%.

Los test unitarios no solo nos permiten probar nuestro codigo si no que nos permiten escribir codigo mucho mas limpio y coherente con la funcionalidad que deseamos desarrollar, incluso existe una metodologia de desarrollo la cual esta basada en Test Unitarios, esta se llama Test Driven Development o TDD, esta metodologia me permite escribir codigo a partir de las pruebas unitarias. Veremos en otra seccion a mas detalle esta metodologia.
