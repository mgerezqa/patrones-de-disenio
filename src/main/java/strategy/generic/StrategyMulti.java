package strategy.generic;

public class StrategyMulti implements Strategy {

        public void execute(int a, int b) {
            System.out.println("Executing Strategy C: " + (a * b));
        }

}
