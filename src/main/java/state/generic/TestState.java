package state.generic;

public class TestState {
    public static void main(String[] args) {

        Context context = new Context("Example State");
        context.print();
        context.next();
        context.print();
        context.next();
        context.print();
    }
}
