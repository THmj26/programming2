package twelve;
import static java.lang.Thread.sleep;

public class SleepyWordPrinter extends WordPrinter {
    // word printer with a nap

    private final int delay;

    public SleepyWordPrinter (String word, int delay) {
        // before printing it sleeps delay milliseconds
        super(word);
        this.delay = delay;
    }

    public void run () {
        try {
            sleep(delay);
            super.run();
        } catch (InterruptedException e) {
            System.out.println("who dares waking " + getName() + " up?!");
        }
    }
}
