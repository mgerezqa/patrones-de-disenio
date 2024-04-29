package state.document;

public interface Rol {

    void asignarRol(Persona user);
    String print();
    boolean esAdministrador();
}
