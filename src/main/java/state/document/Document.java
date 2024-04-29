package state.document;


/*Imagina que tienes una clase Documento . Un documento puede encontrarse
en uno de estos tres estados: Borrador , Moderación y Publicado .
El método publicar del documento funciona de forma ligeramente distinta en cada estado:
• En Borrador , mueve el documento a moderación.
• En Moderación , hace público el documento, pero sólo si el usuario actual es un administrador.
• En Publicado , no hace nada en absoluto.

Se implementa el patrón State para manejar estos estados.
Con una versión alternativa donde usamos una clase abstracta para gestionar las trasnsiciones
y los estados son subclases que la extienden, para gestionar el rol de un usuario se implementó
una interfaz*/

public class Document {
    private State state;
    private String name;
    private Persona persona;

    public Document(String name, Persona unaPersona) {
        this.name = name;
        this.state = new S_Borrador();
        this.persona = unaPersona;
        //this.persona = new Persona("fulanito");
    }

    public void publish() {

        state.publish(this, persona.getRolAsignado());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + state.print();
    }
}
