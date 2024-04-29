![img_2.png](img_2.png)

1. La clase Contexto mantiene una referencia a una de las estrategias
   concretas y se comunica con este objeto únicamente a
   través de la interfaz estrategia.

2. La interfaz Estrategia es común a todas las estrategias concretas.
   Declara un método que la clase contexto utiliza para ejecutar
   una estrategia.

3. Las Estrategias Concretas implementan distintas variaciones
   de un algoritmo que la clase contexto utiliza.

4. La clase contexto invoca el método de ejecución en el objeto
   de estrategia vinculado cada vez que necesita ejecutar el algoritmo.
   La clase contexto no sabe con qué tipo de estrategia
   funciona o cómo se ejecuta el algoritmo.

5. El Cliente crea un objeto de estrategia específico y lo pasa a
   la clase contexto. La clase contexto expone un modificador set
   que permite a los clientes sustituir la estrategia asociada al contexto
   durante el tiempo de ejecución.

### Aplicabilidad

*  Utiliza el patrón Strategy cuando quieras utiliza distintas variantes
de un algoritmo dentro de un objeto y poder cambiar
de un algoritmo a otro durante el tiempo de ejecución.
* El patrón Strategy te permite alterar indirectamente el comportamiento
  del objeto durante el tiempo de ejecución asociándolo con distintos subobjetos que pueden realizar subtareas
  específicas de distintas maneras.
* Utiliza el patrón Strategy cuando tengas muchas clases similares
  que sólo se diferencien en la forma en que ejecutan cierto
  comportamiento.
* El patrón Strategy te permite extraer el comportamiento variante
  para ponerlo en una jerarquía de clases separada y combinar
  las clases originales en una, reduciendo con ello el código
  duplicado.
* Utiliza el patrón para aislar la lógica de negocio de una clase,
  de los detalles de implementación de algoritmos que pueden
  no ser tan importantes en el contexto de esa lógica.
* El patrón Strategy te permite aislar el código, los datos internos
  y las dependencias de varios algoritmos, del resto del código.
  Los diversos clientes obtienen una interfaz simple para
  ejecutar los algoritmos y cambiarlos durante el tiempo de
  ejecución.
* Utiliza el patrón cuando tu clase tenga un enorme operador
  condicional que cambie entre distintas variantes del mismo
  algoritmo.
* El patrón Strategy te permite suprimir dicho condicional extrayendo
  todos los algoritmos para ponerlos en clases separadas,las cuales implementan la misma interfaz. El objeto original
  delega la ejecución a uno de esos objetos, en lugar de implementar todas las variantes del algoritmo.