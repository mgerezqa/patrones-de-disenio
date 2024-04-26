package game;

public class Magician extends EnemyTemplate {

    @Override
    public void spawn() {
    }

    @Override
    public void attack() {
        System.out.println("Magician.attack");
    }

    @Override
    public void die() {
        System.out.println("Magician.die");
    }

    public void dropItem() {
        System.out.println("Magician.ring");

    }

    @Override
    public void jump() {
    }
}
