package state.generic;
/*
En el patrón State, los estados particulares
pueden conocerse entre sí e iniciar transiciones de
un estado a otro, mientras que las estrategias casi nunca se
conocen*/

/*El patrón State permite que un objeto altere su comportamiento
cuando su estado interno cambia. Parecerá que el objeto ha cambiado
de clase
 */


public class Context {
    private ContextState state;
    private String stateName;

    public Context(String name) {
        //podemos setear a un estado inicial y modificar el constructor para enviar un string
        state = new StateA();
        stateName = name;
    }

    public void next() {
        state.next(this);
    }

    public void print(){
        System.out.println(state.print());
    }

    public  void setState(ContextState newState ) {
        this.state = newState;
    }

    public ContextState getState() {
        return state;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
