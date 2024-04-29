package state.generic;

public class StateB implements ContextState{
    @Override
    public void next(Context context) {
        context.setState(new StateC());
    }

    @Override
    public String print() {
        //imprimir estado B
        return "State B";
    }
}
