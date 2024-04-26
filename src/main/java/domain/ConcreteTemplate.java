package domain;

public class ConcreteTemplate extends TemplateMethod{

        @Override
        public void step1() {
            System.out.println("ConcreteTemplate.step1");
        }

        @Override
        public void step2() {
            System.out.println("ConcreteTemplate.step2");
        }

        @Override
        public void step3() {
            System.out.println("ConcreteTemplate.step3");
        }

        @Override
        public void step4() {
            System.out.println("ConcreteTemplate.step4");
        }
}
