package thirteen.java;

/**
 * Created by pietrocenciarelli on 14/04/21.
 */
public class _2Popper extends Thread {

    private _1ArrayStack stack;

    public _2Popper(_1ArrayStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("omelette!");
        } catch (InterruptedException e) {
            System.out.println("Was sleeping...");
        }
    }
}