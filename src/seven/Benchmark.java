package seven;

/**
 * Created by pietrocenciarelli on 17/03/21.
 */
public abstract class Benchmark {
    // An abstract class. Example from the Arnold/Gosling manual

    public Benchmark(int k) {
        System.out.println(k);
    }

    abstract void action (); // abstract method
    //must have the abstract signature

    public long runTime (int n) { // concrete method
        // computes the run time of n calls to action()

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            action();
        return(System.currentTimeMillis() - start);
    }
}
