package game;

public abstract class EnemyTemplate {

    public abstract void spawn();
    public abstract void attack();
    public abstract void die();
    public abstract void dropItem();
    public abstract void jump();

    public final void TemplateMethod() {
        spawn();
        attack();
        die();
        dropItem();
        jump();
    }
}
