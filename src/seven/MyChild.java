package seven;

/**
 * Created by pietrocenciarelli on 17/03/21.
 */
public class MyChild {
    // static fields

    public static int CHILDREN = 0; // gets incremented every time a new child is born
    private int name;

    public MyChild() {
        name = ++CHILDREN; // a child's name is its position in the order of birth
    }

    public void whoAmI () { // dichiara l'identita' di this
        System.out.println("I am " + name);
    }
}