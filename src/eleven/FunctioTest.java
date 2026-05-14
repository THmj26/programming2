package eleven;

/**
 * Created by pietrocenciarelli on 07/04/21.
 */
public class FunctioTest {
    /*
    two lambda instances of functional interface Functio; in both
    cases the context allows inferring the type of the expressions.
    Notice: lambda expressions denote objects of anonymous classes
    but they are not created by a new statement!
    */

    public static Functio F = (String s) -> (s + s);
    public static Functio F1 = (s) -> s; // the String type of s is inferred by the compiler

    public static void context (Functio x) {
        System.out.println(x.compute("fourtytwo"));
    }

    public static void main(String[] args) {
        System.out.println(F.compute("seven")); // what does it print?
        context((String s) -> "hundred"); // what does it print?
    }
}
