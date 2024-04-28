package template_method.game;

public class Soldier  extends EnemyTemplate{

    @Override
    public void spawn() {
        System.out.println("Soldier.spawn");
    }

    @Override
    public void attack() {
        System.out.println("Soldier.attack");
    }

    @Override
    public void die() {
        System.out.println("Soldier.die");
    }

    public void dropItem(){}

    @Override
    public void jump() {
        System.out.println("Soldier.jump");
    }
}
