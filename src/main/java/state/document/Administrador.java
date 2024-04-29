package state.document;

public class Administrador implements Rol {
    @Override
    public void asignarRol(Persona redactor) {
        redactor.setRolAsignado(this);
    }

    @Override
    public boolean esAdministrador() {
        return true;
    }
    @Override
    public String print() {
        return ": Administrador";
    }


}
