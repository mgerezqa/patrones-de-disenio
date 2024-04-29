package state.document;

public class Persona {
    private String name;
    private Rol rolAsignado;

    public Persona(String name) {
        this.name = name;
        this.rolAsignado = new Autor();
    }

    public Rol getRolAsignado() {
        return rolAsignado;
    }

    public void setRolAsignado(Rol rolAsignado) {
        this.rolAsignado = rolAsignado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + rolAsignado.print();
    }
}
