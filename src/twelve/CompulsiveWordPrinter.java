package twelve;

public class CompulsiveWordPrinter extends Thread {
    // sleeps and prints forever!

    int delay;

    public CompulsiveWordPrinter(String name, int delay) {
        super(name); // sets the thread's name
        this.delay = delay;
    }

    public void run () {
        try {
            while (true) {
                sleep(delay);
                System.out.println(getName());
            }
        }
        catch (InterruptedException e) {
            System.out.println("who dares wake " + getName() + " up?!");
        }
    }
}
