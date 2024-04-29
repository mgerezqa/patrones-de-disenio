package state.document;

public class S_Publicado extends State {

    @Override
    public void publish(Document document,Rol rol) {
        return;
    }

    @Override
    public String print() {
        return ": Publicado";
    }
}
