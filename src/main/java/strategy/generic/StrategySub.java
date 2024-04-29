package strategy.generic;

public class StrategySub implements Strategy {

        public void execute(int a, int b) {
            System.out.println("Executing Strategy B: " + (a - b));
        }
}
