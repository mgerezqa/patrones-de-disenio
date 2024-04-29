package adapter.game;

public class RobotAdapter implements Enemy {
    private Robot robot;

    public RobotAdapter() {
        this.robot = new Robot(); // El constructor de RobotAdapter declara un objeto de tipo Robot
    }

    @Override
    public void dropItem() {
        int value = (int) (Math.random()*10);
        if (value % 2 == 0) {
            robot.dropRing();
        } else {
            System.out.println("Robot cannot drop items");
        }
    }

    @Override
    public void attack() {
        int value = (int) (Math.random()*10);
        if (value % 2 == 0) {
            robot.iceBeam();
        } else {
            robot.shoot();
        }
    }

    @Override
    public void die() {
        robot.selfDestruct();
    }

    @Override
    public void jump() {
    }

    @Override
    public void spawn() {
    }



}
