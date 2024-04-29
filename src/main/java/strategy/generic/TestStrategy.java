package strategy.generic;

public class TestStrategy {

        public static void main(String[] args) {
            Context strategyTest = new Context(10,5);

            strategyTest.executeStrategy(new StrategyAdd());
            strategyTest.executeStrategy(new StrategySub());
            strategyTest.executeStrategy(new StrategyMulti());



        }
}
