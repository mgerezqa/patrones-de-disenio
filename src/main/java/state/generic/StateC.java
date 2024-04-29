package state.generic;

public class StateC implements ContextState{
    @Override
    public void next(Context context) {
        context.setState(new StateA());
    }

    @Override
    public String print() {
        //imprimir estado C
        return "State C";
    }
}
