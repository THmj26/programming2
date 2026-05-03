package twelve;
/**
 * Created by pietrocenciarelli on 11/04/21.
 */
public class ThreadTest {

    // creates and runs silly useless threads
    // uncomment one bit at a time

    public static void main(String[] args) {

        Thread t0 = new Thread();

         Thread t1 = new WordPrinter("sgnic sgnac");
         Thread t2 = new WordPrinter("snaporaz");

         Thread t3 = new SleepyWordPrinter("sgnic sgnac", 100);
         t3.setName("Sgnic");

         Thread t4 = new SleepyWordPrinter("snaporaz", 10);

         Thread t5 = new CompulsiveWordPrinter("slow", 100);
         Thread t6 = new CompulsiveWordPrinter("fast", 20);

        t0.start();
        // nothing happens: Thread's run() method is empty

         t1.start(); // is the word printed before or after the manin is done? try a few times!
         t2.start(); // can we make sure t3 runs after t2? ...

         t3.start();
         t4.start();

         t3.interrupt(); // will *probably* cause an InterruptedException. PROBABLY?!

         t5.start();
         t6.start();


        try {
            Thread.currentThread().sleep(1000);
        }
        catch (InterruptedException e) {}


         t5.interrupt();
         t6.interrupt();

         Runnable r = () -> System.out.println("ciao!");
         new Thread(r).run(); // constructing threads with runnables. What is the difference?

         Thread t7 = new Thread(() -> {while (true);});
//         t7.start(); // don't!!!

         t7.interrupt(); // does not stop t7! :-(
//         t7.stop(); // don't: deprecated! there are other waysto stop a thread, stay tuned...

        System.out.println("I am main and I'm done");
    }
}
