package domain;

public class TestTemplateMethod {
    public static void main(String[] args) {
        TemplateMethod template = new ConcreteTemplate(); // observar como se instancia una clase perteneciente a una clase abstracta.
        template.TemplateMethod();
    }
}
