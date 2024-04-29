package adapter.game;

public class Warrior implements Enemy{
    @Override
    public void spawn() {
        System.out.println("Warrior has spawned");
    }

    @Override
    public void attack() {
        System.out.println("Warrior is attacking");
    }

    @Override
    public void die() {
        System.out.println("Warrior has died");
    }

    @Override
    public void dropItem() {
        System.out.println("Warrior has dropped an item");
    }

    @Override
    public void jump() {
        System.out.println("Warrior is jumping");
    }
}
