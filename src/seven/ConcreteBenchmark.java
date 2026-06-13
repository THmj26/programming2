package seven;

/**
 * Created by pietrocenciarelli on 17/03/21.
 */
public class ConcreteBenchmark extends Benchmark {

    public ConcreteBenchmark () {
        super(88);
    }

    public void action() { // tics
        System.out.println("tic");
        for (int i = 0; i<10000; i++) {

        }
    }
}