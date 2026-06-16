package thirteen.java;

/**
 * Created by pietrocenciarelli on 14/04/21.
 */
public class _3AMess {
    /*
    Two threads pop over a Stack. If they do not synchronize
    (see _1ArrayStack) they may extract the same element, and one
    element may be lost!
    */

    public static void main(String[] args) throws EmptyStackException, InterruptedException, FullStackException {

        _1ArrayStack S = new _1ArrayStack(10);

        _2Popper p1 = new _2Popper(S);
        p1.setName("Snapo");

        _2Popper p2 = new _2Popper(S);
        p2.setName("Raz");

        S.push(33);
        S.push(42);

        p1.start();
        p2.start();

         Thread.sleep(500);
         S.pop();
    }
}