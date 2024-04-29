package adapter.game;

public class TestAdapter {
    public static void main(String[] args) {
        RobotAdapter robot = new RobotAdapter();
        robot.spawn();
        robot.attack();
        robot.die();
        robot.dropItem();
        robot.jump();
    }
}
