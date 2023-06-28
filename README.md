# Principio 5 - Gestion De Errores

La gestion de errores es otro principio al cual se le debe dar la importancia que se merece ya que es el metodo por el cual se puede hacer un manejo adecuado de los errores, lo cual nos permitira tener codigo de mejor calidad.
1. Siempre retornar o lanzar excepciones: Tambien fue visto en el principio de funciones, y basicamente consiste en siempre retornar excepciones cuando ocurra un error y no devolver codigo de error, ya que devolver excepciones es la forma idonea de interrumpir el flujo e indicar que ocurrio un error. Ademas de que permitira tener un codigo mucho mas entendible.
2. Lanzar Excepciones Unchecked: Existen dos tipos de excepciones propias, las que extienden de la clase Exception (consideradas Checked Exceptions) y las que extienden de RuntimeException (consideradas Unchecked Exception). Las Checked exception son excepciones que necesitan ser encapsuladas o tratadas para poder compilar el codigo o de lo contrario generaran un error, las excepciones unckecked no necesitas ser tratadas para la compilacion del codigo. Es por esto que es mejor utilizar excepciones unchecked, ademas de que permiten tener un codigo mas limpio y sin tanto codigo basura.
3. No Retornar null: Cuando se esten contruyendo funciones, nunca se debe retornar null ya que este valor podria generar excepciones como nullPointerException si no se trata correctamente el valor null, ademas que si se tiene un funcion null se tiene que estar haciendo validaciones por todo el codigo para evitar tales errores. Esto tambien aplica con pasar parametros null.

