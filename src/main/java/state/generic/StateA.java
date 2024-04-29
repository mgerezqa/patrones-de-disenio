package state.generic;

public class StateA implements ContextState {
    @Override
    public void next(Context context) {
        context.setState(new StateB());
    }

    @Override
    public String print() {
        //imprimir estado A
        return "State A";
    }
}
