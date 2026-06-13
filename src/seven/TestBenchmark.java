package seven;

/**
 * Created by pietrocenciarelli on 17/03/21.
 */
public class TestBenchmark {

    public static void main(String[] args) {
        // inputs an int (testnumber) from args[0]
        // computes the run time of testnumber actions

        int testnumber = Integer.parseInt(args[0]);

        // Benchmark b = new Benchmark(); // NO, cannot create objects of an abstract class!
        long t = new ConcreteBenchmark().runTime(testnumber);
        // note: runTime is inherited from the abstract class while action() is implemented by the concrete
        System.out.println(testnumber + " actions in " + t + " milliseconds");
    }
}
