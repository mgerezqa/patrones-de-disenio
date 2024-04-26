package domain;


/*Template Method es un patrón de diseño de comportamiento
que define el esqueleto de un algoritmo en la superclase pero
permite que las subclases sobrescriban pasos del algoritmo
sin cambiar su estructura.*/

/*Template Method se basa en la herencia: te permite alterar partes
de un algoritmo extendiendo esas partes en subclases*/

/*Aplicabilidad:
Utiliza el patrón Template Method cuando quieras permitir a
tus clientes que extiendan únicamente pasos particulares de
un algoritmo, pero no todo el algoritmo o su estructura.*/

/*
* El patrón Template Method te permite convertir un algoritmo
monolítico en una serie de pasos individuales que se pueden
extender fácilmente con subclases, manteniendo intacta la estructura
definida en una superclase.*/

public abstract class TemplateMethod {

    public abstract void step1();

    public abstract void step2();

    public abstract void step3();
    public abstract void step4();

    public final void TemplateMethod() {
        // Paso 1
        step1();
        // Paso 2
        step2();
        // Paso 3
        step3();
        // Paso 4
        step4();
    }

}
