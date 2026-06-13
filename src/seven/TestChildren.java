package seven;

/**
 * Created by pietrocenciarelli on 17/03/21.
 */
public class TestChildren {
    public static void main(String[] args) {
        // plays with children

        MyChild eve = new MyChild();
        MyChild adam = new MyChild();

        eve.whoAmI();
        adam.whoAmI();
        new MyChild().whoAmI();
    }
}
