package adapter.game;

public class Orco implements Enemy {
    @Override
    public void spawn() {
        System.out.println("Orco has spawned");
    }

    @Override
    public void attack() {
        System.out.println("Orco is attacking");
    }

    @Override
    public void die() {
        System.out.println("Orco has died");
    }

    @Override
    public void dropItem() {
        System.out.println("Orco has dropped an item");
    }

    @Override
    public void jump() {
        System.out.println("Orco is jumping");
    }
}
