package examplecommandpattern;

public class Main {

     public static void main(String[] args) {

         Luz luzComedor = new Luz("Luz comedor");
         Luz luzHabitacion = new Luz("Luz habitacion");

         //Comandos

         Command encenderLuzHabitacion = new ComandoPrenderLuz(luzHabitacion);
         Command apagarLuzComedor = new ComandoApagarLuz(luzComedor);

         ControlRemoto controlRemoto = new ControlRemoto();
         controlRemoto.setComando(encenderLuzHabitacion);
         controlRemoto.presionarBoton();
         controlRemoto.setComando(apagarLuzComedor);
         controlRemoto.presionarBoton();


    }
}
