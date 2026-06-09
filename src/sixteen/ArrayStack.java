package sixteen;

/**
 * Created by pietrocenciarelli on 17/05/22.
 */
public class ArrayStack {

    // usual array implementation of stacks;

    protected int[] stk;

    private int top = -1;

    ArrayStack(int l) {
        stk = new int[l];
    }

    public int lunghezza() {
        return stk.length;
    }

    public void push(int v) throws Exception {

        if (top == stk.length - 1) throw new Exception();
        top = top + 1;
        stk[top] = v;
    }

    public int pop() throws Exception {

        if (top < 0) throw new Exception();
        top = top - 1;
        return stk[top + 1];
    }
}
