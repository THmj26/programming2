package eight;

/**
 * Created by pietrocenciarelli on 22/03/21.
 */
public class TestLocal {

    int attr1 = 7;

    {int attr2 = attr1;} // this is a block, but not a statement!
    // A block is a group of zero or more statements between balanced braces
    // and can be used anywhere a single statement is allowed

    // int attr3 = attr2; // attr2 is out of its scope

    class Inner { // inner class
    }
    public interface request{
        int q();
    }
    public request m () {

        int locavore = 3;

        /* local classes have only access to "effectively final" local variables
         */

        class LocalInner implements request{ // classe locale al metodo m

            public int q() {
                System.out.println(attr1); // ok, access to a member of the enclosing class
                System.out.println(locavore); // ok, y is "effectively final"
                return 42;
            }

        }
//         locavore++; // locavore is not effectively final anymore
//        return new LocalInner().q(); // weirdly enough, this would still be ok if q() were private!

        // what if m() returned an object of *local* type LocalInner!?
        return new LocalInner(); // must change the return type of m()
    }

    public static void main(String[] args) {

        Inner I;
//        LocalInner J; // LocalInner only visible within the body of m()

        System.out.println(new TestLocal().m());
    }
}

