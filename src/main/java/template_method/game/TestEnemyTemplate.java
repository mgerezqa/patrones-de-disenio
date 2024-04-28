package template_method.game;

public class  TestEnemyTemplate {
public static void main(String[] args) {
        EnemyTemplate enemy = new Soldier();
        enemy.TemplateMethod();
        EnemyTemplate enemyMagician = new Magician();
        enemyMagician.TemplateMethod();

    }

}
