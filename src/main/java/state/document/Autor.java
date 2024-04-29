package state.document;

public class Autor implements Rol {

    @Override
    public void asignarRol(Persona redactor) {
        redactor.setRolAsignado(this);
    }

    @Override
    public boolean esAdministrador() {
        return false;
    }

    @Override
    public String print() {
        return ": Invitado";
    }

}
