package strategy.generic;

public class StrategyAdd implements Strategy {

    public void execute(int a, int b) {
        System.out.println("Executing Strategy A: " + (a + b));
    }




}
