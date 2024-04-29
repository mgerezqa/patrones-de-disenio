package state.document;

public class S_Moderacion extends State {



    @Override
    public void publish(Document document,Rol rol) {
         if(rol.esAdministrador()){
            document.setState(new S_Publicado());
        }
    }

    @Override
    public String print() {
        return ": Moderacion";
    }
}
