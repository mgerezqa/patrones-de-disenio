package state.document;

public class S_Borrador extends State {

    @Override
    void publish(Document document, Rol rol) {
        document.setState(new S_Moderacion());
    }


    @Override
    public String print() {

        return ": Borrador";
    }
}
