package state.document;

public abstract class State {
    abstract void publish(Document document,Rol rol);//el que cambia de estado al documento
    abstract String print();

}
