package adapter.game;

public interface Enemy {
    void spawn();
    void attack();
    void die();
    void dropItem();
    void jump();
}
