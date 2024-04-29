package adapter.game;

/*En este modelo Robot es una clase que se agrega posteriormente, la
cual hay que adaptar para que sus metodos attack y dropItem sean
compatibles con el modelo de EnemyTemplate*/

public class Robot {

    public void shoot() {
        System.out.println("Robot shoots");
    }
    public void iceBeam() {
        System.out.println("Robot attacks ice beam");
    }
    public void selfDestruct() {
        System.out.println("Robot self-destructs");
    }

    public void dropRing() {
        System.out.println("Robot drops ring");
    }
}
