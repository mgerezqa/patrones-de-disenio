![img.png](img.png)

1. La Clase Abstracta declara métodos que actúan como pasos
de un algoritmo, así como el propio método plantilla que invoca
estos métodos en un orden específico. Los pasos pueden
declararse abstractos o contar con una implementación por
defecto.
2. **Las Clases Concretas pueden sobrescribir todos los pasos, pero
no el propio método plantilla**.

### Aplicabilidad 

* Utiliza el patrón Template Method cuando quieras permitir a
tus clientes que extiendan únicamente pasos particulares de
un algoritmo, pero no todo el algoritmo o su estructura.    
    
* El patrón Template Method te permite convertir un algoritmo  monolítico en una serie de pasos individuales que se pueden
extender fácilmente con subclases, manteniendo intacta la estructura  definida en una superclase.

* Utiliza el patrón cuando tengas muchas clases que contengan
algoritmos casi idénticos, pero con algunas diferencias mínimas. Como resultado, puede que tengas que modificar todas
las clases cuando el algoritmo cambie.