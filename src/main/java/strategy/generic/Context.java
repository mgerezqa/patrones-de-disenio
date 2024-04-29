package strategy.generic;

/*Strategy es un patrón de diseño de comportamiento que te permite
definir una familia de algoritmos, colocar cada uno de
ellos en una clase separada y hacer sus objetos intercambiables.
Resumen: Se crean clases para definir estrategias o algoritmos.

Utiliza el patrón Strategy cuando quieras utiliza distintas variantes
de un algoritmo dentro de un objeto y poder cambiar
de un algoritmo a otro durante el tiempo de ejecución.
*/

public class Context {

    public Context(int a, int b) {
        this.n1 = a;
        this.n2 = b;
        this.strategy = new StrategyAdd();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    private Strategy strategy;
    private int n1, n2;


    public void executeStrategy(Strategy strategy){
        strategy.execute(n1,n2);
    }



}
