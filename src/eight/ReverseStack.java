package eight;

import three.EmptyStackException;

/**
 * Created by pietrocenciarelli on 21/03/21.
 */
public class ReverseStack {

    public static void reverse (Stack s) throws EmptyStackException {

        ListStack tmp1 = new ListStack();
        ListStack tmp2 = new ListStack();
        Stack.dump(s, tmp1);
        Stack.dump(tmp1, tmp2);
        Stack.dump(tmp2, s);
    }

    public static void main(String[] args) throws EmptyStackException {
        /* tests reverse on two different Stack implementations */

        Stack SL = new ListStack();
        Stack SA = new ArrayStack();

        SL.push(7);
        SL.push(9);
        SL.push(42);
        SL.printStack();
        reverse(SL);
        SL.printStack();

        SA.push(55);
        SA.push(44);
        SA.printStack();
        reverse(SA);
        SA.printStack();
    }
}
