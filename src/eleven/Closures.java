package eleven;

public class Closures {
    // What is a closure?

    static int i;

    public static void main(String[] args) {

        i = 0;
        Runnable R0 = () -> System.out.println(i);

        i = 1;
        Runnable R1 = () -> System.out.println(i);

        i= 2;
        R0.run();
        R1.run();
        // what does it print?
    }
}
